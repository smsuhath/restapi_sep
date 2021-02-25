package com.example.sep.restapi;

public class University {
	private String uniid;
	private String uniname;
	private String ranklocal;
	private String rankworld;
	private int status;
	
	
	
	public University(String uniid, String uniname, String ranklocal, String rankworld, int status) {
		super();
		this.uniid = uniid;
		this.uniname = uniname;
		this.ranklocal = ranklocal;
		this.rankworld = rankworld;
		this.status = status;
	}
	
	public University(String uniid) {
		super();
		this.uniid = uniid;
	}
	
	public String getUniid() {
		return uniid;
	}
	public void setUniid(String uniid) {
		this.uniid = uniid;
	}
	public String getUniname() {
		return uniname;
	}
	public void setUniname(String uniname) {
		this.uniname = uniname;
	}
	public String getRanklocal() {
		return ranklocal;
	}
	public void setRanklocal(String ranklocal) {
		this.ranklocal = ranklocal;
	}
	public String getRankworld() {
		return rankworld;
	}
	public void setRankworld(String rankworld) {
		this.rankworld = rankworld;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
