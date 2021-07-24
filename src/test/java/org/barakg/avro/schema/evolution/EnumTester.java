package org.barakg.avro.schema.evolution;

import org.apache.avro.Schema;
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

    private static Schema baseEnumDefinitionSchema = Schema.parse(enumBaseDefinition);

    @Test
    public void testReadEnumFromFile() {
        String enumSchemaAsString = FileReadingUtils.getFileContent("/home/barak/IdeaProjects/AvroSchemaEvolution/schemata/enumSchema/src/main/avro/MyEnum.avsc");
        assertEquals("enums not the same", enumBaseDefinition, enumSchemaAsString);
    }

    @Test
    public void testRemovingEnumValueFromTheBeginingOfEnumSymbolsBreakSchemaCompatability() {
        final String enumBaseDefinitionWithFirstSymbolRemoved = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"A\"," +
                "\"B\"," +
                "\"C\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithFirstSymbolRemoved);
        assertFalse("enums are the same", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testRemovingEnumValueFromTheMiddleOfEnumSymbolsBreakSchemaCompatability() {
        String enumBaseDefinitionWithMiddleSymbolRemoved = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"NONE\"," +
                "\"B\"," +
                "\"C\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithMiddleSymbolRemoved);
        assertFalse("enums are the same", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testRemovingEnumValueFromTheEndOfEnumSymbolsBreakSchemaCompatability() {
        // TODO: need to decide weather it should break the build..
        String enumBaseDefinitionWithLastSymbolRemoved = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"NONE\"," +
                "\"A\"," +
                "\"B\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithLastSymbolRemoved);
        assertTrue("enums are the same", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testAddingEnumValueAtTheBeginning() {
        String enumBaseDefinitionWithSymbolAddedBegin = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"TEST\"," +
                "\"NONE\"," +
                "\"A\"," +
                "\"B\"," +
                "\"C\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithSymbolAddedBegin);
        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testAddingEnumValueAtTheMiddle() {
        String enumBaseDefinitionWithSymbolAddedMiddle = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"NONE\"," +
                "\"A\"," +
                "\"B\"," +
                "\"b\"," +
                "\"C\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithSymbolAddedMiddle);
        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testAddingEnumValueAtTheEnd() {
        String enumBaseDefinitionWithSymbolAddedEnd = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"NONE\"," +
                "\"A\"," +
                "\"B\"," +
                "\"C\"," +
                "\"D\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithSymbolAddedEnd);
        assertTrue("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testReorderingBegin() {
        String enumBaseDefinitionWithSymbolReorderedBegin = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"A\"," +
                "\"NONE\"," +
                "\"B\"," +
                "\"C\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithSymbolReorderedBegin);
        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testReorderingMiddle() {
        String enumBaseDefinitionWithSymbolReorderedMiddle = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"NONE\"," +
                "\"B\"," +
                "\"A\"," +
                "\"C\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithSymbolReorderedMiddle);
        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testReorderingEnd() {
        String enumBaseDefinitionWithSymbolReorderedEnd = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"NONE\"," +
                "\"A\"," +
                "\"C\"," +
                "\"B\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithSymbolReorderedEnd);
        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testRenameBegin() {
        String enumBaseDefinitionWithRenamingBegin = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"NoNE\"," +
                "\"A\"," +
                "\"B\"," +
                "\"C\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithRenamingBegin);
        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testRenameMiddle() {
        final String enumBaseDefinitionWithFieldRenamingMiddle = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"NONE\"," +
                "\"A\"," +
                "\"b\"," +
                "\"C\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithFieldRenamingMiddle);
        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }

    @Test
    public void testRenameEnd() {
        final String enumBaseDefinitionWithFieldRenamingEnd = "{" +
                "\"name\":\"SystemName\"," +
                "\"type\":\"enum\"," +
                "\"symbols\":[" +
                "\"NONE\"," +
                "\"A\"," +
                "\"B\"," +
                "\"c\"" +
                "]," +
                "\"namespace\":\"org.mashov.bla.blu.bly.enums\"" +
                "}";
        Schema modifiedEnum = Schema.parse(enumBaseDefinitionWithFieldRenamingEnd);
        assertFalse("", SchemaChecker.isValidSchemaChange(modifiedEnum, baseEnumDefinitionSchema));
    }
}
