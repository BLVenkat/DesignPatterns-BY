package com.bridgelabz.prototype;

public class Address implements Cloneable{

	private int addressId;
	
	private String hNo;
	
	private String state;

	
	public Address(int addressId, String hNo, String state) {
		super();
		this.addressId = addressId;
		this.hNo = hNo;
		this.state = state;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String gethNo() {
		return hNo;
	}

	public void sethNo(String hNo) {
		this.hNo = hNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", hNo=" + hNo + ", state=" + state + "]";
	}
	
	
}
