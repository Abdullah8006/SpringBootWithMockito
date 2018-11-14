package com.abd.io.Springbootwithtesting.dto;

public class UserResponseDto {

	private int id;
	private String name;
	
	public UserResponseDto() {
	}

	public UserResponseDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
