package com.testNGRunner;

import org.testng.annotations.Test;

import com.baseclass.Baseclass;

public class Invocation extends Baseclass{
	
	@Test(priority = 4)
	private void EdgeBrowser() {
		launchBrowser("Edge");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID:" + Thread.currentThread().getId());
		termination();
		
	}
	
	@Test(invocationCount = 5)
	private void ChromeBrowser() {
		launchBrowser("Chrome");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID:" + Thread.currentThread().getId());
		termination();
		
	}
	
	@Test(priority = 2)
	private void FirefoxBrowser() {
		launchBrowser("Firefox");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID:" + Thread.currentThread().getId());
		termination();
		
	}

}
