package com.ILP.model;

public class Team {
	public Team(String pid, String pname, String pnumber, String address, String details) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pnumber = pnumber;
		this.address = address;
		this.details = details;
	}
	private String pid;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPnumber() {
		return pnumber;
	}
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	private String pname;
	private String pnumber;
	private String address;
	private String details;

}
