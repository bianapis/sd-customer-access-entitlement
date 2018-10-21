/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.AgreeTerms;

@BianRestController
public class CustomerAccessEntitlementApiController {

	@Autowired
	CustomerAccessEntitlementApiService service;
	
	@BQ("preferences")
	@AgreeTerms.Initiate
	public BianResponse<PreferenceBaseWithIds> initiatePreferences(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PreferenceBase> bianRequest) {
		return BianResponse.forSuccess(service.initiatePreferences(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("restrictions")
	@AgreeTerms.Initiate
	public BianResponse<RestrictionsBaseWIthIds> initiateRestrictions(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RestrictionsBase> bianRequest) {
		return BianResponse.forSuccess(service.initiateRestrictions(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.RequestPut
	public BianResponse<AccessEntitlementRefreshResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AccessEntitlement> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@AgreeTerms.Retrieve
	public BianResponse<AccessEntitlementWithIds> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@AgreeTerms.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@AgreeTerms.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("preferences")
	@AgreeTerms.Retrieve
	public BianResponse<PreferenceBaseWithIds> retrievePreferences(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePreferences(crReferenceId, bqReferenceId));
	}
	
	@BQ("restrictions")
	@AgreeTerms.Retrieve
	public BianResponse<RestrictionsBaseWIthIds> retrieveRestrictions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRestrictions(crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@AgreeTerms.Update
	public BianResponse<AccessEntitlementWithIds> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AccessEntitlement> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
