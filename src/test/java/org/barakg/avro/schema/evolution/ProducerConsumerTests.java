package org.barakg.avro.schema.evolution;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.*;
import org.apache.avro.reflect.AvroEncode;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.avro.util.Utf8;

import org.junit.Before;
import org.junit.Test;
import org.mashov.avro.services.bla.samples.structures.InitializeParametersDt;
import org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNullableFieldAtTheBeggining;
import org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNullableFieldAtTheEnd;
import wpmcn.MyPair;
import wpmcn.MyPairMod;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;


/**
 * This test suite handles cases when producer with new version of schema publishes messages to consumer with
 * the old version.
 * Deserialization of newer version, by older consumer
 */
public class ProducerConsumerTests {
    private InitializeParametersDt oldSchema;
    private GenericDatumReader<InitializeParametersDt> oldVersionReader;
    private final Long reportingSystemId = Long.valueOf(123456);
    private final String callSign = "sdsadlsld,m";
    private final Long privateNetworkNumber = Long.valueOf(23213);
    private final Long globalNetworkNumber = Long.valueOf(23);
    private final int blaBlaSecond = 2332;
    private final int formNumber = 232;
    private final int blaBla = 21313;
    private final String LEFT = "LEFT";
    private final String RIGHT = "RIGHT";
    private MyPair baseSchema;

    private <S extends SpecificRecordBase> ByteArrayOutputStream serializeSchema(S schema) {
        // Serialize it.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DatumWriter<S> writer = new GenericDatumWriter<>(schema.getSchema());
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        try {
            writer.write(schema, encoder);
            encoder.flush();
            out.close();
            System.out.println("Serialization: " + out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }

    private <S extends SpecificRecordBase> void deserializeData(S schema, ByteArrayOutputStream data) {
        // Deserialize it.
        GenericDatumReader<S> reader = new GenericDatumReader<>(schema.getSchema());
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(data.toByteArray(), null);
        GenericRecord result = null;
        try {
            reader.setExpected(schema.getSchema());
            reader.read(schema, decoder);
        } catch (IOException e) {
            e.printStackTrace();
            assertEquals(true, false);
        }
    }

    @Before
    public void initializeBaseSchemaInstance() {
        oldSchema = new InitializeParametersDt(reportingSystemId, callSign, privateNetworkNumber,
                globalNetworkNumber, blaBlaSecond, formNumber, blaBla);
        oldVersionReader = new GenericDatumReader<>();
        baseSchema = new MyPair(LEFT, RIGHT);
    }

    @Test
    public void testSerializeAndDeserializeGenericly() {
        // Create a datum to serialize.
        Schema modifiedSchema = null;
        Schema baseSchema = null;
        try {
            modifiedSchema = new Schema.Parser().parse(getClass().getClassLoader().getResourceAsStream("MyPairMod.avsc"));
            baseSchema = new Schema.Parser().parse(getClass().getClassLoader().getResourceAsStream("MyPair.avsc"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        GenericRecord datum = new GenericData.Record(modifiedSchema);
        datum.put("left", new Utf8("dog"));
        datum.put("right", new Utf8("cat"));

        // Serialize it.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DatumWriter<GenericRecord> writer = new GenericDatumWriter<GenericRecord>(modifiedSchema);
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        try {
            writer.write(datum, encoder);
            encoder.flush();
            out.close();
            System.out.println("Serialization: " + out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize it.
        DatumReader<GenericRecord> reader = new GenericDatumReader<GenericRecord>(baseSchema);
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(out.toByteArray(), null);
        GenericRecord result = null;
        try {
            result = reader.read(null, decoder);
            System.out.printf("Left: %s, Right: %s\n", result.get("left"), result.get("right"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("dog", result.get("left").toString());
        assertEquals("cat", result.get("right").toString());
    }

    @Test
    public void testSerdesWithGeneratedObjectInsteadFile() {
        MyPairMod modifidedSchema = new MyPairMod();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DatumWriter<MyPair> writer = new GenericDatumWriter<>(baseSchema.getSchema());
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        try {
            writer.write(baseSchema, encoder);
            encoder.flush();
            out.close();
            System.out.println("Serialization: " + out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize it.
        GenericDatumReader<MyPairMod> reader = new GenericDatumReader<>(modifidedSchema.getSchema());
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(out.toByteArray(), null);
        GenericRecord result = null;
        try {
            reader.read(modifidedSchema, decoder);
            assertEquals(baseSchema.getLeft(), modifidedSchema.getLeft());
            assertEquals(baseSchema.getRight(), modifidedSchema.getRight());
        } catch (IOException e) {
            e.printStackTrace();
            assertEquals(true, false);
        }
    }

    @Test
    public void testSerializeInExtractedFunction() {
        MyPairMod modifidedSchema = new MyPairMod();
        ByteArrayOutputStream out = serializeSchema(baseSchema);

        // Deserialize it.
        GenericDatumReader<MyPairMod> reader = new GenericDatumReader<>(modifidedSchema.getSchema());
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(out.toByteArray(), null);
        GenericRecord result = null;
        try {
            reader.read(modifidedSchema, decoder);
            assertEquals(baseSchema.getLeft(), modifidedSchema.getLeft());
            assertEquals(baseSchema.getRight(), modifidedSchema.getRight());
        } catch (IOException e) {
            e.printStackTrace();
            assertEquals(true, false);
        }
    }

    @Test
    public void testSerializeAndDesirializeInExtractedFunctions() {
        MyPairMod modifidedSchema = new MyPairMod();

        ByteArrayOutputStream out = serializeSchema(baseSchema);
        deserializeData(modifidedSchema, out);

        assertEquals(baseSchema.getLeft(), modifidedSchema.getLeft());
        assertEquals(baseSchema.getRight(), modifidedSchema.getRight());
    }

    @Test
    public void testAddNullableTypeAtTheBeginningOfSchema() {
        InitializeParametersDtAdditionOfNullableFieldAtTheBeggining newSchema =
                new InitializeParametersDtAdditionOfNullableFieldAtTheBeggining("blabla", reportingSystemId, callSign, privateNetworkNumber,
                        globalNetworkNumber, blaBlaSecond, formNumber, blaBla);

        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

//    @Test
//    public void testAddNullableTypeAtTheMiddleOfSchema() {
//        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNullableFieldAtTheMiddle.avsc");
//        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertTrue("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
    @Test
    public void testAddNullableTypeAtTheEndOfSchema() {
        InitializeParametersDtAdditionOfNullableFieldAtTheEnd newSchema = new InitializeParametersDtAdditionOfNullableFieldAtTheEnd(reportingSystemId, callSign, privateNetworkNumber,
                        globalNetworkNumber, blaBlaSecond, formNumber, blaBla, "sdsd");

        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }
//
//    @Test
//    public void testAddNonNullableTypeAtTheBeginningOfSchema() {
//        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.avsc");
//        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertTrue("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }

//    @Test
//    public void testAddNonNullableTypeAtTheMiddleOfSchema() {
//        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNonNullableFieldAtTheMiddle.avsc");
//        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertTrue("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
//    @Test
//    public void testAddNonNullableTypeAtTheEndOfSchema() {
//        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNonNullableFieldWithoutDefaultValueAtTheEnd.avsc");
//        assertFalse(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(1, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertFalse("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
//
//    @Test
//    public void testAddNonNullableFieldWithDefaultValueAtTheEndOfSchema() {
//        Schema schema = getSchemaFromFile("records/addition/InitializeParametersDtAdditionOfNonNullableFieldWithDefaultValueAtTheEnd.avsc");
//        assertTrue(SchemaRegistryApi.getInstance().resgisterSchemaOrUpdateSchema(schema));
//        assertEquals(2, SchemaRegistryApi.getInstance().getSchemaVersion(schema).get().intValue());
//        assertTrue("Those pair of schemata should not be backward compatible",
//                SchemaRegistryApi.getInstance().isCompatibleWithLatestSchemaVersion(schema));
//    }
}
