/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.mashov.bla.schema.data.entity;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** blablablabla */
@org.apache.avro.specific.AvroGenerated
public class InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8354864165452172606L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd\",\"namespace\":\"org.mashov.bla.schema.data.entity\",\"doc\":\"blablablabla\",\"fields\":[{\"name\":\"first\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"bbbbbbb\",\"default\":null},{\"name\":\"second\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":null},{\"name\":\"third\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":null},{\"name\":\"forthModifided\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":\"defaultEmpty\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** bbbbbbb */
  @Deprecated public java.lang.String first;
  /** bbbbbbb */
  @Deprecated public java.lang.String second;
  /** bbbbbbb */
  @Deprecated public java.lang.String third;
  /** bbbbbbb */
  @Deprecated public java.lang.String forthModifided;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd() {}

  /**
   * All-args constructor.
   * @param first bbbbbbb
   * @param second bbbbbbb
   * @param third bbbbbbb
   * @param forthModifided bbbbbbb
   */
  public InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd(java.lang.String first, java.lang.String second, java.lang.String third, java.lang.String forthModifided) {
    this.first = first;
    this.second = second;
    this.third = third;
    this.forthModifided = forthModifided;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return first;
    case 1: return second;
    case 2: return third;
    case 3: return forthModifided;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: first = (java.lang.String)value$; break;
    case 1: second = (java.lang.String)value$; break;
    case 2: third = (java.lang.String)value$; break;
    case 3: forthModifided = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'first' field.
   * @return bbbbbbb
   */
  public java.lang.String getFirst() {
    return first;
  }

  /**
   * Sets the value of the 'first' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setFirst(java.lang.String value) {
    this.first = value;
  }

  /**
   * Gets the value of the 'second' field.
   * @return bbbbbbb
   */
  public java.lang.String getSecond() {
    return second;
  }

  /**
   * Sets the value of the 'second' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setSecond(java.lang.String value) {
    this.second = value;
  }

  /**
   * Gets the value of the 'third' field.
   * @return bbbbbbb
   */
  public java.lang.String getThird() {
    return third;
  }

  /**
   * Sets the value of the 'third' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setThird(java.lang.String value) {
    this.third = value;
  }

  /**
   * Gets the value of the 'forthModifided' field.
   * @return bbbbbbb
   */
  public java.lang.String getForthModifided() {
    return forthModifided;
  }

  /**
   * Sets the value of the 'forthModifided' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setForthModifided(java.lang.String value) {
    this.forthModifided = value;
  }

  /**
   * Creates a new InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd RecordBuilder.
   * @return A new InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd RecordBuilder
   */
  public static org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder newBuilder() {
    return new org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder();
  }

  /**
   * Creates a new InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd RecordBuilder
   */
  public static org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder newBuilder(org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder other) {
    return new org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder(other);
  }

  /**
   * Creates a new InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd RecordBuilder by copying an existing InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd instance.
   * @param other The existing instance to copy.
   * @return A new InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd RecordBuilder
   */
  public static org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder newBuilder(org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd other) {
    return new org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder(other);
  }

  /**
   * RecordBuilder for InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd>
    implements org.apache.avro.data.RecordBuilder<InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd> {

    /** bbbbbbb */
    private java.lang.String first;
    /** bbbbbbb */
    private java.lang.String second;
    /** bbbbbbb */
    private java.lang.String third;
    /** bbbbbbb */
    private java.lang.String forthModifided;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.first)) {
        this.first = data().deepCopy(fields()[0].schema(), other.first);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.second)) {
        this.second = data().deepCopy(fields()[1].schema(), other.second);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.third)) {
        this.third = data().deepCopy(fields()[2].schema(), other.third);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.forthModifided)) {
        this.forthModifided = data().deepCopy(fields()[3].schema(), other.forthModifided);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.first)) {
        this.first = data().deepCopy(fields()[0].schema(), other.first);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.second)) {
        this.second = data().deepCopy(fields()[1].schema(), other.second);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.third)) {
        this.third = data().deepCopy(fields()[2].schema(), other.third);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.forthModifided)) {
        this.forthModifided = data().deepCopy(fields()[3].schema(), other.forthModifided);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'first' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getFirst() {
      return first;
    }

    /**
      * Sets the value of the 'first' field.
      * bbbbbbb
      * @param value The value of 'first'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder setFirst(java.lang.String value) {
      validate(fields()[0], value);
      this.first = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'first' field has been set.
      * bbbbbbb
      * @return True if the 'first' field has been set, false otherwise.
      */
    public boolean hasFirst() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'first' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder clearFirst() {
      first = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'second' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getSecond() {
      return second;
    }

    /**
      * Sets the value of the 'second' field.
      * bbbbbbb
      * @param value The value of 'second'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder setSecond(java.lang.String value) {
      validate(fields()[1], value);
      this.second = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'second' field has been set.
      * bbbbbbb
      * @return True if the 'second' field has been set, false otherwise.
      */
    public boolean hasSecond() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'second' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder clearSecond() {
      second = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'third' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getThird() {
      return third;
    }

    /**
      * Sets the value of the 'third' field.
      * bbbbbbb
      * @param value The value of 'third'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder setThird(java.lang.String value) {
      validate(fields()[2], value);
      this.third = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'third' field has been set.
      * bbbbbbb
      * @return True if the 'third' field has been set, false otherwise.
      */
    public boolean hasThird() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'third' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder clearThird() {
      third = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'forthModifided' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getForthModifided() {
      return forthModifided;
    }

    /**
      * Sets the value of the 'forthModifided' field.
      * bbbbbbb
      * @param value The value of 'forthModifided'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder setForthModifided(java.lang.String value) {
      validate(fields()[3], value);
      this.forthModifided = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'forthModifided' field has been set.
      * bbbbbbb
      * @return True if the 'forthModifided' field has been set, false otherwise.
      */
    public boolean hasForthModifided() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'forthModifided' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd.Builder clearForthModifided() {
      forthModifided = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd build() {
      try {
        InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd record = new InitializeParametersDtRenamingOfNonNullableFieldAtTheEnd();
        record.first = fieldSetFlags()[0] ? this.first : (java.lang.String) defaultValue(fields()[0]);
        record.second = fieldSetFlags()[1] ? this.second : (java.lang.String) defaultValue(fields()[1]);
        record.third = fieldSetFlags()[2] ? this.third : (java.lang.String) defaultValue(fields()[2]);
        record.forthModifided = fieldSetFlags()[3] ? this.forthModifided : (java.lang.String) defaultValue(fields()[3]);
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
