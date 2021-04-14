package packageWefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Featured_Tours {
		
		public void FeaturedTours(WebDriver driver, String path) throws Exception {
			 
	     	try {
	    
	     		Utils.waitForElement(driver,By.xpath("//div[@class='featured']"), 15).click();
	     		Utils.screenshot(path, 1, driver);
	            driver.findElement(By.xpath("//a[@class='position-absolute-href' and contains(@href,alexandria)]")).click();
		 	} catch(Exception e) {	
		 		throw e;   
		 	}
		}
}
