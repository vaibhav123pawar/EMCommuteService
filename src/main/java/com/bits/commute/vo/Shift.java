package com.bits.commute.vo;

import java.sql.Time;

public class Shift {
	private int shiftId;
	private int shiftDetails;
	private Time startTime;
	private Time endTime;
	public int getShiftId() {
		return shiftId;
	}
	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}
	public int getShiftDetails() {
		return shiftDetails;
	}
	public void setShiftDetails(int shiftDetails) {
		this.shiftDetails = shiftDetails;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Shift [shiftId=" + shiftId + ", shiftDetails=" + shiftDetails + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}	
}
