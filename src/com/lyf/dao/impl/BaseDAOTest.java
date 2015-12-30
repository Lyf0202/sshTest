package com.lyf.dao.impl;

import org.springframework.stereotype.Repository;

import com.lyf.po.UserInfo;

@Repository
public class BaseDAOTest extends BaseDAOImpl {

	public UserInfo getUserInfo(Integer userId){
		return (UserInfo) getSession().get(UserInfo.class, userId);
	}
	
	public void add(UserInfo userInfo){
		System.out.println("getSession().save(userInfo);....");
		getSession().save(userInfo);
	}
}
