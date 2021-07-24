package org.barakg.avro.schema.evolution.utils;

public class FinalSchemas {
    public static final String schemaString1 = "{\n" +
            "  \"type\": \"record\",\n" +
            "  \"name\": \"myrecord\",\n" +
            "  \"namespace\": \"org.mashov.bla.schema.data.schemata\",\n" +
            "  \"doc\": \"blablablabla\",\n" +
            "  \"fields\": [\n" +
            "    {\n" +
            "      \"name\": \"f1\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static final String schemaString2  = "{\n" +
            "  \"type\": \"record\",\n" +
            "  \"name\": \"myrecord\",\n" +
            "  \"namespace\": \"org.mashov.bla.schema.data.schemata\",\n" +
            "  \"doc\": \"blablablabla\",\n" +
            "  \"fields\": [\n" +
            "    {\n" +
            "      \"name\": \"f1\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"f2\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": \"foo\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static final String schemaString3 = "{\n" +
            "  \"type\": \"record\",\n" +
            "  \"name\": \"myrecord\",\n" +
            "  \"namespace\": \"org.mashov.bla.schema.data.schemata\",\n" +
            "  \"doc\": \"blablablabla\",\n" +
            "  \"fields\": [\n" +
            "    {\n" +
            "      \"name\": \"f1\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"f2\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static final String schemaString4 = "{\n" +
            "  \"type\": \"record\",\n" +
            "  \"name\": \"myrecord\",\n" +
            "  \"namespace\": \"org.mashov.bla.schema.data.schemata\",\n" +
            "  \"doc\": \"blablablabla\",\n" +
            "  \"fields\": [\n" +
            "    {\n" +
            "      \"name\": \"f1_new\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"aliases\": [\"f1\"]\n"   +
            "    }\n" +
            "  ]\n" +
            "}";

    public static final String schemaString6 = "{\n" +
            "  \"type\": \"record\",\n" +
            "  \"name\": \"myrecord\",\n" +
            "  \"namespace\": \"org.mashov.bla.schema.data.schemata\",\n" +
            "  \"doc\": \"blablablabla\",\n" +
            "  \"fields\": [\n" +
            "    {\n" +
            "      \"type\": [\n" +
            "                \"null\",\n" +
            "                \"string\"\n" +
            "      ],\n" +
            "      \"name\": \"f1\",\n" +
            "      \"doc\": \"doc of f1\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static final String schemaString7 = "{\n" +
            "  \"type\": \"record\",\n" +
            "  \"name\": \"myrecord\",\n" +
            "  \"namespace\": \"org.mashov.bla.schema.data.schemata\",\n" +
            "  \"doc\": \"blablablabla\",\n" +
            "  \"fields\": [\n" +
            "    {\n" +
            "      \"type\": [\n" +
            "                \"null\",\n" +
            "                \"string\",\n" +
            "                \"int\"\n" +
            "      ],\n" +
            "      \"name\": \"f1\",\n" +
            "      \"doc\": \"doc of f1\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static final String schemaString8 = "{\n" +
            "  \"type\": \"record\",\n" +
            "  \"name\": \"myrecord\",\n" +
            "  \"namespace\": \"org.mashov.bla.schema.data.schemata\",\n" +
            "  \"doc\": \"blablablabla\",\n" +
            "  \"fields\": [\n" +
            "    {\n" +
            "      \"name\": \"f1\",\n" +
            "      \"type\":\"string\",\n" +
            "      \"doc\": \"bbbbbbb\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"f2\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": \"foo\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"f3\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": \"bar\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";


    public static final String badDefaultNullString = "{\n" +
            "  \"type\": \"record\",\n" +
            "  \"name\": \"myrecord\",\n" +
            "  \"namespace\": \"org.mashov.bla.schema.data.schemata\",\n" +
            "  \"doc\": \"blablablabla\",\n" +
            "  \"fields\": [\n" +
            "    {\n" +
            "      \"type\": [\n" +
            "                \"null\",\n" +
            "                \"string\"\n" +
            "      ],\n" +
            "      \"name\": \"f1\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": \"null\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": \"string\",\n" +
            "      \"name\": \"f2\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": \"foo\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": \"string\",\n" +
            "      \"name\": \"f3\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": \"bar\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static final String bgSchema = "{\n" +
            "  \"type\": \"record\",\n" +
            "  \"name\": \"bgRecord\",\n" +
            "  \"namespace\": \"org.mashov.bla.schema.data.entity\",\n" +
            "  \"doc\": \"blablablabla\",\n" +
            "  \"fields\": [\n" +
            "    {\n" +
            "      \"name\": \"first\",\n" +
            "      \"type\": [\n" +
            "                \"null\",\n" +
            "                \"string\"\n" +
            "      ],\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"second\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"third\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"forth\",\n" +
            "      \"type\": \"string\",\n" +
            "      \"doc\": \"bbbbbbb\",\n" +
            "      \"default\": \"defaultEmpty\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";
}
