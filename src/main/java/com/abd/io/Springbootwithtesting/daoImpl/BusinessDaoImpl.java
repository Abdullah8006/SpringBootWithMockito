package com.abd.io.Springbootwithtesting.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.abd.io.Springbootwithtesting.dao.BusinessDao;
import com.abd.io.Springbootwithtesting.entity.Business;

@Repository
public class BusinessDaoImpl implements BusinessDao {

	@Override
	public List<Business> getAllBusiness() {
		List<Business> businesses = new ArrayList<>();
		businesses.add(new Business("Zamzam Provision Strore", "Shahmaroof, Gorakhpur", 21233345));
		businesses.add(new Business("Aligarh Dawakhana", "Shahmaroof, Gorakhpur", 54233345));
		businesses.add(new Business("Zubair Diamonds", "Atlanta, Georgia", 98033345));
		return businesses;
	}

}
