package org.barakg.avro.schema.evolution.utils;

import org.apache.avro.Schema;
import org.apache.commons.lang3.StringUtils;
import org.barakg.avro.schema.evolution.SimpleRecordTester;

public class SchemaGetter {
    public static String stringAsAvroSchema(String str) {
        String modifiedString = str.replace("\n", "").replace("\r", "").replace(" ", "");
        return StringUtils.deleteWhitespace(modifiedString);
    }

    public static Schema getSchemaFromFile(String pathToFile){
        String schemaAsString = FileReadingUtils.getFileContent(pathToFile, SimpleRecordTester.class);
        return Schema.parse(schemaAsString);
    }

    public static String readAvroSchemaFromFile(String filePath) {
        String schema = FileReadingUtils.getFileContent(filePath, SimpleRecordTester.class);
        return stringAsAvroSchema(schema);
    }
}
