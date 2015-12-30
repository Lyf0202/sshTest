package com.lyf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.lyf.dao.UserInfoDAO;
import com.lyf.po.UserInfo;
/**
 * 持久化层
 * @author lyf
 *
 */
@Repository
public class UserInfoDAOImpl extends HibernateDaoSupport implements UserInfoDAO {

	@Override
	public void add(UserInfo user) {
		this.getHibernateTemplate().save(user);

	}

	@Override
	public void update(UserInfo user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	@Override
	public void delete(UserInfo user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(user);
	}

	@Override
	public UserInfo getUser(Integer userId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(UserInfo.class,userId);
	}

	@Override
	public List<UserInfo> getAllUser() {
		// TODO Auto-generated method stub
		String hql = "from UserInfo";
		Query query = this.currentSession().createQuery(hql);
		return query.list();
	}

}
