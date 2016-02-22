package signUpFlow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {



	public WebDriver getChromedriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA software\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		return driver;
	}


	public WebDriver getFireFoxWebdriver(){
		WebDriver driver = new FirefoxDriver();
		return driver;
	}


}
