package com.abd.io.Springbootwithtesting.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.abd.io.Springbootwithtesting.dao.BusinessDao;
import com.abd.io.Springbootwithtesting.dao.UserDao;
import com.abd.io.Springbootwithtesting.entity.Business;
import com.abd.io.Springbootwithtesting.serviceImpl.BusinessServiceimpl;

@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceMockTest {

	@Mock
	private UserDao userDaoMock;
	@Mock
	private BusinessDao businessDaoMock;
	@InjectMocks
	private BusinessServiceimpl businessServiceImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(userDaoMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, businessServiceImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testGetAllBusinesses() {
		List<Business> businesses = new ArrayList<>();
		Business business = Mockito.mock(Business.class);
		businesses.add(business);
		when(businessDaoMock.getAllBusiness()).thenReturn(businesses);
		assertEquals(1, businessServiceImpl.getAllBusinesses().size());
	}
}
