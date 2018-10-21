package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AccessEntitlementEvaluationResponse
 */
public class AccessEntitlementEvaluationResponse   {
  private String channelAccessProfileReference = null;

  private Object channelAccessProfileRecord = null;

  private Object channelAccessRestrictionsRecord = null;

  private Object channelAccessPreferencesRecord = null;

  private String customerReference = null;

  private Object evaluationResult = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return channelAccessProfileRecord
  **/

  public Object getChannelAccessProfileRecord() {
    return channelAccessProfileRecord;
  }

  public void setChannelAccessProfileRecord(Object channelAccessProfileRecord) {
    this.channelAccessProfileRecord = channelAccessProfileRecord;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return evaluationResult
  **/

  public Object getEvaluationResult() {
    return evaluationResult;
  }

  public void setEvaluationResult(Object evaluationResult) {
    this.evaluationResult = evaluationResult;
  }


}

