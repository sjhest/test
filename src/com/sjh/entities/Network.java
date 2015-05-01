package com.sjh.entities;

public class Network {

	private Integer networkId;
	private String networkName;
	private int asNo;
	private String networkDesc;
	public Integer getNetworkId() {
		return networkId;
	}
	public void setNetworkId(Integer networkId) {
		this.networkId = networkId;
	}
	public String getNetworkName() {
		return networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	public int getAsNo() {
		return asNo;
	}
	public void setAsNo(int asNo) {
		this.asNo = asNo;
	}
	public String getNetworkDesc() {
		return networkDesc;
	}
	public void setNetworkDesc(String networkDesc) {
		this.networkDesc = networkDesc;
	}
	
	@Override
	public String toString() {
		return "Network [networkId=" + networkId + ", networkName="
				+ networkName + ", asNo=" + asNo + ", networkDesc="
				+ networkDesc + "]";
	}
	
	
	
}
