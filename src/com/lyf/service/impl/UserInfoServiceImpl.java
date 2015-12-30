package com.lyf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyf.dao.UserInfoDAO;
import com.lyf.po.UserInfo;
import com.lyf.service.UserInfoService;

/**
 * 业务逻辑层
 * 
 * @author lyf
 *
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDAO userDao;

	@Override
	public void add(UserInfo user) throws Exception {

		if (user != null) {
			userDao.add(user);
		}
	}

	public void setUserDao(UserInfoDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void update(UserInfo user) throws Exception {
		if (user != null && user.getUserId() != null) {

			UserInfo puser = userDao.getUser(user.getUserId());

			if (puser != null) {
				puser.setUserAge(user.getUserAge());
				puser.setUserName(user.getUserName());

				userDao.update(puser);
			}
		}

	}

	@Override
	public void delete(UserInfo user) throws Exception {
		if (user != null && user.getUserId() != null) {

			UserInfo puser = userDao.getUser(user.getUserId());

			if (puser != null) {

				userDao.delete(puser);
			}
		}

	}

	@Override
	public UserInfo getUser(Integer userId) throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUser(userId);
	}

	@Override
	public List<UserInfo> getAllUser() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

}
