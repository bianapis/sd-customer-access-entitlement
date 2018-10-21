/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerAccessEntitlementApiService {

	PreferenceBaseWithIds initiatePreferences(String crReferenceId, PreferenceBase request);
	
	RestrictionsBaseWIthIds initiateRestrictions(String crReferenceId, RestrictionsBase request);
	
	AccessEntitlementRefreshResponse requestPut(String crReferenceId, AccessEntitlement request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	AccessEntitlementWithIds retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	PreferenceBaseWithIds retrievePreferences(String crReferenceId, String bqReferenceId);
	
	RestrictionsBaseWIthIds retrieveRestrictions(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	AccessEntitlementWithIds update(String crReferenceId, AccessEntitlement request);
	
}
