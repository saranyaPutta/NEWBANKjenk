package bankLoginObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Banklogin {
	WebDriver driver;
	public void BankLogin(WebDriver driver){
      driver = new ChromeDriver(); 
      
	}
	
	 By UsernameBox = By.xpath("//input[@name='uid']");
	 By PasswordBox = By.xpath("//input[@name='password']");
	 By LoginButton = By.name("btnLogin");
	 
	 public void EnterUsername() {driver.findElement(UsernameBox).clear();
	 driver.findElement(UsernameBox).sendKeys("mngr406025");
 }
 public void EnterPassword() throws InterruptedException {
	 driver.findElement(PasswordBox).clear();
	 driver.findElement(PasswordBox).sendKeys("yzYgysy");
	 System.out.println("hello");
 }

 public void VerifyLogin() {
	 driver.findElement(LoginButton).click();
	 System.out.println("hello1");
 }
    
}
