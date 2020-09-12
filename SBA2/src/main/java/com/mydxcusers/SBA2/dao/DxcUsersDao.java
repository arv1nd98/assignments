package com.mydxcusers.SBA2.dao;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mydxcusers.SBA2.model.DxcUsers;

@Component
@Transactional
public class DxcUsersDao {

	@Autowired
	SessionFactory sessionFactor;
	

public String saveUser(DxcUsers dxcUsers)
{
try
{
Session session=sessionFactor.getCurrentSession();
session.save(dxcUsers);

return "user created";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return "cannot create user";
}

public DxcUsers getUserById(int userId){
	try{
		Session session=sessionFactor.getCurrentSession();
	DxcUsers dxcUsers=(DxcUsers)session.get(DxcUsers.class,userId);
	return dxcUsers;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	return null;
	}
public String updateUserById(DxcUsers dxcUsers){
	try{
	Session session=sessionFactor.getCurrentSession();
	session.update("DxcUsers",dxcUsers);
	return "Password Updated";
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	return "Cannot Update Password";
	}

	/*
	 * public DxcUsers getDetails(int userId) { try { Session
	 * session=sessionFactor.getCurrentSession(); DxcUsers
	 * dxcUsers=session.get(DxcUsers.class, userId); return dxcUsers; } catch
	 * (Exception e) { e.printStackTrace(); } return null; }
	 */


public String updatePassword(int userId, String password) {
	try {
		Session session=sessionFactor.getCurrentSession();
		Query query=session.createQuery("update DxcUsers set password=:password where userId=:userId");
		query.setParameter("userId", userId);
		query.setParameter("password", password);
		int res=query.executeUpdate();
		if(res>0)
			return "Updated";
	} catch (Exception e) {
		e.printStackTrace();
	}
	return "Cannot update";
}


}
