package javademo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeClass {
	 static WebDriver driver;
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C\\lib\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

}
