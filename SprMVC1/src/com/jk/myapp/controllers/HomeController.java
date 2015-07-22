package com.jk.myapp.controllers;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jk.myapp.dao.HomeDAO;

@Controller
public class HomeController {
	@Autowired
	private HomeDAO homeDao;
	@Autowired
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Autowired
	private BasicDataSource dataSource;

	public BasicDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public HomeDAO getHomeDao() {
		return homeDao;
	}

	public void setHomeDao(HomeDAO homeDao) {
		this.homeDao = homeDao;
	}

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(){
		System.out.println("HomeController.home()" +dataSource);
		System.out.println("HomeController.home()" +sessionFactory);
		homeDao.addUser();
		return "home";
	}
}
