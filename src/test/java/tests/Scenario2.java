package tests;

import Pages.HomePage;
import Pages.LogInPage;
import Pages.MyAccountPage;
import org.testng.annotations.Test;

public class Scenario2 extends TestBase {
    @Test(priority = 0)
    public void NavigationToLogInPage() throws Exception {
        LogInPage LogInObject=new LogInPage(driver);
        LogInObject.ClickOnLoginLink();
    }

    @Test(priority = 1)
    public void LogIn() throws Exception {
        LogInPage LogInObject=new LogInPage(driver);
        LogInObject.FullFillData();
    }

    @Test(priority = 2)
    public void SelectCategory() throws Exception {
        MyAccountPage MyAccountObject=new MyAccountPage(driver);
        MyAccountObject.HoverToSpecificCategory();
    }




}
