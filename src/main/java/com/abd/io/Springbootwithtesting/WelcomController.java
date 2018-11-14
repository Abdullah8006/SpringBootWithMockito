package com.abd.io.Springbootwithtesting;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abd.io.Springbootwithtesting.dto.UserRequestDto;
import com.abd.io.Springbootwithtesting.dto.UserResponseDto;
import com.abd.io.Springbootwithtesting.service.BusinessService;

@RestController
@RequestMapping("/api/v1/greeting")
public class WelcomController {

	private static Logger LOGGER = LoggerFactory.getLogger(WelcomController.class);
	private BusinessService businessService;
	@Resource(name = "properties")
	private Map<String, String> properties;

	@Autowired
	public WelcomController(BusinessService businessService) {
		this.businessService = businessService;
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	private UserResponseDto getGreeting() {
		LOGGER.info("endpoint /home with GET executed.");
		UserResponseDto responseDto = new UserResponseDto();
		int findTheGreatestFromAllData = businessService.findTheGreatestFromAllData();
		if (findTheGreatestFromAllData == 5) {
			responseDto.setId(findTheGreatestFromAllData);
			responseDto.setName("A");
		} else {
			responseDto.setId(0);
			responseDto.setName("B");
		}
		return responseDto;
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	private UserResponseDto setGreeting(@RequestBody UserRequestDto requestDto) {
		LOGGER.info("endpoint /home with POST executed.");
		boolean isPersisted = businessService.setGreeting(requestDto);
		if (isPersisted)
			return new UserResponseDto(requestDto.getId(), requestDto.getName());
		return new UserResponseDto(0, "Error");
	}
}
