package com.abd.io.Springbootwithtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.abd.io.Springbootwithtesting.dao.UserDao;
import com.abd.io.Springbootwithtesting.service.BusinessService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringBootWithTestingApplicationTests {

	@MockBean
	UserDao userDao;

	@Autowired
	BusinessService businessService;

	@Test
	public void testFindTheGreatestFromAllData() {
		Mockito.when(userDao.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, businessService.findTheGreatestFromAllData());
	}

}
