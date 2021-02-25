package com.example.sep.restapi;

public class Faculty {

	private String facid;
	private String facname;
	private int status;
	private String District_disid;
	
	District dis = new District(District_disid);
	
	
	public Faculty(String facid, String facname, int status, String disid ) {
		super();
		this.facid = facid;
		this.facname = facname;
		this.status = status;
		this.District_disid = disid;
	}
	
	public Faculty(String facid)
	{
		super();
		this.facid = facid;
	}
	public String getFacid() {
		return facid;
	}
	public void setFacid(String facid) {
		this.facid = facid;
	}
	public String getFacname() {
		return facname;
	}
	public void setFacname(String facname) {
		this.facname = facname;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
