package com.bits.commute.vo;

public class Project {
	private int projectId;
	private String projectIdentifier;
	private String projectName;
	private String projectDescription;
	private boolean enableIndicator=true;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectIdentifier() {
		return projectIdentifier;
	}
	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	
	public boolean isEnableIndicator() {
		return enableIndicator;
	}
	public void setEnableIndicator(boolean enableIndicator) {
		this.enableIndicator = enableIndicator;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectIdentifier=" + projectIdentifier + ", projectName="
				+ projectName + ", projectDescription=" + projectDescription + ", enableIndicator=" + enableIndicator
				+ "]";
	}	
}
