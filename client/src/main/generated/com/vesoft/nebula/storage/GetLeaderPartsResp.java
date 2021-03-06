/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class GetLeaderPartsResp implements TBase, java.io.Serializable, Cloneable, Comparable<GetLeaderPartsResp> {
  private static final TStruct STRUCT_DESC = new TStruct("GetLeaderPartsResp");
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField LEADER_PARTS_FIELD_DESC = new TField("leader_parts", TType.MAP, (short)2);

  public ResponseCommon result;
  public Map<Integer,List<Integer>> leader_parts;
  public static final int RESULT = 1;
  public static final int LEADER_PARTS = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(RESULT, new FieldMetaData("result", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ResponseCommon.class)));
    tmpMetaDataMap.put(LEADER_PARTS, new FieldMetaData("leader_parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new FieldValueMetaData(TType.I32)))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(GetLeaderPartsResp.class, metaDataMap);
  }

  public GetLeaderPartsResp() {
  }

  public GetLeaderPartsResp(
    ResponseCommon result)
  {
    this();
    this.result = result;
  }

  public GetLeaderPartsResp(
    ResponseCommon result,
    Map<Integer,List<Integer>> leader_parts)
  {
    this();
    this.result = result;
    this.leader_parts = leader_parts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetLeaderPartsResp(GetLeaderPartsResp other) {
    if (other.isSetResult()) {
      this.result = TBaseHelper.deepCopy(other.result);
    }
    if (other.isSetLeader_parts()) {
      this.leader_parts = TBaseHelper.deepCopy(other.leader_parts);
    }
  }

  public GetLeaderPartsResp deepCopy() {
    return new GetLeaderPartsResp(this);
  }

  @Deprecated
  public GetLeaderPartsResp clone() {
    return new GetLeaderPartsResp(this);
  }

  public ResponseCommon  getResult() {
    return this.result;
  }

  public GetLeaderPartsResp setResult(ResponseCommon result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  // Returns true if field result is set (has been assigned a value) and false otherwise
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public Map<Integer,List<Integer>>  getLeader_parts() {
    return this.leader_parts;
  }

  public GetLeaderPartsResp setLeader_parts(Map<Integer,List<Integer>> leader_parts) {
    this.leader_parts = leader_parts;
    return this;
  }

  public void unsetLeader_parts() {
    this.leader_parts = null;
  }

  // Returns true if field leader_parts is set (has been assigned a value) and false otherwise
  public boolean isSetLeader_parts() {
    return this.leader_parts != null;
  }

  public void setLeader_partsIsSet(boolean value) {
    if (!value) {
      this.leader_parts = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((ResponseCommon)value);
      }
      break;

    case LEADER_PARTS:
      if (value == null) {
        unsetLeader_parts();
      } else {
        setLeader_parts((Map<Integer,List<Integer>>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return getResult();

    case LEADER_PARTS:
      return getLeader_parts();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return isSetResult();
    case LEADER_PARTS:
      return isSetLeader_parts();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetLeaderPartsResp)
      return this.equals((GetLeaderPartsResp)that);
    return false;
  }

  public boolean equals(GetLeaderPartsResp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!TBaseHelper.equalsNobinary(this.result, that.result))
        return false;
    }

    boolean this_present_leader_parts = true && this.isSetLeader_parts();
    boolean that_present_leader_parts = true && that.isSetLeader_parts();
    if (this_present_leader_parts || that_present_leader_parts) {
      if (!(this_present_leader_parts && that_present_leader_parts))
        return false;
      if (!TBaseHelper.equalsNobinary(this.leader_parts, that.leader_parts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_result = true && (isSetResult());
    builder.append(present_result);
    if (present_result)
      builder.append(result);

    boolean present_leader_parts = true && (isSetLeader_parts());
    builder.append(present_leader_parts);
    if (present_leader_parts)
      builder.append(leader_parts);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(GetLeaderPartsResp other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(result, other.result);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetLeader_parts()).compareTo(other.isSetLeader_parts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(leader_parts, other.leader_parts);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case RESULT:
          if (field.type == TType.STRUCT) {
            this.result = new ResponseCommon();
            this.result.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LEADER_PARTS:
          if (field.type == TType.MAP) {
            {
              TMap _map183 = iprot.readMapBegin();
              this.leader_parts = new HashMap<Integer,List<Integer>>(Math.max(0, 2*_map183.size));
              for (int _i184 = 0; 
                   (_map183.size < 0) ? iprot.peekMap() : (_i184 < _map183.size); 
                   ++_i184)
              {
                int _key185;
                List<Integer> _val186;
                _key185 = iprot.readI32();
                {
                  TList _list187 = iprot.readListBegin();
                  _val186 = new ArrayList<Integer>(Math.max(0, _list187.size));
                  for (int _i188 = 0; 
                       (_list187.size < 0) ? iprot.peekList() : (_i188 < _list187.size); 
                       ++_i188)
                  {
                    int _elem189;
                    _elem189 = iprot.readI32();
                    _val186.add(_elem189);
                  }
                  iprot.readListEnd();
                }
                this.leader_parts.put(_key185, _val186);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.leader_parts != null) {
      oprot.writeFieldBegin(LEADER_PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.leader_parts.size()));
        for (Map.Entry<Integer, List<Integer>> _iter190 : this.leader_parts.entrySet())        {
          oprot.writeI32(_iter190.getKey());
          {
            oprot.writeListBegin(new TList(TType.I32, _iter190.getValue().size()));
            for (int _iter191 : _iter190.getValue())            {
              oprot.writeI32(_iter191);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("GetLeaderPartsResp");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("result");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getResult() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getResult(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("leader_parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getLeader_parts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getLeader_parts(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (result == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'result' was not present! Struct: " + toString());
    }
    // check that fields of type enum have valid values
  }

}

