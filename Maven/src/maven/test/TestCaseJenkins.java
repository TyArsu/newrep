package maven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseJenkins {
	
	@Test
	public void setUp1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\info\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
}
}