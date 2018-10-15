package com.abd.io.Springbootwithtesting.service;

import java.util.List;

import com.abd.io.Springbootwithtesting.entity.Business;

public interface BusinessService {

	public int findTheGreatestFromAllData();

	public List<Business> getAllBusinesses();
}
