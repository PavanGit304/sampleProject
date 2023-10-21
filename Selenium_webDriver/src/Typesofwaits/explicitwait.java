package Typesofwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {/*it tells the webdriver to wait certain condition before throws an exception */

	 static WebDriver driver;
//	 WebDriverWait wait;
	
    public static void main(String[] args) {	
    	
   	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver109\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
     driver = new ChromeDriver();  
     new explicitwait().m1();
	 }
    
     
    public void m1() {
    	 WebDriverWait wait = new WebDriverWait(driver,50);
    	  driver.get("D:\\downloads\\html\\javascript45(javascriptForm).html");
//    	     WebElement bike =driver.findElement(By.id("c0"));
//    	     wait.until(ExpectedConditions.visibilityOf(bike)).click(); // we can use in a 2 ways 1 directly webelememnt 2 with webelement nam
    	     wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("c0")))).click();
    	     wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("c1")))).click();    
    	
    }
}
