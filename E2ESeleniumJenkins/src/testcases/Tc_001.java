package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_001 {
	
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open page
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("prajaktapawar.pp@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.quit();
	}

}
