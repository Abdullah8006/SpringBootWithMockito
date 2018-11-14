package com.abd.io.Springbootwithtesting.dto;

public class UserRequestDto {
	private int id;
	private String name;

	public UserRequestDto() {
	}

	public UserRequestDto(int id, String name) {
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
