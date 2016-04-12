package com.chr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

import com.chr.domain.User;
import com.chr.service.UserOperationsService;

/**
 * @author Edwin Chen
 *
 */
@Service
public class UserOperationsServiceImpl implements UserOperationsService {
	@Autowired
	private RedisTemplate redisTemplate;

	@Override
	public void add(User user) {

		ValueOperations<String, User> valueops = redisTemplate
				.opsForValue();
		valueops.set(user.getId(), user);
	}


	@Override
	public User getUser(String key) {
		ValueOperations<String, User> valueops = redisTemplate
				.opsForValue();
		User user = valueops.get(key);
		return user;
	}

}
