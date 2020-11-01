package org.barakg.avro.schema.evolution;

import org.apache.avro.Schema;
import org.apache.avro.reflect.AvroSchema;

import java.util.List;

public class SchemaChecker {
//    private static CompatibilityChecker checker = CompatibilityChecker.FULL_TRANSITIVE_CHECKER;
//    private static CompatibilityChecker checker = CompatibilityChecker.BACKWARD_TRANSITIVE_CHECKER;

    public static boolean isValidSchemaChange(Schema newSchema, Schema oldSchema) {
        if (areBothAvroSchemataAreEnums(newSchema, oldSchema))
            return validateEnumUniqeCompatability(newSchema, oldSchema);
        return
                isChangeBackwardsCompatible(newSchema, oldSchema);

//                        checker.isCompatible(newSchema, Arrays.asList(oldSchema)) &&
//                        newSchema.isBackwardCompatible(oldSchema);
    }

    public static boolean isValidEvolution(AvroSchema newSchema, List<AvroSchema> oldSchemas) {
        return true;
    }

    private static boolean areBothAvroSchemataAreEnums(Schema newSchema, Schema oldSchema) {
        return newSchema.getType().equals(Schema.Type.ENUM) &&
                oldSchema.getType().equals(Schema.Type.ENUM);
    }

    private static boolean validateEnumUniqeCompatability(Schema newSchema, Schema oldSchema) {
        List<String> newSchemaEnumSymbols = newSchema.getEnumSymbols();
        List<String> oldSchemaEnumSymbols = oldSchema.getEnumSymbols();
        if (newSchemaEnumSymbols.size() > oldSchemaEnumSymbols.size()) {
            // Added new symbol to the symbols list, need to verify it was added in the end
            for (int index = 0; index < oldSchemaEnumSymbols.size(); index++) {
                if (!oldSchemaEnumSymbols.get(index).equals(newSchemaEnumSymbols.get(index)))
                    return false;
            }
        } else if (newSchemaEnumSymbols.size() < oldSchemaEnumSymbols.size()) {
            // Symbol has removed from the enum symbols list, need to make sure it was removed from the end
            for (int index = 0; index < newSchemaEnumSymbols.size(); index++) {
                if (!newSchemaEnumSymbols.get(index).equals(oldSchemaEnumSymbols.get(index)))
                    return false;
            }
        } else {
            // Sizes are the same, need to verify symbols are in the same order
            for (int index = 0; index < oldSchemaEnumSymbols.size(); index++)
                if (!oldSchemaEnumSymbols.get(index).equals(newSchemaEnumSymbols.get(index)))
                    return false;
        }

        return true;
    }

    private static boolean isChangeBackwardsCompatible(Schema newSchema, Schema oldSchema) {
        List<Schema.Field> newSchemaFields = newSchema.getFields();
        List<Schema.Field> oldSchemaFields = oldSchema.getFields();

        // Return true if nothing has changed
//        if (oldSchema.deepEquals(newSchema))
//            return true;

        if (newSchemaFields.size() == oldSchemaFields.size()) {
            // Sizes are the same, need to check for the same order of fields, types and names
        } else {
            if (oldSchemaFields.size() < newSchemaFields.size()) {
                int index = 0;
                // iteration of all the fields from old schema
                for (index = 0; index < oldSchemaFields.size(); index++) {
                    if (!oldSchemaFields.get(index).equals(newSchemaFields.get(index)))
                        return false;
                }
                if (index > 0) {
                    for (; index < newSchemaFields.size(); index++) {
                        Schema.Field field = newSchemaFields.get(index);
                        if (field.schema().getType() == Schema.Type.UNION && field.getProp("defaultValue") != null)
                            return false;
                        else if (field.schema().getType() == Schema.Type.LONG ||
                                field.schema().getType() == Schema.Type.FLOAT ||
                                field.schema().getType() == Schema.Type.INT ||
                                field.schema().getType() == Schema.Type.STRING) {
                            if (!(field.defaultVal() != null))
                                return false;
                        }
                    }
                }
                return true;
                // Field added to the new schema
                // if (new field is nullable, return true)
            } else if (oldSchemaFields.size() > newSchemaFields.size()) {
                int index = 0;
                // iteration of all the fields from old schema
                for (index = 0; index < newSchemaFields.size(); index++) {
                    if (!newSchemaFields.get(index).equals(oldSchemaFields.get(index)))
                        return false;
                }
                if (index > 0) {
                    for (; index < oldSchemaFields.size(); index++) {
                        if (oldSchemaFields.get(index).getProp("defaultValue") != null ||
                                oldSchemaFields.get(index).schema().getType() != Schema.Type.UNION)
                            return false;
                    }
                }
                return true;
            }
        }

        return false;
    }
}
