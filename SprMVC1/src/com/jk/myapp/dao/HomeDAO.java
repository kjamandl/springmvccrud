package com.jk.myapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jk.myapp.entities.User;


public class HomeDAO implements IHomeDAO {
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
/* (non-Javadoc)
 * @see com.jk.myapp.dao.IHomeDAO#addUser()
 */
@Override
@Transactional
public void addUser(){
	User user = new User();
	user.setUserName("Kishore");
	user.setUserEmail("kjamandl2@gmail.com");
	getSessionFactory().getCurrentSession().save(user);	
	System.out.println("No flush.User added...");
	
}
public User getUser(Long userId){
	User user = null; 
	user = (User) getSessionFactory().getCurrentSession().get(User.class, userId);
	return user;
	
}
public void removeUser(Long userId){
	getSessionFactory().getCurrentSession().delete(getUser(userId));
}
public List<User> getAllUsers(){
	
}
}
