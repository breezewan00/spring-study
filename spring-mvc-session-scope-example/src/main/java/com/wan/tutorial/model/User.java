package com.wan.tutorial.model;

public class User {
	private String email;
	private String password;
	private String fstname;
	private String secname;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSecname() {
		return secname;
	}
	public void setSecname(String secname) {
		this.secname = secname;
	}
	public String getFstname() {
		return fstname;
	}
	public void setFstname(String fstname) {
		this.fstname = fstname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
