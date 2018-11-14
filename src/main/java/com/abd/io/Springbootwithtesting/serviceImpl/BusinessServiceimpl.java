package com.abd.io.Springbootwithtesting.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abd.io.Springbootwithtesting.dao.BusinessDao;
import com.abd.io.Springbootwithtesting.dao.UserDao;
import com.abd.io.Springbootwithtesting.dto.UserRequestDto;
import com.abd.io.Springbootwithtesting.entity.Business;
import com.abd.io.Springbootwithtesting.service.BusinessService;

@Service
public class BusinessServiceimpl implements BusinessService {

	private UserDao userDao;
	private BusinessDao businessDao;

	public BusinessServiceimpl(UserDao userDao, BusinessDao businessDao) {
		super();
		this.userDao = userDao;
		this.businessDao = businessDao;
	}

	@Autowired
	public BusinessServiceimpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public int findTheGreatestFromAllData() {
		int[] retrieveAllData = userDao.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : retrieveAllData)
			if (value > greatest)
				greatest = value;
		return greatest;
	}

	@Override
	public List<Business> getAllBusinesses() {
		return businessDao.getAllBusiness();
	}

	@Override
	public boolean setGreeting(UserRequestDto requestDto) {
		if (requestDto.getId() == 5)
			return false;
		return true;
	}

}
