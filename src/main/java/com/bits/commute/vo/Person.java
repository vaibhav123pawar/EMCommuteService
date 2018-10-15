package com.bits.commute.vo;

public class Person {
	private int personId;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private Address permanentAddress;
	private Address communicationAddress;
	
	private String primaryContactNo;
	private String alternateContactNo;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Address getCommunicationAddress() {
		return communicationAddress;
	}
	public void setCommunicationAddress(Address communicationAddress) {
		this.communicationAddress = communicationAddress;
	}
	public String getPrimaryContactNo() {
		return primaryContactNo;
	}
	public void setPrimaryContactNo(String primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}
	public String getAlternateContactNo() {
		return alternateContactNo;
	}
	public void setAlternateContactNo(String alternateContactNo) {
		this.alternateContactNo = alternateContactNo;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", permanentAddress=" + permanentAddress + ", communicationAddress="
				+ communicationAddress + ", primaryContactNo=" + primaryContactNo + ", alternateContactNo="
				+ alternateContactNo + "]";
	}
	
}	
