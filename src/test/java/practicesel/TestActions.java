package practicesel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestActions {
	WebDriver driver;
	
	@Test
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Anil Data\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		/*
		 * driver.get("https://www.amazon.in"); System.out.println("Opened Amazon ");
		 * driver.navigate().to("https://selenium.dev");
		 * System.out.println("Opened Selenium Dev"); driver.navigate().back();
		 * System.out.println("came back to amazaon"); driver.navigate().forward();
		 * System.out.println("Moved to Selenium Dev again");
		 */
		
		driver.get("https://demoqa.com/browser-windows");
		
		String parentHandle = driver.getWindowHandle();
		
		WebElement opentab = driver.findElement(By.id("tabButton"));
		opentab.click();
		
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		newWindow.click();
		
		Set<String> winHandles = driver.getWindowHandles();
		
		for(String a : winHandles) {
			System.out.println("Windows handles: "+ a);
			if((!a.equals(parentHandle))){
				driver.switchTo().window(a);
				driver.get("https://gmail.com");
			}
				}
		
		driver.switchTo().window(parentHandle);
		
		
		
		
	}

}
