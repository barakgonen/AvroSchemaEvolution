package org.barakg.avro.schema.evolution;

import org.apache.avro.Schema;
import org.junit.Test;

import static org.barakg.avro.schema.evolution.utils.SchemaGetter.getSchemaFromFile;
import static org.junit.Assert.*;

public class EvolutionTestsWithSchemaRegistry {

    @Test
    public void testAddingNullableFieldWithDefaultValueAndInNextEvolutionRemoveDefaultValue(){
        Schema firstStep = getSchemaFromFile("records/recordEvolution/InitializeParametersDtAdditionOfNullableFieldAtTheEndWithDefaultValue.avsc");
        Schema secondStep = getSchemaFromFile("records/recordEvolution/InitializeParametersDtAdditionOfNullableFieldAtTheEndWithoutDefaultValue.avsc");

        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(firstStep));
        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(firstStep).get().intValue());
        assertTrue("Those pair of schemata should not be backward compatible",
                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(firstStep));
        boolean secondSchemaRegistrationResult = SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(secondStep);
        assertFalse(secondSchemaRegistrationResult);

        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(secondStep).get().intValue());
        if (secondSchemaRegistrationResult)
            assertFalse("Those pair of schemata should not be backward compatible",
                    SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(secondStep));
    }

//    @Test
//    public void testAdditionOfNonNullableTypeAtTheEndOfSchemaWithDefaultValueAndInNextCommitRemoveDefaultValue() {
//        String firstStep = FileReadingUtils.getFileContent("records/recordEvolution/InitializeParametersDtAdditionOfNonNullableFieldAtTheEndWithDefaultValue.avsc");
//        String secondStep = FileReadingUtils.getFileContent("records/recordEvolution/InitializeParametersDtAdditionOfNonNullableFieldAtTheEndWithoutDefaultValue.avsc");
//
//        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, firstStep));
//        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
//        assertTrue("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, firstStep));
//
//        boolean secondSchemaRegistrationResult = SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(SCHEMA_NAME, secondStep);
//        assertFalse(secondSchemaRegistrationResult);
//        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(SCHEMA_NAME).get().intValue());
//        if (secondSchemaRegistrationResult)
//            assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(SCHEMA_NAME, secondStep));
//    }
}
