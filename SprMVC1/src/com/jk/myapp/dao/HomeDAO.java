package com.jk.myapp.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jk.myapp.entities.User;


public class HomeDAO {
	@Autowired
	private SessionFactory sessionFactory;	
public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
public String getSystemTime(){
	System.out.println("HomeDAO.getSystemTime()");
	return "Test";
}
@Transactional
public void addUser(){
	User user = new User();
	user.setUserName("Kishore");
	user.setUserEmail("kjamandl2@gmail.com");
	getSessionFactory().getCurrentSession().save(user);	
	System.out.println("No flush.User added...");
	
}
}
