package com.linewebhook.service;

import java.io.Serializable;
import java.util.ArrayList;

public class PushNotificationRequest implements Serializable{

	private ArrayList<String> registration_ids;
	private String collapse_key;
	private Notification notification;
	public ArrayList<String> getRegistration_ids() {
		return registration_ids;
	}
	public void setRegistration_ids(ArrayList<String> registration_ids) {
		this.registration_ids = registration_ids;
	}
	public String getCollapse_key() {
		return collapse_key;
	}
	public void setCollapse_key(String collapse_key) {
		this.collapse_key = collapse_key;
	}
	public Notification getNotification() {
		return notification;
	}
	public void setNotification(Notification notification) {
		this.notification = notification;
	}
	
	
}
