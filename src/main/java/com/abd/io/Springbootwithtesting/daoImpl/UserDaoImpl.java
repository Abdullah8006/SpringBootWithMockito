package com.abd.io.Springbootwithtesting.daoImpl;

import org.springframework.stereotype.Repository;

import com.abd.io.Springbootwithtesting.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}
}
