package com.sun.myl.util;

import java.io.Serializable;

public class User implements Serializable
{
	/**
	 * 唯一ID
	 */
	private static final long serialVersionUID = 1494357283642837L;

	private String userId;
	
	private String userName;
	
	private String userPassword;
	
	private String userAddress;
	
	private String userEmail;
	
	private String userPhone;
	
	private int userAge;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	/**
	 * 为了便于查看
	 */
	@Override  
    public String toString() {  
        return "userId=" + userId + ", userName=" + userName + ", userPassword="+ userPassword +
        		", userAddress=" + userAddress +", userEmail=" + userEmail + ", userPhone=" +
        		userPhone + ", userAge=" + userAge;  
    } 
}
