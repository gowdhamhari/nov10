package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		WebElement tabledata = driver.findElement(By.id("includedContent"));
		List<WebElement> tableRows = tabledata.findElements(By.tagName("td"));
		
		for (WebElement x : tableRows) {
			String text = x.getText();
			System.out.println(text);
			
			
		}
			
	}

}
