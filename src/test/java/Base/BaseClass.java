package Base;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class BaseClass {
	public static WebDriver driver;
	WebDriverWait wait;
  
  @BeforeClass
  public void beforeClass() {
	  
	  	System.setProperty("webdriver.chrome.driver","D:\\prashant\\EaseMyTrip\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		

  }

  @AfterClass
  public void afterClass() throws Exception {
	  
	  Thread.sleep(5000);
//	  driver.quit();
  }

}
