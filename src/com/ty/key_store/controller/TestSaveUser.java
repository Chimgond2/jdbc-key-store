package com.ty.key_store.controller;

import com.ty.key_store.dto.User;
import com.ty.key_strore.dao.UserDao;

public class TestSaveUser {
	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setUserName("raghu");
		user.setEmail("raghu@gmail.com");
		user.setPassword("rag@1230i");
		UserDao userDao = new UserDao();
		userDao.saveUser(user);
		if (user != null) {
			System.out.println("inserted");
		} else {
			System.out.println("not inserted");
		}
	}

}
