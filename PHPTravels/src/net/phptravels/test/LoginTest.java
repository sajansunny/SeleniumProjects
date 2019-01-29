package net.phptravels.test;

import org.testng.annotations.Test;

import net.phptravels.obj.AdministratorLogin;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
	WebDriver driver;
	AdministratorLogin al = new AdministratorLogin();
	
  @Test
  public void login() {
	  driver.findElement(al.Email).clear();
	  driver.findElement(al.Email).sendKeys("admin@phptravels.com");
	  driver.findElement(al.Password).clear();
	  driver.findElement(al.Password).sendKeys("demoadmin");
	  driver.findElement(al.Login).click();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  driver = new ChromeDriver(options);
	  driver.get("https://www.phptravels.net/admin");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();

	  
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
