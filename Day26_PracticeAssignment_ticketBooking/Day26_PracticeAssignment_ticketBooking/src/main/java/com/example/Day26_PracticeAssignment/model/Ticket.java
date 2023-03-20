package com.example.Day26_PracticeAssignment.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Ticket {


	@Id
	private String TicketID;
	private long mobileNumber;
	private String bookingDate;
	private String mname;
	private int Numberofseats;
	private String PaymentType;
	private int Paidamount;
	private String tType;
	private String sdate;
	private String sname;
	private String Status;
	private int TrasactionId;
	
	public Ticket(long mobileNumber, String mname,String tType, String sdate, String sname) {
		super();
		this.mobileNumber = mobileNumber;
		this.mname = mname;
//		this.TicketID=TicketID;
		this.tType = tType;
		this.sdate = sdate;
		this.sname = sname;
	}

	

	public long getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getTicketID() {
		return TicketID;
	}



	public void setTicketID(String ticketID) {
		this.TicketID = ticketID;
	}



	public String getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}



	public String getMname() {
		return mname;
	}



	public void setMname(String mname) {
		this.mname = mname;
	}



	public int getNumberofseats() {
		return Numberofseats;
	}



	public void setNumberofseats(int numberofseats) {
		this.Numberofseats = numberofseats;
	}



	public String getPaymentType() {
		return PaymentType;
	}



	public void setPaymentType(String paymentType) {
		this.PaymentType = paymentType;
	}



	public int getPaidamount() {
		return Paidamount;
	}



	public void setPaidamount(int paidamount) {
		this.Paidamount = paidamount;
	}



	public String gettType() {
		return tType;
	}



	public void settType(String tType) {
		this.tType = tType;
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



	public String getStatus() {
		return Status;
	}



	public void setStatus(String status) {
		this.Status = status;
	}



	public int getTrasactionId() {
		return TrasactionId;
	}



	public void setTrasactionId(int trasactionId) {
		this.TrasactionId = trasactionId;
	}



	@Override
	public String toString() {
		return "Ticket [TicketID=" + TicketID + ", BookingDate=" + bookingDate + ", MobileNumber=" + mobileNumber
				+ ", MovieName=" + mname + ", Numberofseats=" + Numberofseats + ", PaymentType=" + PaymentType
				+ ", Paidamount=" + Paidamount + ", Seat_type=" + tType + ", ShowDate=" + sdate + ", ShowTime="
				+ sname + ", Status=" + Status + ", TrasactionId=" + TrasactionId + "]";
	}

	public Ticket() {
		super();
	}
	
	
	
}
