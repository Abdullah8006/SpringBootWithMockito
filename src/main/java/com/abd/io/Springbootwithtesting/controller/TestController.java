package com.abd.io.Springbootwithtesting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abd.io.Springbootwithtesting.dto.UserResponseDto;

@RestController
public class TestController extends AbstractController {

	@RequestMapping(value = "/bingo", method = RequestMethod.GET)
	private UserResponseDto getGreeting() {
		return new UserResponseDto();
	}
	
}
