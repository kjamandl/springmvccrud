package com.jk.myapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JK_USERS")
public class User {

	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private Long userId;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="EMAIL_ID")
	private String userEmail;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
