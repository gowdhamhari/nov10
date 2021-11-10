package org.sample;

import java.util.List;

import javax.lang.model.element.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DailyPratice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	
		
		WebElement dDncars = driver.findElement(By.id("cars"));
		Select Select = new Select(dDncars);
	
		//.....select all options text
		//Get all options
		List<WebElement> options = Select.getOptions();
		for (WebElement webElement : options) {
			//text
			String name = webElement.getText();
			Select.selectByVisibleText(name);
		}
			
			List <WebElement> allSelectedOptions = Select.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				//text
				String name = webElement.getText();
				System.out.println(name);
				
			}
				//close browser
			    //close.quit();
				
			}
}