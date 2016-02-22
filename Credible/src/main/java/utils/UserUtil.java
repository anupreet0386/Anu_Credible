package utils;

import org.openqa.selenium.WebDriver;

/**
 * @author anupreet
 */
public class UserUtil {

	public static void navigateTo(WebDriver driver, String url){
		driver.get(url);
	}
}
