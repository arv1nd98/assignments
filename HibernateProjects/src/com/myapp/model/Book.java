package com.myapp.model;


import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Book {

@Id
private int isbn;
private String title;
private String author;

@Column(name="book_date")
private Date date;

@Transient
int copiesOfBook;

@Embedded
Publisher publisher;

@AttributeOverrides({
        @AttributeOverride(name="publisherId",column=@Column(name="pId")),
        @AttributeOverride(name="publisherName",column=@Column(name="pName"))
}
)
@Embedded
Publisher2 publisher2;


@ElementCollection
List<Distributor> distList;


public Publisher2 getPublisher2() {
	return publisher2;
}
public void setPublisher2(Publisher2 publisher2) {
	this.publisher2 = publisher2;
}
public List<Distributor> getDistList() {
return distList;
}
public void setDistList(List<Distributor> distList) {
this.distList = distList;
}
public Publisher getPublisher() {
return publisher;
}
public void setPublisher(Publisher publisher) {
this.publisher = publisher;
}
public int getCopiesOfBook() {
return copiesOfBook;
}
public void setCopiesOfBook(int copiesOfBook) {
this.copiesOfBook = copiesOfBook;
}
public Date getDate() {
return date;
}
public void setDate(Date date) {
this.date = date;
}
public int getIsbn() {
return isbn;
}
public void setIsbn(int isbn) {
this.isbn = isbn;
}
public String getTitle() {
return title;
}
public void setTitle(String title) {
this.title = title;
}
public String getAuthor() {
return author;
}
public void setAuthor(String author) {
this.author = author;
}



public Book(int isbn, String title, String author, Date date) {
	super();
	this.isbn = isbn;
	this.title = title;
	this.author = author;
	this.date = date;
}
public Book() {
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", date=" + date + ", copiesOfBook="
			+ copiesOfBook + ", publisher=" + publisher + ", publisher2=" + publisher2 + ", distList=" + distList + "]";
}


}