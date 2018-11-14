package com.abd.io.Springbootwithtesting.controller;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
import com.abd.io.Springbootwithtesting.dto.UserRequestDto;
import com.abd.io.Springbootwithtesting.dto.UserResponseDto;
import com.abd.io.Springbootwithtesting.service.BusinessService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = WelcomController.class)
public class WelcomeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private BusinessService businessService;
	
	UserRequestDto requestDto;

	@Before
	public void init() {
		this.requestDto = new UserRequestDto(5, "Abdullah");
		Mockito.when(businessService.findTheGreatestFromAllData()).thenReturn(5);
		Mockito.when(businessService.setGreeting(requestDto)).thenReturn(false);
	}

	@Test
	public void getGreeting() throws Exception {
		mockMvc.perform(get("/api/v1/greeting/home").contentType("application/json")).andExpect(status().isOk())
				.andExpect(jsonPath("$.name", is("A")));
	}

	@Test
	public void setGreeting() throws Exception {
		mockMvc
		.perform(post("/api/v1/greeting/home").contentType("application/json").content("{\"id\": 5,\"name\": \"Abdullah\"}"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.name", is("Error")));
	}

}
