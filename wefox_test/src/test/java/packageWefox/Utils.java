package packageWefox;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
public static WebElement waitForElement(WebDriver driver, By locator, int timeOut) throws Exception{
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			WebElement element = wait.until(presenceOfElementLocated(locator));
		
			return element;
			
		} catch (Exception e) {
			
			throw e;
		}
		
	}

public static void deleteFolder(String path) throws MalformedURLException, IOException {
		
			HttpURLConnection httpUrlConnection = (HttpURLConnection)new URL(path).openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));

			br.close();
}

public static void screenshot(String path, int ii, WebDriver driver) throws Exception {
	
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			HttpURLConnection httpUrlConnection = (HttpURLConnection)new URL(path+"/"+ii+".png").openConnection();
			httpUrlConnection.setDoOutput(true);
			httpUrlConnection.setRequestMethod("POST");
			httpUrlConnection.setRequestProperty("Content-Type", "application/json");
			OutputStream os = httpUrlConnection.getOutputStream();
	
			BufferedInputStream fis = new BufferedInputStream(new FileInputStream(screenshot));

			long totalByte = fis.available();
			long byteTrasferred = 0;
			for (int i = 0; i < totalByte; i++) {
		       os.write(fis.read());
		       byteTrasferred = i + 1;
			}

			os.close();
			BufferedReader in = new BufferedReader(
			new InputStreamReader(httpUrlConnection.getInputStream()));
			
			in.close();
			fis.close();
	
	}

}
