package maven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseJ {

	@Test
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\info\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
			
	}
}
