package com.chinasofti.demo.users.model;

public class UserBean {
	private String username;
	private String address;
	private boolean flag;
	
	public UserBean() {
    }
    public UserBean(String username, String address, boolean flag) {
            this.username = username;
            this.address = address;
            this.flag = flag;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}