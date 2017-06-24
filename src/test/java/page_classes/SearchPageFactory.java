package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPageFactory {
	WebDriver wd;
	
	@FindBy (id="tab-hotel-tab-hp")
	WebElement HotelsTab;
	
	@FindBy(id="primary-header-home")
	WebElement HomeTab;
	
	@FindBy(id="header-history")
	WebElement headerHistory;

	@FindBy(id="tab-flight-tab-hp")
	WebElement flightsTab;
	
	@FindBy (id="flight-type-roundtrip-label-hp-flight")
	WebElement roundTrip;
	
	@FindBy(id="flight-type-multi-dest-label-hp-flight")
	WebElement multyDest;
	
	@FindBy(id="flight-add-hotel-checkbox-hp-flight")
	WebElement addHotel;
	
	@FindBy(id="flight-advanced-options-hp-flight")
	WebElement advancedOptions;
	
	@FindBy(id="flight-add-car-checkbox-hp-flight")
	WebElement addCar;
	
	@FindBy(id="advanced-flight-nonstop-label-hp-flight")
	WebElement Nonstop;
	
	@FindBy(id="advanced-flight-refundable-label-hp-flight")
	WebElement RefundableFlight;
	
	@FindBy(id="flight-adults-hp-flight")
	WebElement Adults;
	
	@FindBy(id="flight-children-hp-flight")
	WebElement Children;
//	
	@FindBy(id="flight-origin-hp-flight")
	WebElement OriginCity;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement FlyingTo;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement Departing;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement Returning;
	
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//span[text()='Search']")
	WebElement SearchButton;
//	


	public SearchPageFactory(WebDriver wd){
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}
		
	public void ClickHotelsTab(){
		HotelsTab.click();
	}
	
    public void clickFlightTab(){
	   //HomeTab.click();
    	flightsTab.click();
    }

    public void clickRoundTrip(){
    	roundTrip.click();
    }
    
    public void clickMultyDest(){
    	multyDest.click();
    }
    
    public void addHotelCheck(){
    	addHotel.click();
    }
    
    public void advancedOptionsCheck(){
    	advancedOptions.click();
    }
    
    public void addCarCheck(){
    	addCar.click();
    }
    
    public void adultsCheck(){
    	Adults.click();
    }
    
    public void childrenCheck(){
    	Children.click();
    }
    public void NonstopChecked(){
    	Nonstop.click();
    }
    
    public void RefundableFlightChecked(){
    	RefundableFlight.click();
    }
    
    public void setoriginCity(String origin){
    	OriginCity.sendKeys(origin);
    }
    
    public void setDestiantionCity(String destinationCity){
    	FlyingTo.sendKeys(destinationCity);
    }
    
    public void setDepartureDate(String departureDate){
    	Departing.sendKeys(departureDate);
    }
    
    public void setReturningDate(String ReturningDate){
    	Returning.sendKeys(ReturningDate);
    }

    public void clickSearchButton(){
	    SearchButton.click();
    }


}