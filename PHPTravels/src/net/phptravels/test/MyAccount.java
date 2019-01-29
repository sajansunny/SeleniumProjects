package net.phptravels.test;

import org.testng.annotations.Test;

import net.phptravels.obj.Home;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

public class MyAccount implements ITestListener{
	
	WebDriver driver = null;
	Home hm = new Home();

  @Test
  public void SignUp() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  driver = new ChromeDriver(options);
	  driver.get("https://www.phptravels.net/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	  WebElement menuMyAccount = driver.findElement(hm.MyAccount);
	  WebElement menuMyAccount = driver.findElement(By.className("dropdown-toggle go-text-right"));
//	  menuMyAccount.findElement(By.xpath("//*[@id=\"li_myaccount\"]/a"));
	  menuMyAccount.click();
//	  WebElement tBox = driver.findElement(By.className("loader"));
//	  tBox.click();
//		WebElement menuSignUp = driver.findElement(hm.SignUp);
//		menuSignUp.click();
//		System.out.println("My Test");
//		Thread.sleep(5000);
//		driver.quit();	
		
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
//	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
//	  ChromeOptions options = new ChromeOptions();
//	  driver = new ChromeDriver(options);
//	  driver.get("https://www.phptravels.net/");
  }

  @AfterTest
  public void afterTest() {
	
	  
  }
@Override
public void onTestStart(ITestResult result) {
	System.out.println("onTestStart");
	// TODO Auto-generated method stub
	
}
@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}
@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
}
@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}
@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}
@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}
@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}

}
