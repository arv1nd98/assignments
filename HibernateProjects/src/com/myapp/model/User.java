package com.myapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table( name= "user")
public class User {

private int uid;
private String uname;
Date dob;

@Type(type = "yes_no")
 private boolean isActive;

public int getUid() {
return uid;
}

public void setUid(int uid) {
this.uid = uid;
}

public String getUname() {
return uname;
}

public void setUname(String uname) {
this.uname = uname;
}

public Date getDob() {
return dob;
}

public void setDob(Date dob) {
this.dob = dob;
}

public boolean isActive() {
return isActive;
}

public void setActive(boolean isActive) {
this.isActive = isActive;
}

public User(int uid, String uname, Date dob, boolean isActive) {
super();
this.uid = uid;
this.uname = uname;
this.dob = dob;
this.isActive = isActive;
}
public User() {
// TODO Auto-generated constructor stub
}

@Override
public String toString() {
return "User [uid=" + uid + ", uname=" + uname + ", dob=" + dob + ", isActive=" + isActive + "]";
}


}