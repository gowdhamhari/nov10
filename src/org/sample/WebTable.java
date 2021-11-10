package org.sample;

import java.util.List;
import javax.lang.model.element.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tableData = driver.findElement(By.id("customers"));
		List<WebElement> tableRows = tableData.findElements(By.tagName("tr"));
		
		for (WebElement x : tableRows) {
			String text = x.getText();
			System.out.println(text);
		}
		System.out.println("");
			
			
		}
		
	}


