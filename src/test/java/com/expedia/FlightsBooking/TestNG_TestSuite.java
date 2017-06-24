package com.expedia.FlightsBooking;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_classes.SearchPage;

public class TestNG_TestSuite {
	private WebDriver wd;
	private String baseURL;
	
	static Logger log = LogManager.getLogger(TestNG_TestSuite.class.getName());
  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.setProperty("webdriver.gecko.driver", "/Users/tatianakesler/Desktop/Selenium/installation/geckodriver");
		  
		  wd = new FirefoxDriver();
		  baseURL = "https://www.expedia.com/";
		  
		  wd.manage().window().maximize();
		  wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  PropertyConfigurator.configure("log4j.properties");
		  
	  }
	  
	@Test
  public void fill_basic_info() throws InterruptedException {
		  
		wd.get(baseURL);
		
		    SearchPage.navigateToFlightsTab(wd);
			SearchPage.fillOriginTextBox(wd, "New York");
			SearchPage.fillDestinationTextBox(wd, "Chicago");
			SearchPage.fillDepartureDate(wd,"12/25/2017");
			SearchPage.fillReturnDate(wd, "12/30/2017");
//			SearchPage.clickSearchButton(wd);
			
			Thread.sleep(3000);
  }
//	@Test
//	public void fillAdvancedInfo() throws InterruptedException{
//
//		SearchPage.navigateToFlightsTab(wd);
//		Thread.sleep(2000);
//		WebElement element = wd.findElement(By.id("flight-advanced-options-hp-flight"));
//		String advancedDD = element.getAttribute("aria-expanded");
//		System.out.println("The DD is collapsed: " + advancedDD);
//		if (advancedDD.contains("false")){
//			SearchPage.clickOnAdvancedLink(wd);		
//		
//			SearchPage.clickNonStopCheckBox(wd);
//			SearchPage.selectFlightClass(wd, "first");
//			//SearchPage.clickSearchButton(wd);
//		}
//		
//		else{
//		SearchPage.clickNonStopCheckBox(wd);
//		SearchPage.selectFlightClass(wd, "first");
//		//SearchPage.clickSearchButton(wd);
//		}
//	}

	@AfterMethod
  public void afterMethod() {
		log.info("test complete");
		wd.quit();
  
	}

}
