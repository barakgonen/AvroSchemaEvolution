package org.barakg.avro.schema.evolution;

import org.apache.commons.lang3.StringUtils;
import org.barakg.avro.schema.evolution.utils.FileReadingUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.barakg.avro.schema.evolution.utils.FinalSchemas.bgSchema;
import static org.junit.Assert.*;

public class SimpleRecordTester {

    private static String readAvroSchemaFromFile(String filePath) {
        String schema = FileReadingUtils.getFileContent(filePath, SimpleRecordTester.class);
        return stringAsAvroSchema(schema);
    }

    private static final String BASE_SCHEMA_PATH = "records/InitializeParametersDt.avsc";
    public static final String bgAvroSchema = stringAsAvroSchema(bgSchema);
    private static final String baseAvroSchema = readAvroSchemaFromFile(BASE_SCHEMA_PATH);
    private static final String SCHEMA_NAME = "InitializeParametersDt";

    private static String stringAsAvroSchema(String str) {
        String modifiedString = str.replace("\n", "").replace("\r", "").replace(" ", "");
        return StringUtils.deleteWhitespace(modifiedString);
    }

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
        SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, baseAvroSchema);
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
    }

    @After
    public void afterEach() {
        Collection<Integer> versions = SchemaRegistryApi.getInstance().getAllSchemaVersionsByName(SCHEMA_NAME);

        for (int i = 1; i < versions.size(); i++) {
            SchemaRegistryApi.getInstance().deleteSchemaByVersion(SCHEMA_NAME, (Integer) versions.toArray()[i]);
        }

        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
    }

    @Test
    public void testReadingSchemaFromGivenFileName() {
        String schemaAsString = FileReadingUtils.getFileContent("records/bg.avsc", SimpleRecordTester.class);
        assertEquals(bgAvroSchema, schemaAsString);
    }

    @Test
    public void testReadAndPrintSchemaFromFile() {
        String schemaAsString = FileReadingUtils.getFileContent("records/InitializeParametersDt.avsc", SimpleRecordTester.class);
        assertNotNull(schemaAsString);
        System.out.println(schemaAsString);
    }

    @Test
    public void testAddNullableTypeAtTheBeginningOfSchema() {
        String schemaAsString =
                FileReadingUtils.getFileContent("records/addition/InitializeParametersDtAdditionOfNullableFieldAtTheBeggining.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testAddNullableTypeAtTheMiddleOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/addition/InitializeParametersDtAdditionOfNullableFieldAtTheMiddle.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testAddNullableTypeAtTheEndOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/addition/InitializeParametersDtAdditionOfNullableFieldAtTheEnd.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testAddNonNullableTypeAtTheBeginningOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/addition/InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testAddNonNullableTypeAtTheMiddleOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/addition/InitializeParametersDtAdditionOfNonNullableFieldAtTheMiddle.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testAddNonNullableTypeAtTheEndOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/addition/InitializeParametersDtAdditionOfNonNullableFieldWithoutDefaultValueAtTheEnd.avsc", SimpleRecordTester.class);
        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testAddNonNullableFieldWithDefaultValueAtTheEndOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/addition/InitializeParametersDtAdditionOfNonNullableFieldWithDefaultValueAtTheEnd.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testDeletionNullableTypeAtTheBeginningOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/deletion/InitializeParametersDtDeletionOfNullableFieldAtTheBeggining.avsc", SimpleRecordTester.class);
        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));

    }

    @Test
    public void testDeletionNullableTypeAtTheMiddleOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/deletion/InitializeParametersDtDeletionOfNullableFieldAtTheMiddle.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));

    }

    @Test
    public void testDeletionNullableTypeAtTheEndOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/deletion/InitializeParametersDtDeletionOfNullableFieldAtTheEnd.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testDeletionNonNullableTypeAtTheBeginningOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/deletion/InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testDeletionNonNullableTypeAtTheMiddleOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/deletion/InitializeParametersDtDeletionOfNonNullableFieldAtTheMiddle.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testDeletionNonNullableTypeAtTheEndOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/deletion/InitializeParametersDtDeletionOfNonNullableFieldAtTheEnd.avsc", SimpleRecordTester.class);
        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRenameNullableTypeAtTheBeginningOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/rename/InitializeParametersDtRenamingOfNullableFieldAtTheBeggining.avsc", SimpleRecordTester.class);
        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRenameNullableTypeAtTheMiddleOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/rename/InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRenameNullableTypeAtTheEndOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/rename/InitializeParametersDtRenamingOfNullableFieldAtTheEnd.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRenameNonNullableTypeAtTheBeginningOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/rename/InitializeParametersDtRenamingOfNonNullableFieldAtTheBeggining.avsc", SimpleRecordTester.class);
        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRenameNonNullableTypeAtTheMiddleOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/rename/InitializeParametersDtRenamingOfNonNullableFieldAtTheMiddle.avsc", SimpleRecordTester.class);

        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRenameNonNullableTypeAtTheEndOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/rename/InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.avsc", SimpleRecordTester.class);

        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRetypingNullableTypeAtTheBeginningOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNullableFieldAtTheBeggining.avsc", SimpleRecordTester.class);

        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRetypingNullableTypeAtTheMiddleOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNullableFieldAtTheMiddle.avsc", SimpleRecordTester.class);

        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRetypingNullableTypeAtTheEndOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNullableFieldAtTheEnd.avsc", SimpleRecordTester.class);

        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRetypingNonNullableTypeAtTheBeginningOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.avsc", SimpleRecordTester.class);

        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRetypingNonNullableTypeAtTheMiddleOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNonNullableFieldAtTheMiddle.avsc", SimpleRecordTester.class);

        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testRetypingNonNullableTypeAtTheEndOfSchema() {
        String schemaAsString = FileReadingUtils.getFileContent("records/retype/InitializeParametersDtRetypingOfNonNullableFieldAtTheEnd.avsc", SimpleRecordTester.class);

        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, schemaAsString));
        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, schemaAsString));
    }

    @Test
    public void testAddingNullableFieldWithDefaultValueAndInNextEvolutionRemoveDefaultValue(){
        String firstStep = FileReadingUtils.getFileContent("records/recordEvolution/InitializeParametersDtAdditionOfNullableFieldAtTheEndWithDefaultValue.avsc", SimpleRecordTester.class);
        String secondStep = FileReadingUtils.getFileContent("records/recordEvolution/InitializeParametersDtAdditionOfNullableFieldAtTheEndWithoutDefaultValue.avsc", SimpleRecordTester.class);

        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, firstStep));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, firstStep));
        boolean secondSchemaRegistrationResult = SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, secondStep);
        assertFalse(secondSchemaRegistrationResult);

        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        if (secondSchemaRegistrationResult)
            assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, secondStep));
    }

    @Test
    public void testAdditionOfNonNullableTypeAtTheEndOfSchemaWithDefaultValueAndInNextCommitRemoveDefaultValue() {
        String firstStep = FileReadingUtils.getFileContent("records/recordEvolution/InitializeParametersDtAdditionOfNonNullableFieldAtTheEndWithDefaultValue.avsc", SimpleRecordTester.class);
        String secondStep = FileReadingUtils.getFileContent("records/recordEvolution/InitializeParametersDtAdditionOfNonNullableFieldAtTheEndWithoutDefaultValue.avsc", SimpleRecordTester.class);

        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, firstStep));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, firstStep));

        boolean secondSchemaRegistrationResult = SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, secondStep);
        assertFalse(secondSchemaRegistrationResult);
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
        if (secondSchemaRegistrationResult)
            assertFalse("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, secondStep));
    }
}