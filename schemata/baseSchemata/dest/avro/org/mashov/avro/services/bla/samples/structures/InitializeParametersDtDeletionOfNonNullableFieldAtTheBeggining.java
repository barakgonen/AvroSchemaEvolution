/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.mashov.avro.services.bla.samples.structures;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5217638202374602992L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining\",\"namespace\":\"org.mashov.avro.services.bla.samples.structures\",\"fields\":[{\"name\":\"callSign\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"privateNetworkNumber\",\"type\":\"long\",\"default\":0},{\"name\":\"globalNetworkNumber\",\"type\":\"long\",\"default\":0},{\"name\":\"blaBlaSecond\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"formNumber\",\"type\":\"int\",\"default\":-1},{\"name\":\"blaBla\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String callSign;
  @Deprecated public long privateNetworkNumber;
  @Deprecated public long globalNetworkNumber;
  @Deprecated public java.lang.Integer blaBlaSecond;
  @Deprecated public int formNumber;
  @Deprecated public java.lang.Integer blaBla;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining() {}

  /**
   * All-args constructor.
   * @param callSign The new value for callSign
   * @param privateNetworkNumber The new value for privateNetworkNumber
   * @param globalNetworkNumber The new value for globalNetworkNumber
   * @param blaBlaSecond The new value for blaBlaSecond
   * @param formNumber The new value for formNumber
   * @param blaBla The new value for blaBla
   */
  public InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining(java.lang.String callSign, java.lang.Long privateNetworkNumber, java.lang.Long globalNetworkNumber, java.lang.Integer blaBlaSecond, java.lang.Integer formNumber, java.lang.Integer blaBla) {
    this.callSign = callSign;
    this.privateNetworkNumber = privateNetworkNumber;
    this.globalNetworkNumber = globalNetworkNumber;
    this.blaBlaSecond = blaBlaSecond;
    this.formNumber = formNumber;
    this.blaBla = blaBla;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return callSign;
    case 1: return privateNetworkNumber;
    case 2: return globalNetworkNumber;
    case 3: return blaBlaSecond;
    case 4: return formNumber;
    case 5: return blaBla;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: callSign = (java.lang.String)value$; break;
    case 1: privateNetworkNumber = (java.lang.Long)value$; break;
    case 2: globalNetworkNumber = (java.lang.Long)value$; break;
    case 3: blaBlaSecond = (java.lang.Integer)value$; break;
    case 4: formNumber = (java.lang.Integer)value$; break;
    case 5: blaBla = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'callSign' field.
   * @return The value of the 'callSign' field.
   */
  public java.lang.String getCallSign() {
    return callSign;
  }

  /**
   * Sets the value of the 'callSign' field.
   * @param value the value to set.
   */
  public void setCallSign(java.lang.String value) {
    this.callSign = value;
  }

  /**
   * Gets the value of the 'privateNetworkNumber' field.
   * @return The value of the 'privateNetworkNumber' field.
   */
  public java.lang.Long getPrivateNetworkNumber() {
    return privateNetworkNumber;
  }

  /**
   * Sets the value of the 'privateNetworkNumber' field.
   * @param value the value to set.
   */
  public void setPrivateNetworkNumber(java.lang.Long value) {
    this.privateNetworkNumber = value;
  }

  /**
   * Gets the value of the 'globalNetworkNumber' field.
   * @return The value of the 'globalNetworkNumber' field.
   */
  public java.lang.Long getGlobalNetworkNumber() {
    return globalNetworkNumber;
  }

  /**
   * Sets the value of the 'globalNetworkNumber' field.
   * @param value the value to set.
   */
  public void setGlobalNetworkNumber(java.lang.Long value) {
    this.globalNetworkNumber = value;
  }

  /**
   * Gets the value of the 'blaBlaSecond' field.
   * @return The value of the 'blaBlaSecond' field.
   */
  public java.lang.Integer getBlaBlaSecond() {
    return blaBlaSecond;
  }

  /**
   * Sets the value of the 'blaBlaSecond' field.
   * @param value the value to set.
   */
  public void setBlaBlaSecond(java.lang.Integer value) {
    this.blaBlaSecond = value;
  }

  /**
   * Gets the value of the 'formNumber' field.
   * @return The value of the 'formNumber' field.
   */
  public java.lang.Integer getFormNumber() {
    return formNumber;
  }

  /**
   * Sets the value of the 'formNumber' field.
   * @param value the value to set.
   */
  public void setFormNumber(java.lang.Integer value) {
    this.formNumber = value;
  }

  /**
   * Gets the value of the 'blaBla' field.
   * @return The value of the 'blaBla' field.
   */
  public java.lang.Integer getBlaBla() {
    return blaBla;
  }

  /**
   * Sets the value of the 'blaBla' field.
   * @param value the value to set.
   */
  public void setBlaBla(java.lang.Integer value) {
    this.blaBla = value;
  }

  /**
   * Creates a new InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining RecordBuilder.
   * @return A new InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder newBuilder() {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder();
  }

  /**
   * Creates a new InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder newBuilder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder other) {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder(other);
  }

  /**
   * Creates a new InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining RecordBuilder by copying an existing InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining instance.
   * @param other The existing instance to copy.
   * @return A new InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder newBuilder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining other) {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder(other);
  }

  /**
   * RecordBuilder for InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining>
    implements org.apache.avro.data.RecordBuilder<InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining> {

    private java.lang.String callSign;
    private long privateNetworkNumber;
    private long globalNetworkNumber;
    private java.lang.Integer blaBlaSecond;
    private int formNumber;
    private java.lang.Integer blaBla;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.callSign)) {
        this.callSign = data().deepCopy(fields()[0].schema(), other.callSign);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.privateNetworkNumber)) {
        this.privateNetworkNumber = data().deepCopy(fields()[1].schema(), other.privateNetworkNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.globalNetworkNumber)) {
        this.globalNetworkNumber = data().deepCopy(fields()[2].schema(), other.globalNetworkNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.blaBlaSecond)) {
        this.blaBlaSecond = data().deepCopy(fields()[3].schema(), other.blaBlaSecond);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.formNumber)) {
        this.formNumber = data().deepCopy(fields()[4].schema(), other.formNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.blaBla)) {
        this.blaBla = data().deepCopy(fields()[5].schema(), other.blaBla);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.callSign)) {
        this.callSign = data().deepCopy(fields()[0].schema(), other.callSign);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.privateNetworkNumber)) {
        this.privateNetworkNumber = data().deepCopy(fields()[1].schema(), other.privateNetworkNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.globalNetworkNumber)) {
        this.globalNetworkNumber = data().deepCopy(fields()[2].schema(), other.globalNetworkNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.blaBlaSecond)) {
        this.blaBlaSecond = data().deepCopy(fields()[3].schema(), other.blaBlaSecond);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.formNumber)) {
        this.formNumber = data().deepCopy(fields()[4].schema(), other.formNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.blaBla)) {
        this.blaBla = data().deepCopy(fields()[5].schema(), other.blaBla);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'callSign' field.
      * @return The value.
      */
    public java.lang.String getCallSign() {
      return callSign;
    }

    /**
      * Sets the value of the 'callSign' field.
      * @param value The value of 'callSign'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder setCallSign(java.lang.String value) {
      validate(fields()[0], value);
      this.callSign = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'callSign' field has been set.
      * @return True if the 'callSign' field has been set, false otherwise.
      */
    public boolean hasCallSign() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'callSign' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder clearCallSign() {
      callSign = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'privateNetworkNumber' field.
      * @return The value.
      */
    public java.lang.Long getPrivateNetworkNumber() {
      return privateNetworkNumber;
    }

    /**
      * Sets the value of the 'privateNetworkNumber' field.
      * @param value The value of 'privateNetworkNumber'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder setPrivateNetworkNumber(long value) {
      validate(fields()[1], value);
      this.privateNetworkNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'privateNetworkNumber' field has been set.
      * @return True if the 'privateNetworkNumber' field has been set, false otherwise.
      */
    public boolean hasPrivateNetworkNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'privateNetworkNumber' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder clearPrivateNetworkNumber() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'globalNetworkNumber' field.
      * @return The value.
      */
    public java.lang.Long getGlobalNetworkNumber() {
      return globalNetworkNumber;
    }

    /**
      * Sets the value of the 'globalNetworkNumber' field.
      * @param value The value of 'globalNetworkNumber'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder setGlobalNetworkNumber(long value) {
      validate(fields()[2], value);
      this.globalNetworkNumber = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'globalNetworkNumber' field has been set.
      * @return True if the 'globalNetworkNumber' field has been set, false otherwise.
      */
    public boolean hasGlobalNetworkNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'globalNetworkNumber' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder clearGlobalNetworkNumber() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'blaBlaSecond' field.
      * @return The value.
      */
    public java.lang.Integer getBlaBlaSecond() {
      return blaBlaSecond;
    }

    /**
      * Sets the value of the 'blaBlaSecond' field.
      * @param value The value of 'blaBlaSecond'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder setBlaBlaSecond(java.lang.Integer value) {
      validate(fields()[3], value);
      this.blaBlaSecond = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'blaBlaSecond' field has been set.
      * @return True if the 'blaBlaSecond' field has been set, false otherwise.
      */
    public boolean hasBlaBlaSecond() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'blaBlaSecond' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder clearBlaBlaSecond() {
      blaBlaSecond = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'formNumber' field.
      * @return The value.
      */
    public java.lang.Integer getFormNumber() {
      return formNumber;
    }

    /**
      * Sets the value of the 'formNumber' field.
      * @param value The value of 'formNumber'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder setFormNumber(int value) {
      validate(fields()[4], value);
      this.formNumber = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'formNumber' field has been set.
      * @return True if the 'formNumber' field has been set, false otherwise.
      */
    public boolean hasFormNumber() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'formNumber' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder clearFormNumber() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'blaBla' field.
      * @return The value.
      */
    public java.lang.Integer getBlaBla() {
      return blaBla;
    }

    /**
      * Sets the value of the 'blaBla' field.
      * @param value The value of 'blaBla'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder setBlaBla(java.lang.Integer value) {
      validate(fields()[5], value);
      this.blaBla = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'blaBla' field has been set.
      * @return True if the 'blaBla' field has been set, false otherwise.
      */
    public boolean hasBlaBla() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'blaBla' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining.Builder clearBlaBla() {
      blaBla = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining build() {
      try {
        InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining record = new InitializeParametersDtDeletionOfNonNullableFieldAtTheBeggining();
        record.callSign = fieldSetFlags()[0] ? this.callSign : (java.lang.String) defaultValue(fields()[0]);
        record.privateNetworkNumber = fieldSetFlags()[1] ? this.privateNetworkNumber : (java.lang.Long) defaultValue(fields()[1]);
        record.globalNetworkNumber = fieldSetFlags()[2] ? this.globalNetworkNumber : (java.lang.Long) defaultValue(fields()[2]);
        record.blaBlaSecond = fieldSetFlags()[3] ? this.blaBlaSecond : (java.lang.Integer) defaultValue(fields()[3]);
        record.formNumber = fieldSetFlags()[4] ? this.formNumber : (java.lang.Integer) defaultValue(fields()[4]);
        record.blaBla = fieldSetFlags()[5] ? this.blaBla : (java.lang.Integer) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
