package com.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class EmployeeNew {

	@Id
	String empid; 
	String empfname;
	String emplname;
	int age;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpfname() {
		return empfname;
	}
	public void setEmpfname(String empfname) {
		this.empfname = empfname;
	}
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmployeeNew(String empid, String empfname, String emplname, int age) {
		super();
		this.empid = empid;
		this.empfname = empfname;
		this.emplname = emplname;
		this.age = age;
	} 
	
	public EmployeeNew() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeNew [empid=" + empid + ", empfname=" + empfname + ", emplname=" + emplname + ", age=" + age
				+ "]";
	}
	
	
	
}
