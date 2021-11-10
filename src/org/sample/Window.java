package org.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone",Keys.ENTER);
		WebElement btnphone = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		btnphone.click();
		String printwindowHandle = driver.getWindowHandle();
		System.out.println(printwindowHandle);
		Set<String> allwindowHandles = driver.getWindowHandles();
		System.out.println(allwindowHandles);
		
		for (String string : allwindowHandles) {
			if (!(printwindowHandle.equals(string))){
				driver.switchTo().window(string);
			}
		}
		WebElement btnAddcart = driver.findElement(By.id("add-to-cart-button"));
		btnAddcart.click();
		driver.switchTo().window(printwindowHandle);
		WebElement btnphone1 = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		btnphone1.click();
		driver.quit();
	}
}


