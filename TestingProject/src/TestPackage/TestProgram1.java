package TestPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProgram1 {

	public static void main(String[] args)
	{
		
			System.setProperty("webdriver.chrome.driver", "D:\\workspace\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");
			String title = driver.getTitle();
			System.out.println(title.length());
			System.out.println(driver.getTitle());
			driver.close();
			driver.quit();
		

	}

}
