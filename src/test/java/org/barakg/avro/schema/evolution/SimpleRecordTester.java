package org.barakg.avro.schema.evolution;

import org.apache.avro.Schema;
import org.apache.commons.lang3.StringUtils;
import org.barakg.avro.schema.evolution.utils.FileReadingUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.barakg.avro.schema.evolution.utils.FinalSchemas.bgSchema;
import static org.barakg.avro.schema.evolution.utils.SchemaGetter.*;
import static org.junit.Assert.*;

public class SimpleRecordTester {

    private static final String BASE_SCHEMA_PATH = "records/InitializeParametersDt.avsc";
    public static final String bgAvroSchema = stringAsAvroSchema(bgSchema);
    private static final String baseAvroSchema = readAvroSchemaFromFile(BASE_SCHEMA_PATH);
    private static final Schema baseSchema = getSchemaFromFile(BASE_SCHEMA_PATH);

    /**
     * TODO: Enum, reordering of fields, renaming of non-nullables
     * NEED to assume which schema changed from the commit, and than take the latest of that schema from artifactory.
     * pass a whole set of validations and decide if need to accept or deny the commit
     * read a schema from file
     * <p>
     * Tasks:
     * 1. read schema from file
     * 2. "understand" which schema has changed from the commit
     * 3. run comparison between the changed schema and the one fetched from artifactory
     */

    @Before
    public void beforeEach() {
        SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(baseSchema);
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(baseSchema).get().intValue());
    }

    @After
    public void afterEach() {
        Collection<Integer> versions = SchemaRegistryApi.getInstance().getAllSchemaVersionsByName(baseSchema.getName());

        for (int i = 1; i < versions.size(); i++) {
            SchemaRegistryApi.getInstance().deleteSchemaByVersion(baseSchema.getName(), (Integer) versions.toArray()[i]);
        }

        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(baseSchema).get().intValue());
    }

    @Test
    public void testReadingSchemaFromGivenFileName() {
        String schemaAsString = readAvroSchemaFromFile("records/bg.avsc");
        assertEquals(bgAvroSchema, schemaAsString);
    }

    @Test
    public void testReadAndPrintSchemaFromFile() {
        String schemaAsString = readAvroSchemaFromFile("records/InitializeParametersDt.avsc");
        assertNotNull(schemaAsString);
    }

    @Test
    public void testAddNullableTypeAtTheBeginningOfSchema() {
        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNullableFieldAtTheBeggining.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testAddNullableTypeAtTheMiddleOfSchema() {
        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNullableFieldAtTheMiddle.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testAddNullableTypeAtTheEndOfSchema() {
        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNullableFieldAtTheEnd.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testAddNonNullableTypeAtTheBeginningOfSchema() {
        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testAddNonNullableTypeAtTheMiddleOfSchema() {
        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNonNullableFieldAtTheMiddle.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testAddNonNullableTypeAtTheEndOfSchema() {
        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNonNullableFieldWithoutDefaultValueAtTheEnd.avsc");
        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testAddNonNullableFieldWithDefaultValueAtTheEndOfSchema() {
        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNonNullableFieldWithDefaultValueAtTheEnd.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

//    @Test
//    public void testDeletionNullableTypeAtTheBeginningOfSchema() {
//        String schemaAsString = FileReadingUtils.getFileContent("records/deletion/InitializeParametersDtDeletionOfNullableFieldAtTheBeggining.avsc");
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
    @Test
    public void testDeletionNullableTypeAtTheMiddleOfSchema() {
        Schema schema = getSchemaFromFile("records/deletion/InitializeParametersDtDeletionOfNullableFieldAtTheMiddle.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata s" +
                                        "hould not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testDeletionNullableTypeAtTheEndOfSchema() {
        Schema schema = getSchemaFromFile("records/deletion/InitializeParametersDtDeletionOfNullableFieldAtTheEnd.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testDeletionNonNullableTypeAtTheBeginningOfSchema() {
        Schema schema = getSchemaFromFile("records/deletion/InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testDeletionNonNullableTypeAtTheMiddleOfSchema() {
        Schema schema = getSchemaFromFile("records/deletion/InitializeParametersDtDeletionOfNonNullableFieldAtTheMiddle.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

//    @Test
//    public void testDeletionNonNullableTypeAtTheEndOfSchema() {
//        String schemaAsString = FileReadingUtils.getFileContent("records/deletion/InitializeParametersDtDeletionOfNonNullableFieldAtTheEnd.avsc");
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }

//    @Test
//    public void testRenameNullableTypeAtTheBeginningOfSchema() {
//        String schemaAsString = FileReadingUtils.getFileContent("records/rename/InitializeParametersDtRenamingOfNullableFieldAtTheBeggining.avsc");
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
    @Test
    public void testRenameNullableTypeAtTheMiddleOfSchema() {
        Schema schema = getSchemaFromFile("records/rename/InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testRenameNullableTypeAtTheEndOfSchema() {
        Schema schema = getSchemaFromFile("records/rename/InitializeParametersDtRenamingOfNullableFieldAtTheEnd.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testRenameNonNullableTypeAtTheBeginningOfSchema() {
        Schema schema = getSchemaFromFile("records/rename/InitializeParametersDtRenamingOfNonNullableFieldAtTheBeggining.avsc");
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

    @Test
    public void testRenameNonNullableTypeAtTheMiddleOfSchema() {
        Schema schema = getSchemaFromFile("records/rename/InitializeParametersDtRenamingOfNonNullableFieldAtTheMiddle.avsc");

        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }

//    @Test
//    public void testRenameNonNullableTypeAtTheEndOfSchema() {
//        String schemaAsString = FileReadingUtils.getFileContent("records/rename/InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.avsc");
//
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
//    @Test
//    public void testRetypingNullableTypeAtTheBeginningOfSchema() {
//        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNullableFieldAtTheBeggining.avsc");
//
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
//    @Test
//    public void testRetypingNullableTypeAtTheMiddleOfSchema() {
//        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNullableFieldAtTheMiddle.avsc");
//
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
//    @Test
//    public void testRetypingNullableTypeAtTheEndOfSchema() {
//        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNullableFieldAtTheEnd.avsc");
//
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
//    @Test
//    public void testRetypingNonNullableTypeAtTheBeginningOfSchema() {
//        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.avsc");
//
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
//    @Test
//    public void testRetypingNonNullableTypeAtTheMiddleOfSchema() {
//        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNonNullableFieldAtTheMiddle.avsc");
//
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
    @Test
    public void testRetypingNonNullableTypeAtTheEndOfSchema() {
        Schema schema = getSchemaFromFile("records/retype/InitializeParametersDtRetypingOfNonNullableFieldAtTheEnd.avsc");

        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
    }
}