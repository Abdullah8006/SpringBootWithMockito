package com.abd.io.Springbootwithtesting.controller;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.abd.io.Springbootwithtesting.WelcomController;
import com.abd.io.Springbootwithtesting.service.BusinessService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = WelcomController.class)
public class WelcomeControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private BusinessService businessService;
	
	@Before
	public void init() {
		Mockito.when(businessService.findTheGreatestFromAllData()).thenReturn(5);
	}

	@Test
	public void getGreeting() throws Exception {
		mockMvc.perform(get("/api/v1/greeting/home").contentType("application/json"))
		        .andExpect(status().isOk())
				.andExpect(jsonPath("$.name", is("A")));
	}

}
