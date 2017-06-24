package page_classes;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;



public class waitTypes {
	/**
	 * Get element when it's ready
	 * @param wd
	 * @param locatior
	 * @param timeout
	 * @return
	 */
	public static WebElement getWhenVisible(WebDriver wd, By locator, int timeout){
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(wd, timeout);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(locator));
		return element;
	}
	
	/**
	 * Click the element once it's ready
	 * @param wd
	 * @param locator
	 * @param timeout
	 */
	public static void clickWHenReady(WebDriver wd, By locator, int timeout){
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(wd, timeout);
		element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	/**
	 * Poll for element until the element is present
	 * @param wd
	 * @param locator
	 * @return
	 */
	public static WebElement fluentWait(WebDriver wd, final By locator){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(wd)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		//import Function from google
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			//@Override
			public WebElement apply(WebDriver wd) {
				return wd.findElement(locator);
			}
		});
		return element;
		
		
	}


}
