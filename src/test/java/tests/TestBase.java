package tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
//import utility.Helper;


    public class TestBase {

        public WebDriver driver;
        String url = "http://magento-demo.lexiconn.com/";
        @BeforeSuite
        @Parameters(("browser"))
        public void StartDriver(@Optional ("chrome") String browserName)
        {
            if (browserName.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            else if (browserName.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            else if (browserName.equalsIgnoreCase("safari")){
                System.setProperty("webdriver.safari.driver",System.getProperty("user.dir") + "/drivers/SafariDriver");
                driver = new SafariDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.navigate().to(url);

        }

        //@AfterSuite
	/*public void StopDriver()
	{
		driver.quit();
	}*/

        //Take a screenshot when Testcase fail and add it in the Screenshots folder
        @AfterMethod
        public void TakeScreenShotsOnFailure(ITestResult Result)
        {
            if (Result.getStatus()==ITestResult.FAILURE) {
                System.out.println("Failed!");
                System.out.println("Taking ScreenShot.......");
                //Helper.CaptureScreenShot(driver,Result.getName());


            }
        }
    }






