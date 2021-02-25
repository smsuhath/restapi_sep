package com.example.sep.restapi;

public class Course {
	private String courseid;
	private String description;
	private int coursefee;
	private String posturl;
	private int status;
	private String University_uniid;
	private String Faculty_facid;
	private String User_userid;
	
	University uni = new University(University_uniid);
	Faculty fac = new Faculty(Faculty_facid);
	User us = new User(User_userid);
		
	public Course(String courseid, String description, int coursefee, String posturl, int status,String uni_id,String fac_id,String user_id) {
		super();
		this.courseid = courseid;
		this.description = description;
		this.coursefee = coursefee;
		this.posturl = posturl;
		this.status = status;
		this.University_uniid = uni_id;
		this.Faculty_facid = fac_id;
		this.User_userid = user_id;
		
	}
	
	public String getUniversity_uniid() {
		return University_uniid;
	}

	public void setUniversity_uniid(String university_uniid) {
		University_uniid = university_uniid;
	}
	
	public String getFaculty_facid() {
		return Faculty_facid;
	}

	public void setFaculty_facid(String faculty_facid) {
		Faculty_facid = faculty_facid;
	}

	public String getUser_userid() {
		return User_userid;
	}

	public void setUser_userid(String user_userid) {
		User_userid = user_userid;
	}

	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(int coursefee) {
		this.coursefee = coursefee;
	}
	public String getPosturl() {
		return posturl;
	}
	public void setPosturl(String posturl) {
		this.posturl = posturl;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
