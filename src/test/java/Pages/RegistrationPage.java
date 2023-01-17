package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class RegistrationPage extends PageBase{

    WebDriver driver;
    WebDriverWait wait;
    Extractor ext;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        jSExecutor = (JavascriptExecutor) driver;
    }

    public void FullFillData() throws Exception {
        ext = new Extractor();
        String FirstNameLocator=ext.Locaters(0,3);
        WebElement FirstNameTxtBox=this.driver.findElement(By.id(FirstNameLocator));
        String FirstNameValue=ext.Locaters(1,1);
        SetTextElementTxt(FirstNameTxtBox,FirstNameValue);


        String LastNameLocator=ext.Locaters(0,4);
        WebElement LastNameTxtBox=this.driver.findElement(By.id(LastNameLocator));
        String LastNameValue=ext.Locaters(1,2);
        SetTextElementTxt(LastNameTxtBox,LastNameValue);

        String EmailLocator=ext.Locaters(0,5);
        WebElement EmailTxtBox=this.driver.findElement(By.id(EmailLocator));
        SetTextElementTxt(EmailTxtBox,GenerateRandomEmail());

        String PasswordLocator=ext.Locaters(0,6);
        WebElement PasswordTxtBox=this.driver.findElement(By.id(PasswordLocator));
        String PasswordValue=ext.Locaters(1,4);
        SetTextElementTxt(PasswordTxtBox,PasswordValue);


        String ConfirmedPasswordLocator=ext.Locaters(0,7);
        WebElement ConfirmedPasswordTxtBox=this.driver.findElement(By.id(ConfirmedPasswordLocator));
        String ConfirmedPasswordValue=ext.Locaters(1,5);
        SetTextElementTxt(ConfirmedPasswordTxtBox,ConfirmedPasswordValue);

        String CheckBoxLocator=ext.Locaters(0,8);
        WebElement CheckBox=this.driver.findElement(By.id(CheckBoxLocator));
        ClickBtn(CheckBox);

        String RegisterBtnLocator=ext.Locaters(0,9);
        WebElement RegisterBtn=this.driver.findElement(By.xpath(RegisterBtnLocator));
        ClickBtn(RegisterBtn);






    }


    public String GenerateRandomEmail() throws Exception {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);

        String EmailValue=ext.Locaters(1,3);
        String EmailForm=ext.Locaters(1,6);
        String FullEmail=EmailValue+ randomInt +EmailForm;


        return  FullEmail;
    }

}
