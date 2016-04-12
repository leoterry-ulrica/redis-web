package com.chr.service;

import java.util.List;

import com.chr.domain.User;

/**
 * 用户领域
 * @author weifj
 * @version 1.0，2016/04/12，创建
 */
public interface UserOperationsService {
	/**
	 * 添加用户
	 * @param user
	 */
	void add(User user);
	/**
	 * 获取用户
	 * @param key
	 * @return
	 */
	User getUser(String key);
	
}
