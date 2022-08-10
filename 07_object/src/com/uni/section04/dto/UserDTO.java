package com.uni.section04.dto;

import java.util.Date;

public class UserDTO {
	private String id;
	private String pwd;
	private String name;
	private Date enrollDate;
	
	public UserDTO() {}
	
	public UserDTO(String id, String pwd, String name) {
		this(id, pwd, name, new Date());
	}
	
	public UserDTO(String id, String pwd, String name, Date enrollDate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enrollDate = enrollDate;
	}
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	public String getInformation() {
		return "UserDTO [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
	}
}
