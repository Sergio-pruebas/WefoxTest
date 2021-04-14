package packageWefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Booking_Options {
	
	public void BookingOptions(WebDriver driver, String path) throws Exception {
		 
     	try {
    
     		Utils.waitForElement(driver,By.name("date"), 10);
            
            driver.findElement(By.name("date")).clear();
            driver.findElement(By.name("date")).sendKeys("12/12/2021");
            driver.findElement(By.xpath("//h5[text()='Booking Options']")).click();
            driver.findElement(By.xpath("//button[text()='Change Date']")).click();
            driver.findElement(By.xpath("//button[text()='Got it!']")).click();
            driver.findElement(By.xpath("//div[@class='section-title mb-25']")).click();
            Utils.screenshot(path, 2, driver);
            driver.findElement(By.xpath("//button[text()='Book Now']")).click();
            		
	 	} catch(Exception e) {	 		
	 		throw e;          
	 	}
	}

}
