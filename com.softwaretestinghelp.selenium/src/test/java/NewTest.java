import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("Test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
	  System.setProperty("webdriver.gecko.driver", "G:\\Selenium\\Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest");
  }

}
