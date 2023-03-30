package browser_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Details {
private static String url;

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kruthika M\\eclipse-workspace\\selenium_automation\\all_necessary_files\\chromedriver.exe");
	//open the browser
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.ecoders.in");
	//navigate to the web address
	driver.navigate().to("https://www.ecoders.in");
	//sleep for 5 seconds
	//get the title of the webpage
	String title = driver.getTitle();
	System.out.println(title);
	//get the url of the webpage
      String urlofpage = driver.getCurrentUrl();
      System.out.println(urlofpage);
      //to get the pagesource
//      String page = driver.getPageSource();
//      System.out.println(page);
	
	Thread.sleep(5000);
	//close all the browser	
	driver.quit();
}
}
