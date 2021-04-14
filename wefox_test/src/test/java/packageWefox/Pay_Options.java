package packageWefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pay_Options {

	public String PayOptions(WebDriver driver, String path) throws Exception {
		 
     	try {
     		
     		String date = Utils.waitForElement(driver,By.xpath("//ul[@class='confirmation-list']"), 10).getText();
     		Utils.screenshot(path, 4, driver);
     		Utils.waitForElement(driver,By.xpath("//button[text()='Pay Now']"), 10);
     		driver.findElement(By.xpath("//button[text()='Pay Now']")).click();
     		Utils.waitForElement(driver,By.id("gateway_chosen"), 10);
     		driver.findElement(By.id("gateway_chosen")).click();
            driver.findElement(By.xpath("//li[@class='active-result' and @data-option-array-index='2']")).click();
            Utils.screenshot(path, 5, driver);
            return date;
            
	 	} catch(Exception e) {	
	 		throw e;   
	 	}
     	
	}
}
