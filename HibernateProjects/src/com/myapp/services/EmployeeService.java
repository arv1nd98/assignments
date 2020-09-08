package com.myapp.services;

import java.util.ArrayList;

import com.myapp.dao.EmployeeDao;
import com.myapp.model.Employee;

public class EmployeeService {

	public static void main(String[] args) {
EmployeeDao dao=new EmployeeDao();
ArrayList<Employee> employees =dao.getEmployeeByAge();
/*ArrayList<Employee> employees = (ArrayList<Employee>)dao.getEmployeeByCity();
*/

/*ArrayList<Employee> employees = (ArrayList<Employee>)dao.getEmployeeByAgeorDept();
*/
for(Employee employee:employees)
{
	System.out.println(employee);
}
	}
}
