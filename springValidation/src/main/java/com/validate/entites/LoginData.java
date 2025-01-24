package com.validate.entites;



import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {

	@NotBlank(message = "User Name can not be empty !!")
    @Size(min = 3, max = 15, message = "User name must be between 3-15 characters")
	private String username;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email !!")
	private String email;
	
	@AssertTrue(message = "Must agree terms and conditions")
	private boolean agreed;

	public LoginData(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}

	public LoginData() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + "]";
	}

}
