package tests;

import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1 extends TestBase{

    @Test(priority = 0)
    public void NavigationToRegistrationPage() throws Exception {
        HomePage HomeObject=new HomePage(driver);
        HomeObject.ClickOnRegisterLink();

    }

    @Test(priority = 1)
    public void Registration() throws Exception {
        RegistrationPage RegistrationObject=new RegistrationPage(driver);
        RegistrationObject.FullFillData();

    }

    @Test(priority = 2)
    public void Assertion() throws Exception {
        MyAccountPage MyAccountObject=new MyAccountPage(driver);
        Assert.assertEquals( MyAccountObject.SuccessfulRegistration().getText(),"Thank you for registering with Madison Island.");
    }

    @Test(priority = 3)
    public void LogOut() throws Exception {
        MyAccountPage MyAccountObject = new MyAccountPage(driver);
        MyAccountObject.LogOut();
    }


}
