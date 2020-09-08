package com.myapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.hibernate.sql.ordering.antlr.Factory;
import com.myapp.model.Employee;
public class EmployeeDao {
	
	
	SessionFactory factory;
	public EmployeeDao() {
factory=new Configuration().configure().buildSessionFactory();
	}
	
	
	
	public ArrayList<Employee> getEmployeeByAge() {
		try
		{
			SessionFactory factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
			Transaction tr=session.beginTransaction();
			Criteria ct=session.createCriteria(Employee.class);
			ArrayList<Employee> employees=(ArrayList<Employee>)ct.add(Restrictions.gt("age", 30)).list();
		    tr.commit();
		    return employees;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
       factory.close();
		} 
		return null;
	}
		
	public ArrayList<Employee> getEmployeeByCity() {
		try
		{
			SessionFactory factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
			Transaction tr=session.beginTransaction();
			Criteria ct=session.createCriteria(Employee.class);
			ArrayList<Employee> employees=(ArrayList<Employee>)ct.add(Restrictions.ilike("city", "B%")).list();
		    tr.commit();
		    return employees;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
       factory.close();
		} 
		return null;
	}
	
	
	public ArrayList<Employee> getEmployeeByAgeorDept() {
		try
		{
			SessionFactory factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
			Transaction tr=session.beginTransaction();
			Criteria ct=session.createCriteria(Employee.class);
			Criterion age=Restrictions.gt("age", "30");
			Criterion dept=Restrictions.eq("dept", "sales");

			LogicalExpression exp=Restrictions.or(age, dept);
			ct.add(exp);
			ArrayList<Employee> employees=(ArrayList<Employee>)ct.list();
			tr.commit();
		    return employees;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
       factory.close();
		} 
		return null;
	}
	
	public List<Employee> getEmployees()
	{
	try
	{
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
	ArrayList<Employee> employees=(ArrayList<Employee>)session.createQuery("from employee").list();
	tx.commit();
	return employees;
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
