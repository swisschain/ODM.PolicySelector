package com.swisschain.policy.selector;

public class SelectPolicyRequest {	
	private String tenantId;
	private String brokerId;
	private String accountId;
	private String blockchainId;
	private NetworkType networkType;
	private String address;
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getBrokerId() {
		return brokerId;
	}
	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getBlockchainId() {
		return blockchainId;
	}
	public void setBlockchainId(String blockchainId) {
		this.blockchainId = blockchainId;
	}
	public NetworkType getNetworkType() {
		return networkType;
	}
	public void setNetworkType(NetworkType networkType) {
		this.networkType = networkType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
}
