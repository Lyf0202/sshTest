package com.lyf.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAOImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	
}
