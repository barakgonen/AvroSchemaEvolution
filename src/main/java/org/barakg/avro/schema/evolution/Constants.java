package org.barakg.avro.schema.evolution;

public final class Constants {
    public static final String SCHEMA_REGISTRY_ADDRESS = System.getProperty("SCHEMA_REGISTRY_ADDRESS", "http://127.0.0.1");
    public static final String SCHEMA_REGISTRY_PORT = System.getProperty("SCHEMA_REGISTRY_PORT", "8081");
    public static final String SCHEMA_REGISTRY_URL = SCHEMA_REGISTRY_ADDRESS + ":" + SCHEMA_REGISTRY_PORT;
    public static final String SCHEMA_REGISTRY_CONFIG_ENDPOINT = SCHEMA_REGISTRY_URL + "/config";
}
