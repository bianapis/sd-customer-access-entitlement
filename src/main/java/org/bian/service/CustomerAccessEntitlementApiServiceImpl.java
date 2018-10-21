/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerAccessEntitlementApiServiceImpl implements CustomerAccessEntitlementApiService {

	public PreferenceBaseWithIds initiatePreferences(String crReferenceId, PreferenceBase request){
		return JsonReader.read("initiate-PreferenceBaseWithIds.json",new TypeReference<PreferenceBaseWithIds>(){});
	}
	
	public RestrictionsBaseWIthIds initiateRestrictions(String crReferenceId, RestrictionsBase request){
		return JsonReader.read("initiate-RestrictionsBaseWIthIds.json",new TypeReference<RestrictionsBaseWIthIds>(){});
	}
	
	public AccessEntitlementRefreshResponse requestPut(String crReferenceId, AccessEntitlement request){
		return JsonReader.read("requestPut-AccessEntitlementRefreshResponse.json",new TypeReference<AccessEntitlementRefreshResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public AccessEntitlementWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-AccessEntitlementWithIds.json",new TypeReference<AccessEntitlementWithIds>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public PreferenceBaseWithIds retrievePreferences(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PreferenceBaseWithIds.json",new TypeReference<PreferenceBaseWithIds>(){});
	}
	
	public RestrictionsBaseWIthIds retrieveRestrictions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RestrictionsBaseWIthIds.json",new TypeReference<RestrictionsBaseWIthIds>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public AccessEntitlementWithIds update(String crReferenceId, AccessEntitlement request){
		return JsonReader.read("update-AccessEntitlementWithIds.json",new TypeReference<AccessEntitlementWithIds>(){});
	}
	
}
