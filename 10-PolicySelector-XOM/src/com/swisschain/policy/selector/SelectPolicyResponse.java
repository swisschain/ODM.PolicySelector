package com.swisschain.policy.selector;

public class SelectPolicyResponse {
	private SelectPolicyResult result;
	private String policyService;
	private String policyServiceVersion;
	private String policy;
	private String policyVersion;
	
	public SelectPolicyResult getResult() {
		return result;
	}
	public void setResult(SelectPolicyResult result) {
		this.result = result;
	}
	public String getPolicyService() {
		return policyService;
	}
	public void setPolicyService(String policyService) {
		this.policyService = policyService;
	}
	public String getPolicyServiceVersion() {
		return policyServiceVersion;
	}
	public void setPolicyServiceVersion(String policyServiceVersion) {
		this.policyServiceVersion = policyServiceVersion;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public String getPolicyVersion() {
		return policyVersion;
	}
	public void setPolicyVersion(String policyVersion) {
		this.policyVersion = policyVersion;
	}
	@Override
	public String toString() {
		return "SelectPolicyResponse [result=" + result + ", policyService=" + policyService + ", policyServiceVersion="
				+ policyServiceVersion + ", policy=" + policy + ", policyVersion=" + policyVersion + "]";
	}
	
	public static SelectPolicyResponse create(SelectPolicyResult result, String policyService, String policyServiceVersion,
			String policy, String policyVersion) {
		SelectPolicyResponse response = new SelectPolicyResponse();
		response.result = result;
		response.policyService = policyService;
		response.policyServiceVersion = policyServiceVersion;
		response.policy = policy;
		response.policyVersion = policyVersion;
		return response;
	}
}
