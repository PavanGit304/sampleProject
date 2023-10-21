package drang_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drag_drop_ex1 {
	
	static WebDriver driver ;
	public static void main(String []args){	
		try {
 //setProperty: it set the properties for the desired browser to be used in test automation.			
 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver109\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  

			driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("	");
			// driver.findElement(By.xpath("//DIV[@id='closeBtn']")).click();
		   //  Thread.sleep(1000);
			 WebElement sourceLocator=driver.findElement(By.xpath("//*[@id='credit2']/a"));	   //Element which needs to drag.
			 WebElement targetLocator=driver.findElement(By.xpath("//*[@id='bank']/li"));	  //Element on which need to drop.	
			 WebElement source=driver.findElement(By.xpath("//*[@id='fourth']/a"));         //Element which needs to drag. 
	         WebElement target=driver.findElement(By.xpath("//*[@id='amt7']/li"));	       //Element on which need to drop.
	   
		        //Using Action class for drag and drop.		
		         Actions act=new Actions(driver);					
		         act.dragAndDrop(sourceLocator,targetLocator).build().perform();  //Dragged and dropped.	
		         Thread.sleep(2000);
		         act.dragAndDrop(source,target).build().perform();	            //Dragged and dropped
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}

