package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement btncontinuelogin = driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN'][1]"));
		btncontinuelogin.click();
		WebElement btnlogin = driver.findElement(By.xpath("//input[@value()='Login ']"));
		btnlogin.click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		

		
	}

}
