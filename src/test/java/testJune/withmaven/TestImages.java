package testJune.withmaven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestImages {

	public static void main(String[] args) {
		String homepage = "https://www.amazon.in";
		
		System.setProperty("webdriver.chrome.driver", "C:\\FreshData\\SeleniumInstallables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int respcode = 200;
		String url = "";
		HttpURLConnection huc = null;
		
		driver.get(homepage);
		
		List<WebElement> ListOfImages  = driver.findElements(By.tagName("img"));
		List<WebElement> ListOfAtags  = driver.findElements(By.tagName("a"));
		System.out.println("Number of images: "+ListOfImages.size() +"    Number of urls: "+ListOfAtags.size());
		
		
		List ListOfUrlsFromATags = new ArrayList();
		
		Iterator<WebElement> it = ListOfAtags.iterator();
		while(it.hasNext()) {
			url = it.next().getAttribute("href");
			System.out.println(url);
			ListOfUrlsFromATags.add(url);
		
		if(url == null || url.isEmpty()){
			System.out.println("URL is either not configured for anchor tag or it is empty");
			                continue;
			            }
			            
			            if(!url.startsWith(homepage)){
			                System.out.println("URL belongs to another domain, skipping it.");
			                continue;
			            }
			            
			            try {
			                huc = (HttpURLConnection)(new URL(url).openConnection());
			                
			                huc.setRequestMethod("HEAD");
			                
			                huc.connect();
			                
			                respcode = huc.getResponseCode();
			                
			                if(respcode >= 400){
			                    System.out.println(url+" is a broken link");
			                }
			                else{
			                    System.out.println(url+" is a valid link");
			                }
			                    
			            } catch (MalformedURLException e) {
			                // TODO Auto-generated catch block
			                e.printStackTrace();
			            } catch (IOException e) {
			                // TODO Auto-generated catch block
			                e.printStackTrace();
			            }
			        }
		System.out.println("Here is the List of urls: "+ListOfUrlsFromATags);
		driver.quit();
	}
}

			        
			        

			    
			
