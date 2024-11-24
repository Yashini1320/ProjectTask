package com.pageObjectManager;

import com.baseclass.Baseclass;
import com.pageObjectModel.SignInPage;
import com.pageobjectmodel.OpenmrsLoginPage;

import srcmainresources.FilereaderManager;

public class OpenMrsPageObjectManager extends Baseclass {

	private OpenmrsLoginPage LoginPage;
	private FilereaderManager filereader;
	
	public OpenmrsLoginPage getLoginPage() {
		if (LoginPage == null)
			LoginPage = new OpenmrsLoginPage(driver);
		return LoginPage;
	}

	public FilereaderManager getFilereader() {
		if (filereader == null)
			filereader = new FilereaderManager();
		return filereader;
	}


}
