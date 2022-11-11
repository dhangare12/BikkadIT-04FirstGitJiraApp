package com.BikkadIT.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int uid;
	
	private String Uname;
	
	private String email;
	
	private int age;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", Uname=" + Uname + ", email=" + email + ", age=" + age + "]";
	}
	
}
