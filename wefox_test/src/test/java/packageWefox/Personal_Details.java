package packageWefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Personal_Details {
	
	public void PersonalDetails(WebDriver driver, String path) throws Exception {
		 
     	try {
    
     		Utils.waitForElement(driver,By.xpath("//label[@class='pure-material-textfield-outlined float-none']"), 10);
            driver.findElement(By.xpath("//label[@class='pure-material-textfield-outlined float-none']")).click();
            driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bob");
            driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Smith");
            driver.findElement(By.xpath("//button[text()='Got it!']")).click();
            driver.findElement(By.xpath("//div[@class='col-md-6 col-12 o2']")).click();
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mail@mail.com");
            driver.findElement(By.xpath("//div[@class='col-md-6 col-12 o1']")).click();
            driver.findElement(By.xpath("//input[@name='confirmemail']")).sendKeys("mail@mail.com");
            Utils.screenshot(path, 3, driver);
            driver.findElement(By.xpath("//button[text()='CONFIRM THIS BOOKING']")).click();
            
	 	} catch(Exception e) {	
	 		throw e;   
	 	}
	}
}
