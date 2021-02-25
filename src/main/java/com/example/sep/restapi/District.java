package com.example.sep.restapi;

public class District {
	private String disid;
	private String disname;
	
	
	
	public District(String disid, String disname) {
		super();
		this.disid = disid;
		this.disname = disname;
	}
	
	public District(String disid)
	{
		super();
		this.disid = disid;
	}
	
	public String getDisid() {
		return disid;
	}
	public void setDisid(String disid) {
		this.disid = disid;
	}
	public String getDisname() {
		return disname;
	}
	public void setDisname(String disname) {
		this.disname = disname;
	}
	
	

}
