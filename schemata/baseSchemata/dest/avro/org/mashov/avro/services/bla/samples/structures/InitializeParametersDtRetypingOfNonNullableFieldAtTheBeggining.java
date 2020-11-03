/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.mashov.avro.services.bla.samples.structures;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6212399546000246842L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining\",\"namespace\":\"org.mashov.avro.services.bla.samples.structures\",\"fields\":[{\"name\":\"reportingSystemId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"callSign\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"privateNetworkNumber\",\"type\":\"long\",\"default\":0},{\"name\":\"globalNetworkNumber\",\"type\":\"long\",\"default\":0},{\"name\":\"blaBlaSecond\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"formNumber\",\"type\":\"int\",\"default\":-1},{\"name\":\"blaBla\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String reportingSystemId;
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
  public InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining() {}

  /**
   * All-args constructor.
   * @param reportingSystemId The new value for reportingSystemId
   * @param callSign The new value for callSign
   * @param privateNetworkNumber The new value for privateNetworkNumber
   * @param globalNetworkNumber The new value for globalNetworkNumber
   * @param blaBlaSecond The new value for blaBlaSecond
   * @param formNumber The new value for formNumber
   * @param blaBla The new value for blaBla
   */
  public InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining(java.lang.String reportingSystemId, java.lang.String callSign, java.lang.Long privateNetworkNumber, java.lang.Long globalNetworkNumber, java.lang.Integer blaBlaSecond, java.lang.Integer formNumber, java.lang.Integer blaBla) {
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
    case 0: return reportingSystemId;
    case 1: return callSign;
    case 2: return privateNetworkNumber;
    case 3: return globalNetworkNumber;
    case 4: return blaBlaSecond;
    case 5: return formNumber;
    case 6: return blaBla;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reportingSystemId = (java.lang.String)value$; break;
    case 1: callSign = (java.lang.String)value$; break;
    case 2: privateNetworkNumber = (java.lang.Long)value$; break;
    case 3: globalNetworkNumber = (java.lang.Long)value$; break;
    case 4: blaBlaSecond = (java.lang.Integer)value$; break;
    case 5: formNumber = (java.lang.Integer)value$; break;
    case 6: blaBla = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'reportingSystemId' field.
   * @return The value of the 'reportingSystemId' field.
   */
  public java.lang.String getReportingSystemId() {
    return reportingSystemId;
  }

  /**
   * Sets the value of the 'reportingSystemId' field.
   * @param value the value to set.
   */
  public void setReportingSystemId(java.lang.String value) {
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
   * Creates a new InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining RecordBuilder.
   * @return A new InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder newBuilder() {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder();
  }

  /**
   * Creates a new InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder newBuilder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder other) {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder(other);
  }

  /**
   * Creates a new InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining RecordBuilder by copying an existing InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining instance.
   * @param other The existing instance to copy.
   * @return A new InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder newBuilder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining other) {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder(other);
  }

  /**
   * RecordBuilder for InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining>
    implements org.apache.avro.data.RecordBuilder<InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining> {

    private java.lang.String reportingSystemId;
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
    private Builder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reportingSystemId)) {
        this.reportingSystemId = data().deepCopy(fields()[0].schema(), other.reportingSystemId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.callSign)) {
        this.callSign = data().deepCopy(fields()[1].schema(), other.callSign);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.privateNetworkNumber)) {
        this.privateNetworkNumber = data().deepCopy(fields()[2].schema(), other.privateNetworkNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.globalNetworkNumber)) {
        this.globalNetworkNumber = data().deepCopy(fields()[3].schema(), other.globalNetworkNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.blaBlaSecond)) {
        this.blaBlaSecond = data().deepCopy(fields()[4].schema(), other.blaBlaSecond);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.formNumber)) {
        this.formNumber = data().deepCopy(fields()[5].schema(), other.formNumber);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.blaBla)) {
        this.blaBla = data().deepCopy(fields()[6].schema(), other.blaBla);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.reportingSystemId)) {
        this.reportingSystemId = data().deepCopy(fields()[0].schema(), other.reportingSystemId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.callSign)) {
        this.callSign = data().deepCopy(fields()[1].schema(), other.callSign);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.privateNetworkNumber)) {
        this.privateNetworkNumber = data().deepCopy(fields()[2].schema(), other.privateNetworkNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.globalNetworkNumber)) {
        this.globalNetworkNumber = data().deepCopy(fields()[3].schema(), other.globalNetworkNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.blaBlaSecond)) {
        this.blaBlaSecond = data().deepCopy(fields()[4].schema(), other.blaBlaSecond);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.formNumber)) {
        this.formNumber = data().deepCopy(fields()[5].schema(), other.formNumber);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.blaBla)) {
        this.blaBla = data().deepCopy(fields()[6].schema(), other.blaBla);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'reportingSystemId' field.
      * @return The value.
      */
    public java.lang.String getReportingSystemId() {
      return reportingSystemId;
    }

    /**
      * Sets the value of the 'reportingSystemId' field.
      * @param value The value of 'reportingSystemId'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder setReportingSystemId(java.lang.String value) {
      validate(fields()[0], value);
      this.reportingSystemId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'reportingSystemId' field has been set.
      * @return True if the 'reportingSystemId' field has been set, false otherwise.
      */
    public boolean hasReportingSystemId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'reportingSystemId' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder clearReportingSystemId() {
      reportingSystemId = null;
      fieldSetFlags()[0] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder setCallSign(java.lang.String value) {
      validate(fields()[1], value);
      this.callSign = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'callSign' field has been set.
      * @return True if the 'callSign' field has been set, false otherwise.
      */
    public boolean hasCallSign() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'callSign' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder clearCallSign() {
      callSign = null;
      fieldSetFlags()[1] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder setPrivateNetworkNumber(long value) {
      validate(fields()[2], value);
      this.privateNetworkNumber = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'privateNetworkNumber' field has been set.
      * @return True if the 'privateNetworkNumber' field has been set, false otherwise.
      */
    public boolean hasPrivateNetworkNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'privateNetworkNumber' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder clearPrivateNetworkNumber() {
      fieldSetFlags()[2] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder setGlobalNetworkNumber(long value) {
      validate(fields()[3], value);
      this.globalNetworkNumber = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'globalNetworkNumber' field has been set.
      * @return True if the 'globalNetworkNumber' field has been set, false otherwise.
      */
    public boolean hasGlobalNetworkNumber() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'globalNetworkNumber' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder clearGlobalNetworkNumber() {
      fieldSetFlags()[3] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder setBlaBlaSecond(java.lang.Integer value) {
      validate(fields()[4], value);
      this.blaBlaSecond = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'blaBlaSecond' field has been set.
      * @return True if the 'blaBlaSecond' field has been set, false otherwise.
      */
    public boolean hasBlaBlaSecond() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'blaBlaSecond' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder clearBlaBlaSecond() {
      blaBlaSecond = null;
      fieldSetFlags()[4] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder setFormNumber(int value) {
      validate(fields()[5], value);
      this.formNumber = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'formNumber' field has been set.
      * @return True if the 'formNumber' field has been set, false otherwise.
      */
    public boolean hasFormNumber() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'formNumber' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder clearFormNumber() {
      fieldSetFlags()[5] = false;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder setBlaBla(java.lang.Integer value) {
      validate(fields()[6], value);
      this.blaBla = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'blaBla' field has been set.
      * @return True if the 'blaBla' field has been set, false otherwise.
      */
    public boolean hasBlaBla() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'blaBla' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining.Builder clearBlaBla() {
      blaBla = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining build() {
      try {
        InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining record = new InitializeParametersDtRetypingOfNonNullableFieldAtTheBeggining();
        record.reportingSystemId = fieldSetFlags()[0] ? this.reportingSystemId : (java.lang.String) defaultValue(fields()[0]);
        record.callSign = fieldSetFlags()[1] ? this.callSign : (java.lang.String) defaultValue(fields()[1]);
        record.privateNetworkNumber = fieldSetFlags()[2] ? this.privateNetworkNumber : (java.lang.Long) defaultValue(fields()[2]);
        record.globalNetworkNumber = fieldSetFlags()[3] ? this.globalNetworkNumber : (java.lang.Long) defaultValue(fields()[3]);
        record.blaBlaSecond = fieldSetFlags()[4] ? this.blaBlaSecond : (java.lang.Integer) defaultValue(fields()[4]);
        record.formNumber = fieldSetFlags()[5] ? this.formNumber : (java.lang.Integer) defaultValue(fields()[5]);
        record.blaBla = fieldSetFlags()[6] ? this.blaBla : (java.lang.Integer) defaultValue(fields()[6]);
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
