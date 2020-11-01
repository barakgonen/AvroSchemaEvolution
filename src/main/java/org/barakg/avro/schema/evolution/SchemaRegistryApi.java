package org.barakg.avro.schema.evolution;

import okhttp3.*;
import org.apache.avro.Schema;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


import static org.barakg.avro.schema.evolution.Constants.*;

public class SchemaRegistryApi {

    private static OkHttpClient client;
    private static MediaType JSON;
    private static SchemaRegistryApi api;

    private SchemaRegistryApi() {
        client = new OkHttpClient();
        JSON = MediaType.parse("application/vnd.schemaregistry.v1+json");
    }

    public static SchemaRegistryApi getInstance() {
        if (api == null)
            api = new SchemaRegistryApi();
        return api;
    }

    // code request code here
    public CompatibilityLevel getCurrentCompatibilityLevel() throws IOException {
        Request request = new Request.Builder()
                .url(SCHEMA_REGISTRY_CONFIG_ENDPOINT)
                .build();

        Response response = client.newCall(request).execute();
        return CompatibilityLevel.valueOf(extractCompatibilityLevel(response.body().string()));
    }

    private String extractCompatibilityLevel(String responseAsJson) {
        JSONObject obj = new JSONObject(responseAsJson);
        return obj.getString("compatibilityLevel");
    }

    public String setCurrentCompatibilityLevel(CompatibilityLevel compatibilityLevel) throws IOException {
        Request request = new Request.Builder()
                .header("Accept", "application/vnd.schemaregistry.v1+json")
                .url(SCHEMA_REGISTRY_CONFIG_ENDPOINT)
                .put(parseSchemaRegistryCompatibilityLevelRequestBody(compatibilityLevel))
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    private RequestBody parseSchemaRegistryCompatibilityLevelRequestBody(CompatibilityLevel compatibilityLevel) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("compatibility", compatibilityLevel);
        return RequestBody.create(jsonObject.toString(), JSON);
    }

    public boolean deleteSchemaByVersion(String schemaName, int schemaVersion) {
        Request request = new Request.Builder()
                .header("Content-Type", "application/vnd.schemaregistry.v1+json")
                .url(SCHEMA_REGISTRY_SUBJECTS_ENDPOINT + "/" + schemaName + "/versions/" + schemaVersion)
                .delete()
                .build();
        boolean responseStr = false;
        try {
            Response response = client.newCall(request).execute();
            responseStr = response.body().string().equals("");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Collection<Integer> getAllSchemaVersionsByName(String schemaName) {
        Collection<Integer> lst = Arrays.asList();

        Request request = new Request.Builder()
                .header("Content-Type", "application/vnd.schemaregistry.v1+json")
                .url(SCHEMA_REGISTRY_SUBJECTS_ENDPOINT + "/" + schemaName + "/versions/")
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            lst = parseResponseToVersionsCollection(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lst;
    }

    private List<Integer> parseResponseToVersionsCollection(String response) {
        List<String> schemaVersionsAsListOfStrings = Arrays.asList(response.substring(1, response.length() - 1).split(","));
        return schemaVersionsAsListOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());
    }

    public boolean resgisterSchemaOrUpdateSchema(Schema schema) {
        Request request = new Request.Builder()
                .header("Content-Type", "application/vnd.schemaregistry.v1+json")
                .url(SCHEMA_REGISTRY_SUBJECTS_ENDPOINT + "/" + schema.getName() + "/versions")
                .post(parseSchemaFromString(schema.toString()))
                .build();
        boolean responseStr = false;
        try {
            Response response = client.newCall(request).execute();
            responseStr = response.code() == 200;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseStr;
    }

    public Optional<Integer> getSchemaVersion(Schema schema) {
        Request request = new Request.Builder()
                .url(SCHEMA_REGISTRY_SUBJECTS_ENDPOINT + "/" + schema.getName() + "/versions")
                .build();
        Optional<Integer> schemaVersion = Optional.empty();
        try {
            Response response = client.newCall(request).execute();
            schemaVersion = parseSchemaVersionFromResponse(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return schemaVersion;
    }

    private Optional<Integer> parseSchemaVersionFromResponse(String responseAsString) {
        try {
            JSONObject jsonObject = new JSONObject(responseAsString);
            if (jsonObject.has("error_code"))
                return Optional.empty();
        } catch (JSONException | NoSuchElementException e) {
            Integer version = Math.toIntExact(responseAsString.chars().filter(i -> i == ',').count() + 1);
            return Optional.of(version);
        }
        return Optional.empty();
    }

    private static RequestBody parseSchemaFromString(String schemaAsString) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("schema", schemaAsString);
        return RequestBody.create(jsonObject.toString(), JSON);
    }

    public static boolean isCompatibleWithLatestSchemaVersion(Schema schema){
        Request request = new Request.Builder()
                .header("Content-Type", "application/vnd.schemaregistry.v1+json")
                .url(SCHEMA_REGISTRY_COMPATIBILITY_ENDPOINT + "/" + schema.getName() + "/versions/latest")
                .post(parseSchemaFromString(schema.toString()))
                .build();
        boolean responseStr = false;
        try {
            Response response = client.newCall(request).execute();
            responseStr = parseCompitabilityResponse(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseStr;
    }

    private static boolean parseCompitabilityResponse(String responseStr){
        JSONObject jsonObject = new JSONObject(responseStr);
        if (jsonObject.has("is_compatible"))
            return jsonObject.get("is_compatible").toString().equals("true");
        else if (jsonObject.has("error_code"))
            return false;
        return false;
    }

    /*
    curl -X POST -H "Content-Type: application/vnd.schemaregistry.v1+json" \
  --data '{"schema": "{\"type\": \"string\"}"}' \
  http://localhost:8081/compatibility/subjects/Kafka-value/versions/latest
     */
}