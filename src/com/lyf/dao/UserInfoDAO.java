package com.lyf.dao;

import java.util.List;

import com.lyf.po.UserInfo;

/**
 * 数据访问层
 * @author lyf
 *
 */
public interface UserInfoDAO {

	public void add(UserInfo user);
	
	public void update(UserInfo user);
	
	public void delete(UserInfo user);
	
	public UserInfo getUser(Integer userId);
	
	public List<UserInfo> getAllUser();
}
