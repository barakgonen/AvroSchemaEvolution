package org.barakg.avro.schema.evolution;

import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;

import static org.barakg.avro.schema.evolution.Constants.SCHEMA_REGISTRY_CONFIG_ENDPOINT;

public class SchemaRegistryApi {

    private static OkHttpClient client;
    private static MediaType JSON;
    private static SchemaRegistryApi api;

    private SchemaRegistryApi(){
        client = new OkHttpClient();
        JSON = MediaType.parse("application/vnd.schemaregistry.v1+json");
    }

    public static SchemaRegistryApi getInstance(){
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

    private String extractCompatibilityLevel(String responseAsJson){
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

    private RequestBody parseSchemaRegistryCompatibilityLevelRequestBody(CompatibilityLevel compatibilityLevel){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("compatibility", compatibilityLevel);
        return RequestBody.create(jsonObject.toString(), JSON);
    }
}
