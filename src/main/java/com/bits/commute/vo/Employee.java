package com.bits.commute.vo;

public class Employee {
	private int employeeId;
	private Person personalDetails;
	private Designation designation;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Person getPersonalDetails() {
		return personalDetails;
	}
	public void setPersonalDetails(Person personalDetails) {
		this.personalDetails = personalDetails;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", personalDetails=" + personalDetails + ", designation="
				+ designation + "]";
	}
	
}
