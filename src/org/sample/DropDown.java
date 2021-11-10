package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		//select tag ......without using select class
		
		WebElement dDlan = driver.findElement(By.id("msdd"));
		dDlan.click();
		
		WebElement btnlanguages = driver.findElement(By.xpath("//a[text()='Arabic']"));
		btnlanguages.click();
		
		}
	}

