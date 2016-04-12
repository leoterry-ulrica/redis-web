package com.chr.domain;

import java.io.Serializable;

/**
 * 用户模型
 * @author weifj
 * @version 1.0，2016/04/12，weifj，创建
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = 522889572773714584L;
	
	private String id;
	private String name;
	private String password;
	
	public User() {}
	
	public User(String id,String name,String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
