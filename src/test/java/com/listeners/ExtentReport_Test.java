package com.listeners;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

public class ExtentReport_Test {

	public static ExtentTest extenttest;
	
	@BeforeSuite
	public void extentTestReportStartup() throws IOException{
		Base_Class base = new Base_Class() {
		};
		base.extentReportStart(null);
	}
	
	@AfterSuite
	public void extentReportEnd() throws IOException{
		Base_Class base = new Base_Class() {
		};
		base.extentReportTearDown(null);
	}
}
