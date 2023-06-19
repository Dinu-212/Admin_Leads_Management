package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Users")
public class User {

	@Id
	String user_id;
	String user_name;
	String role;
	String email_id;
	String user_phone_number;
	public User(String user_id, String user_name, String role, String email_id, String user_phone_number) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.role = role;
		this.email_id = email_id;
		this.user_phone_number = user_phone_number;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getUser_phone_number() {
		return user_phone_number;
	}
	public void setUser_phone_number(String user_phone_number) {
		this.user_phone_number = user_phone_number;
	}
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", role=" + role + ", email_id=" + email_id
				+ ", user_phone_number=" + user_phone_number + "]";
	}
}
