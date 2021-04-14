package packageWefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MainWebTest {
	
	private static WebDriver driver;
	private static String screenshotspath;
	private static String deletefolderpath;
	Featured_Tours featuredTours = new Featured_Tours();
	Booking_Options bookingOptions = new Booking_Options();
	Personal_Details personalDetails = new Personal_Details();
	Pay_Options payOptions = new Pay_Options();
	private String date;
	static int i = 1;
	
	@BeforeTest
    public static void baseState() throws Exception{
		
		screenshotspath = "https://testtestprojects.000webhostapp.com/Savescreenshots.php?filename=SCREENSHOTS";
		deletefolderpath = "https://testtestprojects.000webhostapp.com/DeleteDir.php?dir=SCREENSHOTS";
    	   	
        try {
        	
        	Utils.deleteFolder(deletefolderpath);
        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sergio\\eclipse\\seleniumJars\\geckodriver.exe");
        	driver = new FirefoxDriver();
               
        } catch(Exception e) {
        	
        	Assert.fail(e.getMessage());
            driver.quit();
            throw e;
            
        }
        
    }
	
	 @Test
     public void HotelReservation() throws Exception {
		 
     	try {
    
     		 driver.get("https://www.phptravels.net/");
     		 driver.manage().window().maximize();
     		 featuredTours.FeaturedTours(driver,screenshotspath);
     		 bookingOptions.BookingOptions(driver,screenshotspath);
     		 personalDetails.PersonalDetails(driver,screenshotspath);
     		 date = payOptions.PayOptions(driver,screenshotspath);
     		 
     		 Assert.assertTrue(date.contains("12/12/2021"), "correct date");
     	
	 	} catch(Exception e) {
	 		
	 		Assert.fail(e.getMessage());
	 		driver.quit();
	 		throw e;  
         
	 	} finally {
	 		
	 		driver.quit();
	 		
	 	}
     }

}
