package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RestrictionsBaseWIthIds
 */
public class RestrictionsBaseWIthIds   {
  private String channelAccessProfileReference = null;

  private String channelAccessRestrictionsRecordReference = null;

  private Object channelAccessRestrictionsRecord = null;

  private String channelAccessProductServiceTypeUsage = null;

  private String channelAccessProductServiceChannelDeviceRestrictions = null;

  private String channelAccessProductServiceLocationRestrictions = null;

  private String channelAccessProductServiceFrequencyLimitRestrictions = null;

  private String channelAccessProductServiceTimeDurationRestrictions = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return channelAccessProfileReference
  **/

  public String getChannelAccessProfileReference() {
    return channelAccessProfileReference;
  }

  public void setChannelAccessProfileReference(String channelAccessProfileReference) {
    this.channelAccessProfileReference = channelAccessProfileReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return channelAccessRestrictionsRecordReference
  **/

  public String getChannelAccessRestrictionsRecordReference() {
    return channelAccessRestrictionsRecordReference;
  }

  public void setChannelAccessRestrictionsRecordReference(String channelAccessRestrictionsRecordReference) {
    this.channelAccessRestrictionsRecordReference = channelAccessRestrictionsRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return channelAccessRestrictionsRecord
  **/

  public Object getChannelAccessRestrictionsRecord() {
    return channelAccessRestrictionsRecord;
  }

  public void setChannelAccessRestrictionsRecord(Object channelAccessRestrictionsRecord) {
    this.channelAccessRestrictionsRecord = channelAccessRestrictionsRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessProductServiceTypeUsage
  **/

  public String getChannelAccessProductServiceTypeUsage() {
    return channelAccessProductServiceTypeUsage;
  }

  public void setChannelAccessProductServiceTypeUsage(String channelAccessProductServiceTypeUsage) {
    this.channelAccessProductServiceTypeUsage = channelAccessProductServiceTypeUsage;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessProductServiceChannelDeviceRestrictions
  **/

  public String getChannelAccessProductServiceChannelDeviceRestrictions() {
    return channelAccessProductServiceChannelDeviceRestrictions;
  }

  public void setChannelAccessProductServiceChannelDeviceRestrictions(String channelAccessProductServiceChannelDeviceRestrictions) {
    this.channelAccessProductServiceChannelDeviceRestrictions = channelAccessProductServiceChannelDeviceRestrictions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessProductServiceLocationRestrictions
  **/

  public String getChannelAccessProductServiceLocationRestrictions() {
    return channelAccessProductServiceLocationRestrictions;
  }

  public void setChannelAccessProductServiceLocationRestrictions(String channelAccessProductServiceLocationRestrictions) {
    this.channelAccessProductServiceLocationRestrictions = channelAccessProductServiceLocationRestrictions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessProductServiceFrequencyLimitRestrictions
  **/

  public String getChannelAccessProductServiceFrequencyLimitRestrictions() {
    return channelAccessProductServiceFrequencyLimitRestrictions;
  }

  public void setChannelAccessProductServiceFrequencyLimitRestrictions(String channelAccessProductServiceFrequencyLimitRestrictions) {
    this.channelAccessProductServiceFrequencyLimitRestrictions = channelAccessProductServiceFrequencyLimitRestrictions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessProductServiceTimeDurationRestrictions
  **/

  public String getChannelAccessProductServiceTimeDurationRestrictions() {
    return channelAccessProductServiceTimeDurationRestrictions;
  }

  public void setChannelAccessProductServiceTimeDurationRestrictions(String channelAccessProductServiceTimeDurationRestrictions) {
    this.channelAccessProductServiceTimeDurationRestrictions = channelAccessProductServiceTimeDurationRestrictions;
  }


}

