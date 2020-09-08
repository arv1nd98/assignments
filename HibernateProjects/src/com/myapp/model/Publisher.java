package com.myapp.model;

import javax.persistence.Embeddable;

@Embeddable
public class Publisher {
	
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
	public Publisher(String publisherId, String publisherName) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
	}

	public Publisher() {
		// TODO Auto-generated constructor stub
	}
}
