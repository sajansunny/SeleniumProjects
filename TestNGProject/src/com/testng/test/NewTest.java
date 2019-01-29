package com.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testng.objects.ObjGoogle;



public class NewTest {
	
  @Test
  public void f() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://www.google.com");
	ObjGoogle og = new ObjGoogle();
	WebElement element = driver.findElement(og.textBox);
	element.sendKeys("Cars");
	Thread.sleep(5000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }
  

}
