package com.myspr.demo;

public class Author {

	private String authorName;
	private int authorId;
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public Author(String authorName, int authorId) {
		super();
		this.authorName = authorName;
		this.authorId = authorId;
	}
	
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	public Author(String authorName, int authorId, Address address) {
		super();
		this.authorName = authorName;
		this.authorId = authorId;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorId=" + authorId + ", address=" + address + "]";
	}
	
	
}
