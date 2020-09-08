package com.myapp.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.myapp.model.Book;

public class BookDao {

	SessionFactory factory;
	public BookDao() {
factory=new Configuration().configure().buildSessionFactory();
	}
	/*public String saveBook(Book book)
	{
	SessionFactory factory=null;
	try
	{
	 factory=new Configuration().configure().buildSessionFactory();
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(book);
	tx.commit();
	return "book saved";

	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return "cannot save book";
	}*/
	
	/*public Book getBook(String title)
	{
	try
	{
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("from Book b where b.title=:titlePram");
		query.setParameter("titlePram", title);
		Book book=(Book)query.getSingleResult();
		tx.commit();
		return book;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}
	return null;
	}
	public List<Book> getBooks()
	{
	try
	{
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();

	ArrayList<Book> books=(ArrayList<Book>)session.createQuery("from Book").list();


	tx.commit();
	return books;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}*/
	
	public ArrayList<Book> filterBooks()
	{
	try
	{
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();

	Criteria  ct=session.createCriteria(Book.class);
	// ct.add(Restrictions.gt("isbn", 101));
	// ArrayList<Book> books=(ArrayList<Book>)ct.list();


	ArrayList<Book> books=(ArrayList<Book>)ct.add(Restrictions.gt("isbn", 101)).list();

	tx.commit();
	return books;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}
}
