package orangehrm.testcases;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeRegTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		Employee emp = new Employee();
		boolean res = emp.addEmployee("Richards", "demo");
				
		
		if(res)
		{
			System.out.println("New Employee Registered Successfully, Test Pass");
		}else
		{
			System.out.println("New Employee Registered not displayed in Employee List, Test Fail");
		}

		lp.logout();
		AppUtils.CloseApp();
	}

}
