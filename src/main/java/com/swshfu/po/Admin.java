package com.swshfu.po;

public class Admin {
	private Integer id;
	private String username;
	private String password;
	private Integer status;//启用状态：0、未启用，1、启用
	private Integer adminAuthority;//权限范围：0、系统级管理员
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getAdminAuthority() {
		return adminAuthority;
	}
	public void setAdminAuthority(Integer adminAuthority) {
		this.adminAuthority = adminAuthority;
	}
	
	
}
