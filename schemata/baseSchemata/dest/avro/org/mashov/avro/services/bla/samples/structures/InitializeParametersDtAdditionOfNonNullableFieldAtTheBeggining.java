/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.mashov.avro.services.bla.samples.structures;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8625238533312733461L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining\",\"namespace\":\"org.mashov.avro.services.bla.samples.structures\",\"fields\":[{\"name\":\"callSignSecond\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"reportingSystemId\",\"type\":\"long\",\"default\":0},{\"name\":\"callSign\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"privateNetworkNumber\",\"type\":\"long\",\"default\":0},{\"name\":\"globalNetworkNumber\",\"type\":\"long\",\"default\":0},{\"name\":\"blaBlaSecond\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"formNumber\",\"type\":\"int\",\"default\":-1},{\"name\":\"blaBla\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String callSignSecond;
  @Deprecated public long reportingSystemId;
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
  public InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining() {}

  /**
   * All-args constructor.
   * @param callSignSecond The new value for callSignSecond
   * @param reportingSystemId The new value for reportingSystemId
   * @param callSign The new value for callSign
   * @param privateNetworkNumber The new value for privateNetworkNumber
   * @param globalNetworkNumber The new value for globalNetworkNumber
   * @param blaBlaSecond The new value for blaBlaSecond
   * @param formNumber The new value for formNumber
   * @param blaBla The new value for blaBla
   */
  public InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining(java.lang.String callSignSecond, java.lang.Long reportingSystemId, java.lang.String callSign, java.lang.Long privateNetworkNumber, java.lang.Long globalNetworkNumber, java.lang.Integer blaBlaSecond, java.lang.Integer formNumber, java.lang.Integer blaBla) {
    this.callSignSecond = callSignSecond;
    this.reportingSystemId = reportingSystemId;
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
    case 0: return callSignSecond;
    case 1: return reportingSystemId;
    case 2: return callSign;
    case 3: return privateNetworkNumber;
    case 4: return globalNetworkNumber;
    case 5: return blaBlaSecond;
    case 6: return formNumber;
    case 7: return blaBla;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: callSignSecond = (java.lang.String)value$; break;
    case 1: reportingSystemId = (java.lang.Long)value$; break;
    case 2: callSign = (java.lang.String)value$; break;
    case 3: privateNetworkNumber = (java.lang.Long)value$; break;
    case 4: globalNetworkNumber = (java.lang.Long)value$; break;
    case 5: blaBlaSecond = (java.lang.Integer)value$; break;
    case 6: formNumber = (java.lang.Integer)value$; break;
    case 7: blaBla = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'callSignSecond' field.
   * @return The value of the 'callSignSecond' field.
   */
  public java.lang.String getCallSignSecond() {
    return callSignSecond;
  }

  /**
   * Sets the value of the 'callSignSecond' field.
   * @param value the value to set.
   */
  public void setCallSignSecond(java.lang.String value) {
    this.callSignSecond = value;
  }

  /**
   * Gets the value of the 'reportingSystemId' field.
   * @return The value of the 'reportingSystemId' field.
   */
  public java.lang.Long getReportingSystemId() {
    return reportingSystemId;
  }

  /**
   * Sets the value of the 'reportingSystemId' field.
   * @param value the value to set.
   */
  public void setReportingSystemId(java.lang.Long value) {
    this.reportingSystemId = value;
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
   * Creates a new InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining RecordBuilder.
   * @return A new InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder newBuilder() {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder();
  }

  /**
   * Creates a new InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder newBuilder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder other) {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder(other);
  }

  /**
   * Creates a new InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining RecordBuilder by copying an existing InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining instance.
   * @param other The existing instance to copy.
   * @return A new InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder newBuilder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining other) {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder(other);
  }

  /**
   * RecordBuilder for InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining>
    implements org.apache.avro.data.RecordBuilder<InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining> {

    private java.lang.String callSignSecond;
    private long reportingSystemId;
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
    private Builder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.callSignSecond)) {
        this.callSignSecond = data().deepCopy(fields()[0].schema(), other.callSignSecond);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.reportingSystemId)) {
        this.reportingSystemId = data().deepCopy(fields()[1].schema(), other.reportingSystemId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.callSign)) {
        this.callSign = data().deepCopy(fields()[2].schema(), other.callSign);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.privateNetworkNumber)) {
        this.privateNetworkNumber = data().deepCopy(fields()[3].schema(), other.privateNetworkNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.globalNetworkNumber)) {
        this.globalNetworkNumber = data().deepCopy(fields()[4].schema(), other.globalNetworkNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.blaBlaSecond)) {
        this.blaBlaSecond = data().deepCopy(fields()[5].schema(), other.blaBlaSecond);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.formNumber)) {
        this.formNumber = data().deepCopy(fields()[6].schema(), other.formNumber);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.blaBla)) {
        this.blaBla = data().deepCopy(fields()[7].schema(), other.blaBla);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.callSignSecond)) {
        this.callSignSecond = data().deepCopy(fields()[0].schema(), other.callSignSecond);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.reportingSystemId)) {
        this.reportingSystemId = data().deepCopy(fields()[1].schema(), other.reportingSystemId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.callSign)) {
        this.callSign = data().deepCopy(fields()[2].schema(), other.callSign);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.privateNetworkNumber)) {
        this.privateNetworkNumber = data().deepCopy(fields()[3].schema(), other.privateNetworkNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.globalNetworkNumber)) {
        this.globalNetworkNumber = data().deepCopy(fields()[4].schema(), other.globalNetworkNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.blaBlaSecond)) {
        this.blaBlaSecond = data().deepCopy(fields()[5].schema(), other.blaBlaSecond);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.formNumber)) {
        this.formNumber = data().deepCopy(fields()[6].schema(), other.formNumber);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.blaBla)) {
        this.blaBla = data().deepCopy(fields()[7].schema(), other.blaBla);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'callSignSecond' field.
      * @return The value.
      */
    public java.lang.String getCallSignSecond() {
      return callSignSecond;
    }

    /**
      * Sets the value of the 'callSignSecond' field.
      * @param value The value of 'callSignSecond'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder setCallSignSecond(java.lang.String value) {
      validate(fields()[0], value);
      this.callSignSecond = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'callSignSecond' field has been set.
      * @return True if the 'callSignSecond' field has been set, false otherwise.
      */
    public boolean hasCallSignSecond() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'callSignSecond' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder clearCallSignSecond() {
      callSignSecond = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'reportingSystemId' field.
      * @return The value.
      */
    public java.lang.Long getReportingSystemId() {
      return reportingSystemId;
    }

    /**
      * Sets the value of the 'reportingSystemId' field.
      * @param value The value of 'reportingSystemId'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder setReportingSystemId(long value) {
      validate(fields()[1], value);
      this.reportingSystemId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'reportingSystemId' field has been set.
      * @return True if the 'reportingSystemId' field has been set, false otherwise.
      */
    public boolean hasReportingSystemId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'reportingSystemId' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder clearReportingSystemId() {
      fieldSetFlags()[1] = false;
      return this;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder setCallSign(java.lang.String value) {
      validate(fields()[2], value);
      this.callSign = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'callSign' field has been set.
      * @return True if the 'callSign' field has been set, false otherwise.
      */
    public boolean hasCallSign() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'callSign' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder clearCallSign() {
      callSign = null;
      fieldSetFlags()[2] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder setPrivateNetworkNumber(long value) {
      validate(fields()[3], value);
      this.privateNetworkNumber = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'privateNetworkNumber' field has been set.
      * @return True if the 'privateNetworkNumber' field has been set, false otherwise.
      */
    public boolean hasPrivateNetworkNumber() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'privateNetworkNumber' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder clearPrivateNetworkNumber() {
      fieldSetFlags()[3] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder setGlobalNetworkNumber(long value) {
      validate(fields()[4], value);
      this.globalNetworkNumber = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'globalNetworkNumber' field has been set.
      * @return True if the 'globalNetworkNumber' field has been set, false otherwise.
      */
    public boolean hasGlobalNetworkNumber() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'globalNetworkNumber' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder clearGlobalNetworkNumber() {
      fieldSetFlags()[4] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder setBlaBlaSecond(java.lang.Integer value) {
      validate(fields()[5], value);
      this.blaBlaSecond = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'blaBlaSecond' field has been set.
      * @return True if the 'blaBlaSecond' field has been set, false otherwise.
      */
    public boolean hasBlaBlaSecond() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'blaBlaSecond' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder clearBlaBlaSecond() {
      blaBlaSecond = null;
      fieldSetFlags()[5] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder setFormNumber(int value) {
      validate(fields()[6], value);
      this.formNumber = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'formNumber' field has been set.
      * @return True if the 'formNumber' field has been set, false otherwise.
      */
    public boolean hasFormNumber() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'formNumber' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder clearFormNumber() {
      fieldSetFlags()[6] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder setBlaBla(java.lang.Integer value) {
      validate(fields()[7], value);
      this.blaBla = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'blaBla' field has been set.
      * @return True if the 'blaBla' field has been set, false otherwise.
      */
    public boolean hasBlaBla() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'blaBla' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining.Builder clearBlaBla() {
      blaBla = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining build() {
      try {
        InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining record = new InitializeParametersDtAdditionOfNonNullableFieldAtTheBeggining();
        record.callSignSecond = fieldSetFlags()[0] ? this.callSignSecond : (java.lang.String) defaultValue(fields()[0]);
        record.reportingSystemId = fieldSetFlags()[1] ? this.reportingSystemId : (java.lang.Long) defaultValue(fields()[1]);
        record.callSign = fieldSetFlags()[2] ? this.callSign : (java.lang.String) defaultValue(fields()[2]);
        record.privateNetworkNumber = fieldSetFlags()[3] ? this.privateNetworkNumber : (java.lang.Long) defaultValue(fields()[3]);
        record.globalNetworkNumber = fieldSetFlags()[4] ? this.globalNetworkNumber : (java.lang.Long) defaultValue(fields()[4]);
        record.blaBlaSecond = fieldSetFlags()[5] ? this.blaBlaSecond : (java.lang.Integer) defaultValue(fields()[5]);
        record.formNumber = fieldSetFlags()[6] ? this.formNumber : (java.lang.Integer) defaultValue(fields()[6]);
        record.blaBla = fieldSetFlags()[7] ? this.blaBla : (java.lang.Integer) defaultValue(fields()[7]);
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