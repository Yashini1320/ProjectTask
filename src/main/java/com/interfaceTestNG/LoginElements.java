package com.interfaceTestNG;

public interface LoginElements {
	
	String username_xpath= "//input[@id= 'username']";
	String password_id="password";
	String Location_xpath="//li[@id= 'Isolation Ward']"; 
    String Login_id = "loginButton";
    String EmptyUsernameandPassword_id = "error-message";
    String LocationError_xpath = "//span[@class ='location-error']";
}
