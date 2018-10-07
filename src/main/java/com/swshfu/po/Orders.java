package com.swshfu.po;

public class Orders {
	private Integer id;//订单编号
	private String courseName;//课程名
	private String coursePlace;//上课地点
	private String courseTime;//课程名
	private String sendUserId;//课程名
	private String getUserId;//课程名
	private Integer status;//订单状态：0、未接单，1、待完成，2、已完成，3、发单人取消，4、接单人取消
	private Integer orderType;//订单类型：0、代课，1、代跑腿，2、代寝
	private Integer orderSex;//订单性别：0、性别不限，1、男，2、女
	private String illustrate;//订单说明
	private String title;//订单标题
	private String courseImage;//上课照片URL
	private String orderCreateTime;//订单创建时间
	private String orderOverTime;//订单结束时间
	private Integer score;//本次订单评分：1,2,3,4,5
	private Integer error;//是否为异常订单：0、正常订单，2、异常订单
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCoursePlace() {
		return coursePlace;
	}
	public void setCoursePlace(String coursePlace) {
		this.coursePlace = coursePlace;
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	public String getSendUserId() {
		return sendUserId;
	}
	public void setSendUserId(String sendUserId) {
		this.sendUserId = sendUserId;
	}
	public String getGetUserId() {
		return getUserId;
	}
	public void setGetUserId(String getUserId) {
		this.getUserId = getUserId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getOrderType() {
		return orderType;
	}
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	public Integer getOrderSex() {
		return orderSex;
	}
	public void setOrderSex(Integer orderSex) {
		this.orderSex = orderSex;
	}
	public String getIllustrate() {
		return illustrate;
	}
	public void setIllustrate(String illustrate) {
		this.illustrate = illustrate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCourseImage() {
		return courseImage;
	}
	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}
	public String getOrderCreateTime() {
		return orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	public String getOrderOverTime() {
		return orderOverTime;
	}
	public void setOrderOverTime(String orderOverTime) {
		this.orderOverTime = orderOverTime;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getError() {
		return error;
	}
	public void setError(Integer error) {
		this.error = error;
	}
	
	
}
