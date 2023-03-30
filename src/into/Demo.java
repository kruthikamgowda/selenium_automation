package into;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {
public static void main(String[] args) {
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kruthika M\\eclipse-workspace\\selenium_automation\\all_necessary_files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kruthika M\\eclipse-workspace\\selenium_automation\\all_necessary_files\\geckodriver.exe");
	WebDriver driver1 = new FirefoxDriver();
	
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Kruthika M\\eclipse-workspace\\selenium_automation\\all_necessary_files\\IEDriverServer.exe");
	WebDriver driver2 = new InternetExplorerDriver();*/
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Kruthika M\\eclipse-workspace\\selenium_automation\\all_necessary_files\\msedgedriver.exe");
	WebDriver driver3 = new EdgeDriver();
	
	//SafariDriver driver4 = new SafariDriver();
	
}
}
