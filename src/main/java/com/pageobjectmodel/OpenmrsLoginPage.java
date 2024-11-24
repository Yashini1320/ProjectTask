package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.baseclass.Baseclass;
import com.interfaceTestNG.LoginElements;

import srcmainresources.FilereaderManager;

public class OpenmrsLoginPage extends Baseclass implements LoginElements {

	@FindBy(xpath = username_xpath)
	private WebElement Username;

	@FindBy(id = password_id)
	private WebElement Password;

	@FindBy(xpath = Location_xpath)
	private WebElement Location; 

	@FindBy(id = Login_id)
	private WebElement Login;

	@FindBy(id = EmptyUsernameandPassword_id)
	private WebElement EmptyUserPass;
	
	@FindBy(xpath = LocationError_xpath)
	private WebElement Errorlocation;

	public OpenmrsLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean ValidUserPassandLocation() {
		try {
			FilereaderManager Data = new FilereaderManager();
			launchUrl(Data.getDataproperty("Url"));
			passInput(Username, Data.getDataproperty("username"));
			passInput(Password, Data.getDataproperty("password"));
			elementclick(Location);
			elementclick(Login);
			validation(driver.getTitle(), Data.getDataproperty("Title"));
		} catch (Exception e) {
			Assert.fail("ERROR DURING VALIDATION");
		}
		return true;
	}
	


	public boolean ValidUsernameandLocation() {
		try {
			FilereaderManager Data = new FilereaderManager();
			launchUrl(Data.getDataproperty("Url"));
			passInput(Username, Data.getDataproperty("username"));
			passInput(Password, Data.getDataproperty("Invalidpassword"));
			elementclick(Location);
			elementclick(Login);
			validation(EmptyUserPass.getText(),Data.getDataproperty("EmptyUsernameandPasswordErr"));
		} catch (Exception e) {
			Assert.fail("ERROR DURING VALIDATION");
		}
		return true;
	}

	public boolean ValidUsernameandPassword() {
		try {
			FilereaderManager Data = new FilereaderManager();
			launchUrl(Data.getDataproperty("Url"));
			passInput(Username, Data.getDataproperty("username"));
			passInput(Password, Data.getDataproperty("password"));
			elementclick(Login);
			validation(Errorlocation.getText(),Data.getDataproperty("EmptylocationErr"));
		} catch (Exception e) {
			Assert.fail("ERROR DURING VALIDATION");
		}
		return true;
	}
	
	public boolean ValidLocation() {
		try {
			FilereaderManager Data = new FilereaderManager();
			launchUrl(Data.getDataproperty("Url"));
			elementclick(Location);
			elementclick(Login);
			validation(EmptyUserPass.getText(),Data.getDataproperty("EmptyUsernameandPasswordErr"));
		} catch (Exception e) {
			Assert.fail("ERROR DURING VALIDATION");
		}
		return true;
	}

}
