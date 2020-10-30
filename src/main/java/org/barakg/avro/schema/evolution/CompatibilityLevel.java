package org.barakg.avro.schema.evolution;

public enum CompatibilityLevel {
    BACKWARD("BACKWARD"),
    BACKWARD_TRANSITIVE("BACKWARD_TRANSITIVE"),
    FORWARD("FORWARD"),
    FORWARD_TRANSITIVE("FORWARD_TRANSITIVE"),
    FULL("FULL"),
    FULL_TRANSITIVE("FULL_TRANSITIVE"),
    NONE("NONE");

    public final String label;

    private CompatibilityLevel(String label) {
        this.label = label;
    }
}
