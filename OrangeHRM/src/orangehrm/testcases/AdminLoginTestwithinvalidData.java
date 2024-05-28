package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithinvalidData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("abc", "xyz");
		
		boolean res = lp.isErrMsgDisplayed();
		if(res)
		{
			System.out.println("System displayed appropriate error message for invalid credentials, test pass");
		}else
		{
			System.out.println("System not displayed appropriate error message for invalid credentials, test fail");
		}

		AppUtils.CloseApp(); 
	}
         
}
