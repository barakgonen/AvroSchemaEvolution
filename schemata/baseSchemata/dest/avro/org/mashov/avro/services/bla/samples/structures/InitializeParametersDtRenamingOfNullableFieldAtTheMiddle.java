/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.mashov.avro.services.bla.samples.structures;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InitializeParametersDtRenamingOfNullableFieldAtTheMiddle extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1378627173696175136L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InitializeParametersDtRenamingOfNullableFieldAtTheMiddle\",\"namespace\":\"org.mashov.avro.services.bla.samples.structures\",\"fields\":[{\"name\":\"reportingSystemId\",\"type\":\"long\",\"default\":0},{\"name\":\"callSign\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"privateNetworkNumber\",\"type\":\"long\",\"default\":0},{\"name\":\"globalNetworkNumber\",\"type\":\"long\",\"default\":0},{\"name\":\"blaBlaSecondModifided\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"formNumber\",\"type\":\"int\",\"default\":-1},{\"name\":\"blaBla\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long reportingSystemId;
  @Deprecated public java.lang.String callSign;
  @Deprecated public long privateNetworkNumber;
  @Deprecated public long globalNetworkNumber;
  @Deprecated public java.lang.Integer blaBlaSecondModifided;
  @Deprecated public int formNumber;
  @Deprecated public java.lang.Integer blaBla;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InitializeParametersDtRenamingOfNullableFieldAtTheMiddle() {}

  /**
   * All-args constructor.
   * @param reportingSystemId The new value for reportingSystemId
   * @param callSign The new value for callSign
   * @param privateNetworkNumber The new value for privateNetworkNumber
   * @param globalNetworkNumber The new value for globalNetworkNumber
   * @param blaBlaSecondModifided The new value for blaBlaSecondModifided
   * @param formNumber The new value for formNumber
   * @param blaBla The new value for blaBla
   */
  public InitializeParametersDtRenamingOfNullableFieldAtTheMiddle(java.lang.Long reportingSystemId, java.lang.String callSign, java.lang.Long privateNetworkNumber, java.lang.Long globalNetworkNumber, java.lang.Integer blaBlaSecondModifided, java.lang.Integer formNumber, java.lang.Integer blaBla) {
    this.reportingSystemId = reportingSystemId;
    this.callSign = callSign;
    this.privateNetworkNumber = privateNetworkNumber;
    this.globalNetworkNumber = globalNetworkNumber;
    this.blaBlaSecondModifided = blaBlaSecondModifided;
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
    case 4: return blaBlaSecondModifided;
    case 5: return formNumber;
    case 6: return blaBla;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reportingSystemId = (java.lang.Long)value$; break;
    case 1: callSign = (java.lang.String)value$; break;
    case 2: privateNetworkNumber = (java.lang.Long)value$; break;
    case 3: globalNetworkNumber = (java.lang.Long)value$; break;
    case 4: blaBlaSecondModifided = (java.lang.Integer)value$; break;
    case 5: formNumber = (java.lang.Integer)value$; break;
    case 6: blaBla = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'blaBlaSecondModifided' field.
   * @return The value of the 'blaBlaSecondModifided' field.
   */
  public java.lang.Integer getBlaBlaSecondModifided() {
    return blaBlaSecondModifided;
  }

  /**
   * Sets the value of the 'blaBlaSecondModifided' field.
   * @param value the value to set.
   */
  public void setBlaBlaSecondModifided(java.lang.Integer value) {
    this.blaBlaSecondModifided = value;
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
   * Creates a new InitializeParametersDtRenamingOfNullableFieldAtTheMiddle RecordBuilder.
   * @return A new InitializeParametersDtRenamingOfNullableFieldAtTheMiddle RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder newBuilder() {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder();
  }

  /**
   * Creates a new InitializeParametersDtRenamingOfNullableFieldAtTheMiddle RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InitializeParametersDtRenamingOfNullableFieldAtTheMiddle RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder newBuilder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder other) {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder(other);
  }

  /**
   * Creates a new InitializeParametersDtRenamingOfNullableFieldAtTheMiddle RecordBuilder by copying an existing InitializeParametersDtRenamingOfNullableFieldAtTheMiddle instance.
   * @param other The existing instance to copy.
   * @return A new InitializeParametersDtRenamingOfNullableFieldAtTheMiddle RecordBuilder
   */
  public static org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder newBuilder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle other) {
    return new org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder(other);
  }

  /**
   * RecordBuilder for InitializeParametersDtRenamingOfNullableFieldAtTheMiddle instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InitializeParametersDtRenamingOfNullableFieldAtTheMiddle>
    implements org.apache.avro.data.RecordBuilder<InitializeParametersDtRenamingOfNullableFieldAtTheMiddle> {

    private long reportingSystemId;
    private java.lang.String callSign;
    private long privateNetworkNumber;
    private long globalNetworkNumber;
    private java.lang.Integer blaBlaSecondModifided;
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
    private Builder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder other) {
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
      if (isValidValue(fields()[4], other.blaBlaSecondModifided)) {
        this.blaBlaSecondModifided = data().deepCopy(fields()[4].schema(), other.blaBlaSecondModifided);
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
     * Creates a Builder by copying an existing InitializeParametersDtRenamingOfNullableFieldAtTheMiddle instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle other) {
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
      if (isValidValue(fields()[4], other.blaBlaSecondModifided)) {
        this.blaBlaSecondModifided = data().deepCopy(fields()[4].schema(), other.blaBlaSecondModifided);
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
    public java.lang.Long getReportingSystemId() {
      return reportingSystemId;
    }

    /**
      * Sets the value of the 'reportingSystemId' field.
      * @param value The value of 'reportingSystemId'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder setReportingSystemId(long value) {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder clearReportingSystemId() {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder setCallSign(java.lang.String value) {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder clearCallSign() {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder setPrivateNetworkNumber(long value) {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder clearPrivateNetworkNumber() {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder setGlobalNetworkNumber(long value) {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder clearGlobalNetworkNumber() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'blaBlaSecondModifided' field.
      * @return The value.
      */
    public java.lang.Integer getBlaBlaSecondModifided() {
      return blaBlaSecondModifided;
    }

    /**
      * Sets the value of the 'blaBlaSecondModifided' field.
      * @param value The value of 'blaBlaSecondModifided'.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder setBlaBlaSecondModifided(java.lang.Integer value) {
      validate(fields()[4], value);
      this.blaBlaSecondModifided = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'blaBlaSecondModifided' field has been set.
      * @return True if the 'blaBlaSecondModifided' field has been set, false otherwise.
      */
    public boolean hasBlaBlaSecondModifided() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'blaBlaSecondModifided' field.
      * @return This builder.
      */
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder clearBlaBlaSecondModifided() {
      blaBlaSecondModifided = null;
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder setFormNumber(int value) {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder clearFormNumber() {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder setBlaBla(java.lang.Integer value) {
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
    public org.mashov.avro.services.bla.samples.structures.InitializeParametersDtRenamingOfNullableFieldAtTheMiddle.Builder clearBlaBla() {
      blaBla = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public InitializeParametersDtRenamingOfNullableFieldAtTheMiddle build() {
      try {
        InitializeParametersDtRenamingOfNullableFieldAtTheMiddle record = new InitializeParametersDtRenamingOfNullableFieldAtTheMiddle();
        record.reportingSystemId = fieldSetFlags()[0] ? this.reportingSystemId : (java.lang.Long) defaultValue(fields()[0]);
        record.callSign = fieldSetFlags()[1] ? this.callSign : (java.lang.String) defaultValue(fields()[1]);
        record.privateNetworkNumber = fieldSetFlags()[2] ? this.privateNetworkNumber : (java.lang.Long) defaultValue(fields()[2]);
        record.globalNetworkNumber = fieldSetFlags()[3] ? this.globalNetworkNumber : (java.lang.Long) defaultValue(fields()[3]);
        record.blaBlaSecondModifided = fieldSetFlags()[4] ? this.blaBlaSecondModifided : (java.lang.Integer) defaultValue(fields()[4]);
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
