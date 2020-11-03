package org.barakg.avro.schema.evolution;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.avro.util.Utf8;
import org.junit.Before;
import org.junit.Test;
import org.mashov.avro.services.bla.samples.structures.*;
import org.mashov.bla.schema.data.entity.InitializeParametersDtDeletionOfNonNullableFieldAtTheEnd;
import org.mashov.bla.schema.data.entity.InitializeParametersDtDeletionOfNullableFieldAtTheBeggining;
import org.mashov.bla.schema.data.entity.bgRecord;
import wpmcn.MyPair;
import wpmcn.MyPairMod;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.barakg.avro.schema.evolution.utils.SchemaGetter.getSchemaFromFile;
import static org.junit.Assert.*;


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
    private String FIRST = "first";
    private String SECOND = "second";
    private String THIRD = "third";
    private String FORTH = "forth";
    private bgRecord anotherOldSchema;

    private <S extends SpecificRecordBase> ByteArrayOutputStream serializeSchema(S schema) {
        // Serialize it.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DatumWriter<S> writer = new GenericDatumWriter<>(schema.getSchema());
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        try {
            writer.write(schema, encoder);
            encoder.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }

    private <S extends SpecificRecordBase> void deserializeData(S readerSchema, S writerSchema, ByteArrayOutputStream data) {
        // Deserialize it.
        GenericDatumReader<S> reader = new GenericDatumReader<>(writerSchema.getSchema(), readerSchema.getSchema());
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(data.toByteArray(), null);
//        GenericRecord result = null;
        try {
            reader.read(readerSchema, decoder);
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
        anotherOldSchema = new bgRecord(FIRST, SECOND, THIRD, FORTH);
    }


    // SerializationTests
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
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize it.
        DatumReader<GenericRecord> reader = new GenericDatumReader<GenericRecord>(baseSchema);
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(out.toByteArray(), null);
        GenericRecord result = null;
        try {
            result = reader.read(null, decoder);

        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("dog", result.get("left").toString());
        assertEquals("cat", result.get("right").toString());
    }

    @Test
    public void testSerdesWithGeneratedObjectInsteadFile() {
        MyPairMod modifiedSchema = new MyPairMod();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DatumWriter<MyPair> writer = new GenericDatumWriter<>(baseSchema.getSchema());
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        try {
            writer.write(baseSchema, encoder);
            encoder.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize it.
        GenericDatumReader<MyPairMod> reader = new GenericDatumReader<>(modifiedSchema.getSchema());
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(out.toByteArray(), null);
        GenericRecord result = null;
        try {
            reader.read(modifiedSchema, decoder);
            assertEquals(baseSchema.getLeft(), modifiedSchema.getLeft());
            assertEquals(baseSchema.getRight(), modifiedSchema.getRight());
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
        deserializeData(modifidedSchema, baseSchema, out);

        assertEquals(baseSchema.getLeft(), modifidedSchema.getLeft());
        assertEquals(baseSchema.getRight(), modifidedSchema.getRight());
    }

    @Test
    public void testAddNullableTypeAtTheBeginningOfSchema() {
        InitializeParametersDtAdditionOfNullableFieldAtTheBeggining newSchema =
                new InitializeParametersDtAdditionOfNullableFieldAtTheBeggining("blabla", reportingSystemId, callSign, privateNetworkNumber,
                        globalNetworkNumber, blaBlaSecond, formNumber, blaBla);

        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testAddNullableTypeAtTheMiddleOfSchema() {
        InitializeParametersDtAdditionOfNullableFieldAtTheMiddle newSchema = new InitializeParametersDtAdditionOfNullableFieldAtTheMiddle(reportingSystemId, callSign, privateNetworkNumber,
                "", globalNetworkNumber, blaBlaSecond, formNumber, blaBla);
        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testAddNullableTypeAtTheEndOfSchema() {
        InitializeParametersDtAdditionOfNullableFieldAtTheEnd newSchema = new InitializeParametersDtAdditionOfNullableFieldAtTheEnd(reportingSystemId, callSign, privateNetworkNumber,
                globalNetworkNumber, blaBlaSecond, formNumber, blaBla, "sdsd");

        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testAddNonNullableTypeAtTheBeginningOfSchema() {
        InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining newSchema = new InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining("", reportingSystemId, callSign, privateNetworkNumber,
                globalNetworkNumber, blaBlaSecond, formNumber, blaBla);
        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testAddNonNullableTypeAtTheMiddleOfSchema() {
        InitializeParametersDtAdditionOfNonNullableFieldAtTheMiddle newSchema = new InitializeParametersDtAdditionOfNonNullableFieldAtTheMiddle(reportingSystemId, callSign, privateNetworkNumber,
                "", globalNetworkNumber, blaBlaSecond, formNumber, blaBla);
        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testAddNonNullableTypeAtTheEndOfSchema() {
        InitializeParametersDtAdditionOfNonNullableFieldWithoutDefaultValueAtTheEnd newSchema = new InitializeParametersDtAdditionOfNonNullableFieldWithoutDefaultValueAtTheEnd(reportingSystemId, callSign, privateNetworkNumber,
                globalNetworkNumber, blaBlaSecond, formNumber, blaBla, "");
        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testAddNonNullableFieldWithDefaultValueAtTheEndOfSchema() {
        // TODO: interesting why the code generated that way, the last paramerter should have default value
        InitializeParametersDtAdditionOfNonNullableFieldWithDefaultValueAtTheEnd newSchema = new InitializeParametersDtAdditionOfNonNullableFieldWithDefaultValueAtTheEnd(reportingSystemId, callSign, privateNetworkNumber,
                globalNetworkNumber, blaBlaSecond, formNumber, blaBla, "");
        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testDeletionNullableTypeAtTheBeginningOfSchema() {
        InitializeParametersDtDeletionOfNullableFieldAtTheBeggining newSchema = new InitializeParametersDtDeletionOfNullableFieldAtTheBeggining(SECOND, THIRD, FORTH);
        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(anotherOldSchema, newSchema, out);
        assertEquals(null, anotherOldSchema.getFirst());
        assertEquals(newSchema.getSecond(), anotherOldSchema.getSecond());
        assertEquals(newSchema.getThird(), anotherOldSchema.getThird());
        assertEquals(newSchema.getForth(), anotherOldSchema.getForth());
    }

    @Test
    public void testDeletionNullableTypeAtTheMiddleOfSchema() {
        InitializeParametersDtDeletionOfNullableFieldAtTheMiddle newSchema = new InitializeParametersDtDeletionOfNullableFieldAtTheMiddle(reportingSystemId, callSign, privateNetworkNumber, globalNetworkNumber, formNumber, blaBla);
        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testDeletionNullableTypeAtTheEndOfSchema() {

        InitializeParametersDtDeletionOfNullableFieldAtTheEnd newSchema = new InitializeParametersDtDeletionOfNullableFieldAtTheEnd(reportingSystemId, callSign, privateNetworkNumber,
                globalNetworkNumber, blaBlaSecond, formNumber);
        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
    }

    @Test
    public void testDeletionNonNullableTypeAtTheBeginningOfSchema() {
        InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining newSchema = new InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining(callSign, privateNetworkNumber,
                globalNetworkNumber, blaBlaSecond, formNumber, blaBla);

        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getGlobalNetworkNumber(), oldSchema.getGlobalNetworkNumber());
        assertEquals(newSchema.getBlaBlaSecond(), oldSchema.getBlaBlaSecond());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testDeletionNonNullableTypeAtTheMiddleOfSchema() {
        InitializeParametersDtDeletionOfNonNullableFieldAtTheMiddle newSchema = new InitializeParametersDtDeletionOfNonNullableFieldAtTheMiddle(reportingSystemId, callSign, privateNetworkNumber, formNumber, blaBla);

        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(oldSchema, newSchema, out);

        assertEquals(newSchema.getReportingSystemId(), oldSchema.getReportingSystemId());
        assertEquals(newSchema.getCallSign(), oldSchema.getCallSign());
        assertEquals(newSchema.getPrivateNetworkNumber(), oldSchema.getPrivateNetworkNumber());
        assertEquals(newSchema.getFormNumber(), oldSchema.getFormNumber());
        assertEquals(newSchema.getBlaBla(), oldSchema.getBlaBla());
    }

    @Test
    public void testDeletionNonNullableTypeAtTheEndOfSchema() {
        InitializeParametersDtDeletionOfNonNullableFieldAtTheEnd newSchema = new InitializeParametersDtDeletionOfNonNullableFieldAtTheEnd(FIRST, SECOND, THIRD);
        ByteArrayOutputStream out = serializeSchema(newSchema);
        deserializeData(anotherOldSchema, newSchema, out);
        assertEquals(newSchema.getFirst(), anotherOldSchema.getFirst());
        assertEquals(newSchema.getSecond(), anotherOldSchema.getSecond());
        assertEquals(newSchema.getThird(), anotherOldSchema.getThird());
        assertNotNull(anotherOldSchema.getForth());
    }
}