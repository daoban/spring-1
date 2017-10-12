package com.ypy.model;

public class UserModel {
	private int userid;
	private String username;
	@Override
	public String toString() {
		return "UserModel [userid=" + userid + ", username=" + username + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public UserModel() {
		super();
	}
	public UserModel(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
