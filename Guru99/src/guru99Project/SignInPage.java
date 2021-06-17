package guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignInPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.FireFox.driver", "‪‪C:\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
      //  driver.findElement(By.name("uid")).sendKeys("mngr330883");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr330883");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abUvAqy");
   //     driver.findElement(By.name("password")).sendKeys("abUvAqy");
        Thread.sleep(1000);
        driver.findElement(By.name("btnLogin")).click();
        System.out.println("logged in successfully");
      //  driver.close();
        
	}

}
