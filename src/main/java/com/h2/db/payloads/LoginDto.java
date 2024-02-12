package com.h2.db.payloads;


import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
	public Object getUsernameOrEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public LoginDto(String usernameOrEmail, String password) {
		super();
		this.usernameOrEmail = usernameOrEmail;
		this.password = password;
	}
	public LoginDto() {
		super();
	}
	
	
}