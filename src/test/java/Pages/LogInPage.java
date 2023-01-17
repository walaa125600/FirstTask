package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends PageBase{
    WebDriver driver;
    WebDriverWait wait;
    Extractor ext;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        jSExecutor = (JavascriptExecutor) driver;
    }

    public void ClickOnLoginLink() throws Exception {
        ext=new Extractor();
        String LogInLinkLocator=ext.Locaters(0,13);
        WebElement LogInLink=this.driver.findElement(By.xpath(LogInLinkLocator));
        jSExecutor.executeScript("arguments[0].scrollIntoView(true);",LogInLink);
        ClickBtn(LogInLink);

    }


    public void FullFillData() throws Exception {
        ext=new Extractor();
        String EmailLocator=ext.Locaters(0,14);
        WebElement EmailTxtBox=this.driver.findElement(By.id(EmailLocator));
        String EmailTxtBoxValue=ext.Locaters(1,7);
        SetTextElementTxt(EmailTxtBox,EmailTxtBoxValue);

        String PasswordLocator=ext.Locaters(0,15);
        WebElement PasswordTxtBox=this.driver.findElement(By.id(PasswordLocator));
        String PasswordValue=ext.Locaters(1,4);
        SetTextElementTxt(PasswordTxtBox,PasswordValue);

        String LogInLocator=ext.Locaters(0,16);
        WebElement LogInBtn=this.driver.findElement(By.xpath(LogInLocator));
        ClickBtn(LogInBtn);



    }
}
