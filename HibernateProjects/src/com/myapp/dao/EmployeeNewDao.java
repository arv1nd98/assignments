package com.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;

import com.myapp.model.Employee;
import com.myapp.model.EmployeeNew;

public class EmployeeNewDao {

	SessionFactory factory;
	public EmployeeNewDao() {
factory=new Configuration().configure().buildSessionFactory();
	}


	public String generateEmployeeId(String fname,String lname){
		String employeeId="";
		String seqNum="";
		int seqNumber=0;
		try{
			String sql="select seqemployee.nextval from dual";
 Session session=factory.openSession();
 Query query=session.createSQLQuery(sql);
 seqNumber=Integer.parseInt(query.getSingleResult().toString());
		if(seqNumber < 100 && seqNumber >=10)
			seqNum="0"+seqNumber;
		else if(seqNumber<10)
			seqNum="00"+seqNumber;
		else
			seqNum=""+seqNumber;
		
			employeeId=fname.substring(0,2)+lname.substring(0,2)+seqNum;
		
		return employeeId;
	}
	catch (Exception e) {
e.printStackTrace();	
}
		return "";
	}
	
	/*public String saveEmployee(EmployeeNew employeenew)
	{

	try
	{
	Session session= factory.openSession();

	Transaction tx= session.beginTransaction();
	employeenew.setEmpid(generateEmployeeId(employeenew.getEmpfname(),employeenew.getEmplname()));

	//System.out.println(employee.getEmpId());

	session.save(employeenew);
	tx.commit();
	return "employee saved";
	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	return "cannot create employee";
	}*/
	
	public ArrayList<EmployeeNew> getThreeEmployee()
	{
		try
		{
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		ArrayList<EmployeeNew> employees=(ArrayList<EmployeeNew>)session.createQuery("from EmployeeNew").setMaxResults(3).list();
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
	
	public ArrayList<EmployeeNew> getFiveEmployeeByAge()
	{
		try
		{
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		Criteria ct=session.createCriteria(EmployeeNew.class);
        Criteria c1=ct.addOrder(Order.desc("age"));
		ArrayList<EmployeeNew> employees=(ArrayList<EmployeeNew>)c1.setMaxResults(5).list();
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
	
	

