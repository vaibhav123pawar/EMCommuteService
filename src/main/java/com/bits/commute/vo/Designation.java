package com.bits.commute.vo;

public class Designation {
	private int designationId;
	private String designation;
	private String description;
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Designation [designationId=" + designationId + ", designation=" + designation + ", description="
				+ description + "]";
	}
	
}
