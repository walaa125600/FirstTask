package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{
    WebDriver driver;
    WebDriverWait wait;
    Extractor ext;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        jSExecutor = (JavascriptExecutor) driver;
    }

    public void ClickOnRegisterLink() throws Exception {
        ext = new Extractor();
        String AccountLinkString = ext.Locaters(0, 1);
        WebElement AccountLink = this.driver.findElement(By.xpath(AccountLinkString));
        jSExecutor.executeScript("arguments[0].click();", AccountLink);
        ScrollDown();
        String RegisterLinkString = ext.Locaters(0, 2);
        WebElement RegisterLink = this.driver.findElement(By.xpath(RegisterLinkString));
        ClickBtn(RegisterLink);
        ScrollDown();

    }
}
