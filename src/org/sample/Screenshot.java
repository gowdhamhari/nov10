package org.sample;

import java.io.File;

import org.antlr.v4.runtime.misc.Utils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
	  TakesScreenshot f = (TakesScreenshot) driver;
	  File screenshotAs = f.getScreenshotAs(OutputType.FILE);
	  
	  
	  File file = new File("C:\\Windows//homepage.png");
	  
	  
			  
	}

}
