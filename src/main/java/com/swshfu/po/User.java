package com.swshfu.po;

public class User {
	private Integer id; //id
	private String name; //用户昵称
	private String phone; //手机号码
	private String qq;  //qq号码
	private String weixin;//微信账号
	private String opid;//微信唯一标识
	private Float pingfen;//评分
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getOpid() {
		return opid;
	}
	public void setOpid(String opid) {
		this.opid = opid;
	}
	public Float getPingfen() {
		return pingfen;
	}
	public void setPingfen(Float pingfen) {
		this.pingfen = pingfen;
	}
}
