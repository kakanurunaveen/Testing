package modules;

import pageobject.LoginPage;

public class Login {
	
	public static void loginexe(String x,String y)
	{
		LoginPage.username.sendKeys(x);
		LoginPage.password.sendKeys(y);
		LoginPage.login.click();
		
	}

}
