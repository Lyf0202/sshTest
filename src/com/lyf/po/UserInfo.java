package com.lyf.po;

public class UserInfo {

	private Integer userId;
	
	private Integer userAge;
	
	private String userName;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserInfo(Integer userAge, String userName) {
		super();
		this.userAge = userAge;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userAge=" + userAge + ", userName=" + userName + "]";
	}
	
	
}
