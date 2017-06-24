package page_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import utilities.waitTypes;

//import org.openqa.selenium.*;

public class SearchPage {
	
	public static WebElement element = null;

	static Logger log = LogManager.getLogger(SearchPage.class.getName());
	
	/**
	 * Returns the flight origin text box element
	 * @param wd
	 * @return
	 */
	public static WebElement originTextBox(WebDriver wd){
		element = wd.findElement(By.id("flight-origin-hp-flight"));
		log.info("Origin text box element found");
		return element;
	}
	
	//Send keys Origin text box
	public static void fillOriginTextBox(WebDriver wd, String origin){
		element = originTextBox(wd);
		element.sendKeys(origin);
		log.info("Entered origin city is: " + origin);
	}
		
	/**
	 * Returns the flight destination text box element
	 * @param wd
	 * @return	
	 */
	public static WebElement destinationTextBox (WebDriver wd){
			element = wd.findElement(By.id("flight-destination-hp-flight"));
			log.info("Destination text box element found");
			return element;
		}
	
	public static void fillDestinationTextBox (WebDriver wd, String Destination){
		   element = destinationTextBox(wd);
		   element.sendKeys(Destination);
		   log.info("Entered destination city is: " + Destination);
	}
		
		/**
		 * Returns the departure date text box element
		 * @param wd
		 * @return	
		 */
	public static WebElement departureDateTextBox(WebDriver wd){
		   element = wd.findElement(By.id("flight-departing-hp-flight"));
		   return element;
	}
	
	public static void fillDepartureDate(WebDriver wd, String DepartureDate){
		element = departureDateTextBox(wd);
		element.clear();
		element.sendKeys(DepartureDate);
		log.info("Entered departure date is: " + DepartureDate);
	}

		/**
		 * Returns the return date text box element
		 * @param wd
		 * @return	
		 */
	public static WebElement returnDateTextBox(WebDriver wd){
		   element = wd.findElement(By.id("flight-returning-hp-flight"));
		   return element;
	}
	
	public static void fillReturnDate(WebDriver wd, String ReturnDate){
		   element = returnDateTextBox(wd);
		   returnDateTextBox(wd).clear();
		   element.sendKeys(ReturnDate);
		   log.info("Entered return date is: " + ReturnDate);
	}

		/**
		 * Returns the search button box element
		 * @param wd
		 * @return	
		 */
	public static WebElement searchButton (WebDriver wd){
		element =wd.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//span[text()='Search']"));
		return element;
	}
	
	/**
	 * Click search button
	 * @param wd
	 */
	public static void clickSearchButton(WebDriver wd){
		element = searchButton(wd);
		element.click();
	}
	
	/**
	 * Navigate to flights tab
	 * @param wd
	 */
	
	public static void navigateToFlightsTab(WebDriver wd){
		wd.findElement(By.id("primary-header-home")).click();
		element = wd.findElement(By.id("tab-flight-tab-hp"));
		element.click();
		log.info("Navigate to flights tab");
	}
	
	/**
	 * Click on Advanced Options link
	 * @param wd
	 */
	public static void clickOnAdvancedLink(WebDriver wd) {
		element = wd.findElement(By.id("flight-advanced-options-hp-flight"));
		element.click();
		log.info("Clicked on Advanced Options link");
		
	}
	/**
	 * Click non-stop check box
	 * @param wd
	 */
	public static void clickNonStopCheckBox(WebDriver wd) {
		element = wd.findElement(By.id("advanced-flight-nonstop-label-hp-flight"));
		element.click();
		log.info("Clicked non-stop check box");
	}
	/**
	 * Select flight class
	 * @param driver
	 */
	public static void selectFlightClass(WebDriver wd, String flightClass) {
		Select options = new Select(wd.findElement(By.id("flight-advanced-preferred-class-hp-flight")));
		options.selectByValue(flightClass);
		log.info("Select flight class as " + flightClass);
	}
	/**
	 * Select Morning flight
	 * @param wd
	 */
	
	///element locator is incorrect!!!!
	
	public static void clickMorning(WebDriver wd){
		WebElement element = waitTypes.getWhenVisible(wd,
				By.id("outbound-departure-times-Morning-flights-checkbox"), 30);
		element.click();
		log.info("Clicked on Morning Time to filter the results");
	}
	
	/**
	 * Clear all input fields on the search page
	 * @param wd
	 */
	public static void clearAllFields(WebDriver wd){
		wd.findElement(By.id("flight-origin-hp-flight")).clear();
		wd.findElement(By.id("flight-destination-hp-flight")).clear();
		wd.findElement(By.id("flight-departing-hp-flight")).clear();
		wd.findElement(By.id("flight-returning-hp-flight")).clear();
	}
	/**
	 * Select number of Adults flying
	 * @param wd
	 */
	public static void selectFlightAdults(WebDriver wd, String flightAdults){
		Select options = new Select(wd.findElement(By.id("flight-adults-hp-flight")));
		options.selectByValue(flightAdults);
		log.info("Number of adults selected: " + flightAdults);
	}
	
	
	
	
	
	
	
	
	/**
	 * Clicks Hotels tab
	 * @param wd
	 */
	
	public static void ClickHotelTab(WebDriver wd){
		element = wd.findElement(By.id("tab-hotel-tab-hp"));
		element.click();
		log.info("Clicked on Advanced Options link");
	}
	/**
	 * Click Bundle Deals
	 * @param wd
	 */
	//primary-header-package
	public static void ClickBundleDeals(WebDriver wd){
		element = wd.findElement(By.id("primary-header-package"));
		element.click();
	}

	}	
	
