package com.myapp.services;

import java.util.ArrayList;

import com.myapp.dao.EmployeeNewDao;
import com.myapp.model.Employee;
import com.myapp.model.EmployeeNew;

public class EmployeeNewService {
	public static void main(String[] args) {
		
/*		EmployeeNewDao dao=new EmployeeNewDao();
*/		/*EmployeeNew employee=new EmployeeNew("","Trent", "Arnold", 20);
		System.out.println(dao.saveEmployee(employee));*/
		
		
		
		/*
		EmployeeNewDao dao=new EmployeeNewDao();
		ArrayList<EmployeeNew> employees =dao.getThreeEmployee();
		for(EmployeeNew  employee:employees)
		{
			System.out.println(employee);
		}
		*/
		
		

		EmployeeNewDao dao=new EmployeeNewDao();
		ArrayList<EmployeeNew> employees =dao.getFiveEmployeeByAge();
		for(EmployeeNew  employee:employees)
		{
			System.out.println(employee);
		}
		
}
}