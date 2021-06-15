package riteAid;



import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;







public class RiteAidProject {
// WebDriverManager.chromiumdriver().setup();
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.riteaid.com/");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//nav[1]/section[1]/button[1]/i[1]")).click();	
	    driver.findElement(By.xpath("//nav[1]/section[1]/a[2]/i[1]")).click();
	    Thread.sleep(2000);
	//	driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("drug");
		 Actions actions = new Actions(driver);
		 
		 WebElement options= driver.findElement(By.xpath("//div[2]/div[1]/div/ul[1]/li/ul/li[1]/a"));
		 actions.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(options).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
		 Thread.sleep(5000);
	
		

	//handle windows change
		 String base = driver.getWindowHandle();
		 Set<String> set = driver.getWindowHandles();
		 
		 set.remove(base);
		 assert set.size() == 1;
		 driver.switchTo().window ((String) set.toArray()[0]);	
		 driver.close();
		 driver.switchTo().window(base);	 
//	 actions.moveToElement(options).perform();
//	 options.click();	 
	 
//	 driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
		 
	/**********************************************************************************************************************************************/
		 
/*		List<WebElement> list =driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).isDisplayed())
			{
				String name =list.get(i).getText();
				System.out.println(name);
			}
		}*/
		 
/***********************************************************************************************************************************************************************/
/*	 try { 

		 List<WebElement> links = driver.findElements(By.xpath("//ul[@class='rfk_list']/li[1]")); 

		 int linkcount = links.size(); 

		 System.out.println(links.size());

		  for (WebElement myElement : links) {
			 
		 String link = myElement.getText();

		  System.out.println(link); 
		  System.out.println(myElement);
		 if (link !=" "){

		  myElement.click(); Thread.sleep(2000); 
		  //System.out.println(""); 

		 } 
		 Thread.sleep(5000); 

		 } }

		 catch (Exception e){

		  System.out.println("error "+e); }  } */
	
	/* *************************************************************************************************************/
		 
		 /*	 try {
				List<WebElement> componentList = driver.findElements(By.tagName("a"));
				System.out.println(componentList.size()); 
				 
				for (WebElement component : componentList)
				{
					System.out.println(component.getAttribute("href"));
				
				
				
				    if (component.getAttribute("href").contains("http://www.google.com/"))
				    {
				    	String link = component.getText(); 
						 System.out.println(link);
						 System.out.println(component);
				    	 
				        component.click();
				        System.out.println("clicked");
				        break;
				           
				    }
				}
		 }
				
				        catch(Exception e)
				        {
				        	System.out.println("error "+e);
				        }  */

				        }
}
