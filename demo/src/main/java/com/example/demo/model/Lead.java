package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Leads")
public class Lead {
	@Id
	String lead_id;
	String lead_name;
	String lead_email_id;
	String lead_phone_number;
	String agent_id;
	public Lead(String lead_id, String lead_name, String lead_email_id, String lead_phone_number, String agent_id) {
		super();
		this.lead_id = lead_id;
		this.lead_name = lead_name;
		this.lead_email_id = lead_email_id;
		this.lead_phone_number = lead_phone_number;
		this.agent_id = agent_id;
	}
	public String getLead_id() {
		return lead_id;
	}
	public void setLead_id(String lead_id) {
		this.lead_id = lead_id;
	}
	public String getLead_name() {
		return lead_name;
	}
	public void setLead_name(String lead_name) {
		this.lead_name = lead_name;
	}
	public String getLead_email_id() {
		return lead_email_id;
	}
	public void setLead_email_id(String lead_email_id) {
		this.lead_email_id = lead_email_id;
	}
	public String getLead_phone_number() {
		return lead_phone_number;
	}
	public void setLead_phone_number(String lead_phone_number) {
		this.lead_phone_number = lead_phone_number;
	}
	public String getAgent_id() {
		return agent_id;
	}
	public void setAgent_id(String agent_id) {
		this.agent_id = agent_id;
	}
	@Override
	public String toString() {
		return "Lead [lead_id=" + lead_id + ", lead_name=" + lead_name + ", lead_email_id=" + lead_email_id
				+ ", lead_phone_number=" + lead_phone_number + ", agent_id=" + agent_id + "]";
	}
	

}
