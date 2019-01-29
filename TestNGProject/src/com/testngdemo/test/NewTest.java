package com.testngdemo.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	  @Test(enabled=false)
	  public void GoogleSearch1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("Cars");
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.sendKeys(Keys.ESCAPE);
		searchButton.click();
		WebElement resultStats = driver.findElement(By.xpath("//*[@id=\"resultStats\"]"));
		Assert.assertEquals(resultStats.isDisplayed(), true);
		//WebElement resultLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div/div/h3/a"));
		//WebElement resultLink = driver.findElement(By.xpath("//*[@id=\"rso\"]//*//h3/a"));
		
		WebElement resultLink1 = driver.findElement(By.xpath("//*[@id=\"rso\"]//*//div[1]/div/div/h3/a"));
		System.out.println(resultLink1.getAttribute("href"));
		
		WebElement resultLink2 = driver.findElement(By.xpath("//*[@id=\"rso\"]//*//div[2]/div/div/h3/a"));
		System.out.println(resultLink2.getAttribute("href"));
		
		
		
		List<WebElement> resultLinks = driver.findElements(By.xpath("//*[@id=\"rso\"]//*//h3/a"));
		
		for (WebElement e: resultLinks) {
			
			System.out.println(e.getAttribute("href"));
		}
		
		//resultLink.click();
		Thread.sleep(5000);
		driver.quit();
	  }
	  
	  @Test(enabled=false)
	  public void InputElementsCheck() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//WebDriver driver = new ChromeDriver(options);
		  
		//System.setProperty("webdriver.edge.driver", "E:\\Selenium\\Drivers\\MicrosoftWebDriver.exe");
		//EdgeOptions options = new EdgeOptions();
		//WebDriver driver = new EdgeDriver(options);
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		WebDriver driver = new FirefoxDriver(options);
		  
		driver.get("http://www.google.com");
		List<WebElement> inputElements = driver.findElements(By.tagName("input"));
		System.out.println("No. of elements with <input> tag: " + inputElements.size());
		
		System.out.println("Elements with id");
		for (WebElement e: inputElements) {
			System.out.println(e.getAttribute("id"));
		}
		
		System.out.println("Elements with name");
		for (WebElement e: inputElements) {
			System.out.println(e.getAttribute("name"));
		}
		
		Thread.sleep(5000);
		driver.quit();
	  }
	  
	  @Test(enabled=false)
	  public void AllElementsCheck() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.google.com");
		List<WebElement> allElements = driver.findElements(By.tagName("*"));
		
		ArrayList<String> allTags = new ArrayList<String>();
		for (WebElement e: allElements) {
			String s = e.getTagName();
			allTags.add(s);
		}
		
		Set<String> distinctElements = new HashSet<String>(allTags);
		for(String tagName : distinctElements) {
			System.out.println(tagName + ": "+ Collections.frequency(allTags, tagName));
		}
		
		Thread.sleep(5000);
		driver.quit();
	  }
	  
	  @Test(enabled=false)
	  public void SelectClass() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.phptravels.net/");
			WebElement dropdownAdults = driver.findElement(By.id("adults"));
			Select selectClass = new Select (dropdownAdults);
			
			selectClass.selectByIndex(1);
			Thread.sleep(5000);
			
			selectClass.selectByValue("3");
			Thread.sleep(5000);
			
			selectClass.selectByVisibleText("5");;
			Thread.sleep(5000);
			
			driver.quit();		
		  
	  }
	  
	  @Test(enabled=false)
	  public void DropdownTest() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://the-internet.herokuapp.com/dropdown");
			WebElement dropdownAdults = driver.findElement(By.id("dropdown"));
			Select selectClass = new Select (dropdownAdults);
			
			selectClass.selectByIndex(1);
			Thread.sleep(5000);
			
			selectClass.selectByValue("1");
			Thread.sleep(5000);
			
			selectClass.selectByVisibleText("Option 2");;
			Thread.sleep(5000);
			
			driver.quit();		
		  
	  }
	  
	  @Test(enabled=false)
	  public void CheckboxTest() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://the-internet.herokuapp.com/checkboxes");
			WebElement checkBoxe1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
			if(!checkBoxe1.isSelected()) {
				checkBoxe1.click();
			}
			else {
				System.out.println("The checkbox is already checked!");
			}

			Thread.sleep(5000);
			
			WebElement checkBoxe2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
			if(checkBoxe2.isSelected()) {
				checkBoxe2.click();
			}
			else {
				System.out.println("The checkbox is already unchecked!");
			}
			
			Thread.sleep(5000);
			driver.quit();		
	  }
	  
	  @Test(enabled=false)
	  public void RadiobuttonTest() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			//driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_radio");
			driver.get("file:///E:/Test/SampleRadio.html");
			//List<WebElement> radioList = driver.findElements(By.tagName("input"));
			List<WebElement> radioList = driver.findElements(By.xpath("//input[@type = 'radio']"));
			System.out.println(radioList.size());
			for (WebElement e: radioList) {
				if (e.isSelected()) {
					System.out.println(e.getAttribute("value"));
				}					
			}
			Thread.sleep(5000);
			driver.quit();			
	  }

	  @Test(enabled=false)
	  public void NavigateTest() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			//driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_radio");
			driver.get("file:///E:/Test/SampleRadio.html");
			List<WebElement> radioList = driver.findElements(By.tagName("input"));
			System.out.println(radioList.size());
			for (WebElement e: radioList) {
				if (e.isSelected()) {
					System.out.println(e.getAttribute("value"));
				}					
			}
			Thread.sleep(5000);
			driver.quit();			
	  }
	  
	  @Test(enabled=true)
	  public void TableTest() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			driver.get("http://toolsqa.com/automation-practice-table/");
			WebElement tableRecord = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[3]/td[2]"));
			System.out.println(tableRecord.getText());
			WebElement tableClass = driver.findElement(By.className("tsc_table_s13"));
			List<WebElement> tablRows = tableClass.findElements(By.xpath("./tbody/tr"));
			
			for(WebElement e :tablRows) {
				System.out.println(e.getText());
			}
			
			
			//List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
			//List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id=\\\"content\\\"]/table//tr"));
			//System.out.println(tableRows.size());
			
			Thread.sleep(5000);
			driver.quit();
			
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