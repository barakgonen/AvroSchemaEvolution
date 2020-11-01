package org.barakg.avro.schema.evolution;

import org.apache.avro.reflect.AvroSchema;
import org.barakg.avro.schema.evolution.utils.FileReadingUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnumTester {
    public static final String enumBaseDefinition = "{" +
            "\"name\":\"SystemName\"," +
            "\"type\":\"enum\"," +
            "\"symbols\":[" +
            "\"NONE\"," +
            "\"A\"," +
            "\"B\"," +
            "\"C\"" +
            "]," +
            "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
            "}";

//    public static final AvroSchema baseEnum = AvroUtils.parseSchema(enumBaseDefinition);
//
//    @Test
//    public void testReadEnumFromFile() {
//        String enumSchemaAsString = FileReadingUtils.getFileContent("enums/MyEnum.avsc", EnumTester.class);
//        assertEquals("enums not the same", enumBaseDefinition, enumSchemaAsString);
//    }
//
//    @Test
//    public void testRemovingEnumValueFromTheBeginingOfEnumSymbolsBreakSchemaCompatability() {
//        final String enumBaseDefinitionWithFirstSymbolRemoved = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"A\"," +
//                "\"B\"," +
//                "\"C\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithFirstSymbolRemoved);
//        assertFalse("enums are the same", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testRemovingEnumValueFromTheMiddleOfEnumSymbolsBreakSchemaCompatability() {
//        String enumBaseDefinitionWithMiddleSymbolRemoved = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"NONE\"," +
//                "\"B\"," +
//                "\"C\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithMiddleSymbolRemoved);
//        assertFalse("enums are the same", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testRemovingEnumValueFromTheEndOfEnumSymbolsBreakSchemaCompatability() {
//        // TODO: need to decide weather it should break the build..
//        String enumBaseDefinitionWithLastSymbolRemoved = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"NONE\"," +
//                "\"A\"," +
//                "\"B\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithLastSymbolRemoved);
//        assertTrue("enums are the same", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testAddingEnumValueAtTheBeginning() {
//        String enumBaseDefinitionWithSymbolAddedBegin = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"TEST\"," +
//                "\"NONE\"," +
//                "\"A\"," +
//                "\"B\"," +
//                "\"C\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithSymbolAddedBegin);
//        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testAddingEnumValueAtTheMiddle() {
//        String enumBaseDefinitionWithSymbolAddedMiddle = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"NONE\"," +
//                "\"A\"," +
//                "\"B\"," +
//                "\"b\"," +
//                "\"C\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithSymbolAddedMiddle);
//        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testAddingEnumValueAtTheEnd() {
//        String enumBaseDefinitionWithSymbolAddedEnd = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"NONE\"," +
//                "\"A\"," +
//                "\"B\"," +
//                "\"C\"," +
//                "\"D\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithSymbolAddedEnd);
//        assertTrue("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testReorderingBegin() {
//        String enumBaseDefinitionWithSymbolReorderedBegin = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"A\"," +
//                "\"NONE\"," +
//                "\"B\"," +
//                "\"C\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithSymbolReorderedBegin);
//        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testReorderingMiddle() {
//        String enumBaseDefinitionWithSymbolReorderedMiddle = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"NONE\"," +
//                "\"B\"," +
//                "\"A\"," +
//                "\"C\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithSymbolReorderedMiddle);
//        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testReorderingEnd() {
//        String enumBaseDefinitionWithSymbolReorderedEnd = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"NONE\"," +
//                "\"A\"," +
//                "\"C\"," +
//                "\"B\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithSymbolReorderedEnd);
//        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testRenameBegin() {
//        String enumBaseDefinitionWithRenamingBegin = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"NoNE\"," +
//                "\"A\"," +
//                "\"B\"," +
//                "\"C\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithRenamingBegin);
//        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testRenameMiddle() {
//        final String enumBaseDefinitionWithFieldRenamingMiddle = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"NONE\"," +
//                "\"A\"," +
//                "\"b\"," +
//                "\"C\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithFieldRenamingMiddle);
//        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
//
//    @Test
//    public void testRenameEnd() {
//        final String enumBaseDefinitionWithFieldRenamingEnd = "{" +
//                "\"name\":\"SystemName\"," +
//                "\"type\":\"enum\"," +
//                "\"symbols\":[" +
//                "\"NONE\"," +
//                "\"A\"," +
//                "\"B\"," +
//                "\"c\"" +
//                "]," +
//                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
//                "}";
//        AvroSchema modifiedEnum = AvroUtils.parseSchema(enumBaseDefinitionWithFieldRenamingEnd);
//        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnum));
//    }
}
