package com.myapp.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Publisher2 {
	
	private String publisherId;
	private String publisherName;
	public String getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public Publisher2(String publisherId, String publisherName) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
	}
	public Publisher2() {
		// TODO Auto-generated constructor stub
	}
	
}
