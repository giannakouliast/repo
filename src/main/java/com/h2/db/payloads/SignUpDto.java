package com.h2.db.payloads;


import lombok.Data;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public SignUpDto(String name, String username, String email, String password) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public SignUpDto() {
		super();
	}
	
}