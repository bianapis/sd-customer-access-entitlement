package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PreferenceBase
 */
public class PreferenceBase   {
  private Object channelAccessPreferencesRecord = null;

  private String customerReference = null;

  private String channelAccessPreferenceReference = null;

  private String channelAccessPreferenceProfile = null;

  private String channelAccessChannelDeviceType = null;

  private String channelAccessChannelDeviceTypePreference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return channelAccessPreferencesRecord
  **/

  public Object getChannelAccessPreferencesRecord() {
    return channelAccessPreferencesRecord;
  }

  public void setChannelAccessPreferencesRecord(Object channelAccessPreferencesRecord) {
    this.channelAccessPreferencesRecord = channelAccessPreferencesRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return channelAccessPreferenceReference
  **/

  public String getChannelAccessPreferenceReference() {
    return channelAccessPreferenceReference;
  }

  public void setChannelAccessPreferenceReference(String channelAccessPreferenceReference) {
    this.channelAccessPreferenceReference = channelAccessPreferenceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessPreferenceProfile
  **/

  public String getChannelAccessPreferenceProfile() {
    return channelAccessPreferenceProfile;
  }

  public void setChannelAccessPreferenceProfile(String channelAccessPreferenceProfile) {
    this.channelAccessPreferenceProfile = channelAccessPreferenceProfile;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessChannelDeviceType
  **/

  public String getChannelAccessChannelDeviceType() {
    return channelAccessChannelDeviceType;
  }

  public void setChannelAccessChannelDeviceType(String channelAccessChannelDeviceType) {
    this.channelAccessChannelDeviceType = channelAccessChannelDeviceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessChannelDeviceTypePreference
  **/

  public String getChannelAccessChannelDeviceTypePreference() {
    return channelAccessChannelDeviceTypePreference;
  }

  public void setChannelAccessChannelDeviceTypePreference(String channelAccessChannelDeviceTypePreference) {
    this.channelAccessChannelDeviceTypePreference = channelAccessChannelDeviceTypePreference;
  }


}

