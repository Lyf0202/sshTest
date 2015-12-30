package com.lyf.service;

import java.util.List;

import com.lyf.po.UserInfo;

public interface UserInfoService {

	public void add(UserInfo user) throws Exception;

	public void update(UserInfo user) throws Exception;

	public void delete(UserInfo user) throws Exception;

	public UserInfo getUser(Integer userId) throws Exception;

	public List<UserInfo> getAllUser() throws Exception;
}
