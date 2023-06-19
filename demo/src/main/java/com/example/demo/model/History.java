package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("History")
public class History {
	
	@Id
	String lead_id;
	String user_id;
	String date;
	String time;
	String remarks;
	public History(String lead_id, String user_id, String date, String time, String remarks) {
		super();
		this.lead_id = lead_id;
		this.user_id = user_id;
		this.date = date;
		this.time = time;
		this.remarks = remarks;
	}
	public History() {
		// TODO Auto-generated constructor stub
	}
	public String getLead_id() {
		return lead_id;
	}
	public void setLead_id(String lead_id) {
		this.lead_id = lead_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "History [lead_id=" + lead_id + ", user_id=" + user_id + ", date=" + date + ", time=" + time
				+ ", remarks=" + remarks + "]";
	}
	
	
	

}
