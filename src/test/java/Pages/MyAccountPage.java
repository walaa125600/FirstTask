package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class MyAccountPage extends PageBase{
    WebDriver driver;
    WebDriverWait wait;
    Extractor ext;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        jSExecutor = (JavascriptExecutor) driver;
    }

    public WebElement SuccessfulRegistration() throws Exception {
        ext=new Extractor();
        ScrollDown();
        String SuccessfullyRegistrationSentenceLocator= ext.Locaters(0,10);
        WebElement Sentence=this.driver.findElement(By.xpath( SuccessfullyRegistrationSentenceLocator));
        return Sentence;
    }


   /* public void FitchEmail() throws Exception {
        ext=new Extractor();
        String EmailLocator=ext.Locaters(0,11);
        WebElement EmailRegistered=this.driver.findElement(By.xpath( EmailLocator));
        System.out.println("Mohamed");
        System.out.println(EmailRegistered.getText());
        System.out.println("Mohamed2");
    }*/
   public void LogOut() throws Exception {
       ext = new Extractor();
       String LoGoUTLinkString = ext.Locaters(0, 12);
       WebElement LoGoUTLink= this.driver.findElement(By.xpath(LoGoUTLinkString));
       jSExecutor.executeScript("arguments[0].scrollIntoView(true);",LoGoUTLink);
       ClickBtn(LoGoUTLink);

   }

   public void HoverToSpecificCategory() throws Exception {
       ext = new Extractor();
       String  WomenLinkString = ext.Locaters(0, 17);
       WebElement WomenLink= this.driver.findElement(By.xpath(WomenLinkString));
       ActionBuilder( WomenLink,driver);

       String  DressesAndSkirtString = ext.Locaters(0, 18);
       WebElement DressesAndSkirtLink= this.driver.findElement(By.xpath(DressesAndSkirtString));
       ActionBuilder(DressesAndSkirtLink,driver);

       String  DressesAndSkirtsLinkString = ext.Locaters(0, 18);
       WebElement DressesAndSkirtsLink= this.driver.findElement(By.xpath(DressesAndSkirtsLinkString));
       ClickBtn(DressesAndSkirtsLink);
   }

}
