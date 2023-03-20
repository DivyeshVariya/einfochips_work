package com.example.Day26_PracticeAssignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Show {

	@Id
	private String id;
	private String mname;
	private String sdate;
	private String sname;
	private long mobileNumber;
	private String bookingDate;
	private String tType;
	private int TotalAvailableEconomicTicket;
	private int TotalAvailablePlatinumTicket;
	private int Numberofseats;
	public int getNumberofseats() {
		return Numberofseats;
	}
	public void setNumberofseats(int numberofseats) {
		this.Numberofseats = numberofseats;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public int getTotalAvailableEconomicTicket() {
		return TotalAvailableEconomicTicket;
	}
	public void setTotalAvailableEconomicTicket(int totalAvailableEconomicTicket) {
		this.TotalAvailableEconomicTicket = totalAvailableEconomicTicket;
	}
	public int getTotalAvailablePlatinumTicket() {
		return TotalAvailablePlatinumTicket;
	}
	public void setTotalAvailablePlatinumTicket(int totalAvailablePlatinumTicket) {
		this.TotalAvailablePlatinumTicket = totalAvailablePlatinumTicket;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Show [id=" + id + ", mname=" + mname + ", sdate=" + sdate + ", sname=" + sname + ", mobileNumber="
				+ mobileNumber + ", bookingDate=" + bookingDate + ", tType=" + tType + ", TotalAvailableEconomicTicket="
				+ TotalAvailableEconomicTicket + ", TotalAvailablePlatinumTicket=" + TotalAvailablePlatinumTicket + "]";
	}
	public Show(String mname, String sdate, String sname, long mobileNumber, String tType) {
		super();
		this.mname = mname;
		this.sdate = sdate;
		this.sname = sname;
		this.mobileNumber = mobileNumber;
		this.tType = tType;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
	
		
}
