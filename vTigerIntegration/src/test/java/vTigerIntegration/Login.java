package vTigerIntegration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
@Test
public void validlogin(){
	System.out.println("Hello");
	
	System.setProperty("webdriver.chrome.driver","F:\\SELENIUM\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	    driver .get("http://localhost:100/");
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin"); 
	    driver.findElement(By.name("login_theme")).sendKeys("blue");
	    driver.findElement(By.name("Login")).click();
	    System.out.println("Login successfully");
	    driver.findElement(By.linkText("Logout")).click();
	    System.out.println("logout successfully");
	    driver.close();
	    driver.quit();
	    
}
}
