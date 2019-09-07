package TestingPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProgram2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://yahoo.com");
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();

	}

}
