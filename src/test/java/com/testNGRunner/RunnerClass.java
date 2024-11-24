package com.testNGRunner;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import com.baseclass.Baseclass;
import com.pageObjectManager.OpenMrsPageObjectManager;
//import srcmainresources.FilereaderManager;

public class RunnerClass extends Baseclass {
	
	OpenMrsPageObjectManager PageObjectManager = new OpenMrsPageObjectManager();
	
	@BeforeTest 
	public void setup() throws IOException {
		launchBrowser(PageObjectManager.getFilereader().getDataproperty("Browser"));
	}
	
	
	@Test 
	private void validLoginTest()throws IOException{
		Assert.assertTrue(PageObjectManager.getLoginPage().ValidUserPassandLocation());
	}
	
	
	@Test 
	private void invalidLoginTest1()throws IOException {
		Assert.assertTrue(PageObjectManager.getLoginPage().ValidUsernameandLocation());
	}
	
	
	@Test 
	private void invalidLoginTest2()throws IOException {
		Assert.assertTrue(PageObjectManager.getLoginPage().ValidUsernameandPassword());
	}
	
	@Test 
	private void invalidLoginTest3()throws IOException {
		Assert.assertTrue(PageObjectManager.getLoginPage().ValidLocation());
	}
	
	@AfterTest
	protected void terminateBrowser() {
	  termination();
	}
}

