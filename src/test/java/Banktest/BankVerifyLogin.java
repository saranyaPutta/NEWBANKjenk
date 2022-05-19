package Banktest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BankVerifyLogin {

	WebDriver driver;

	public void beforetest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.navigate().to("https://demo.guru99.com/V1/index.php");
		Thread.sleep(2000);

	}

}
