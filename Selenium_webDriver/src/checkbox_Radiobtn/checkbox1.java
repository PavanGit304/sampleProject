package checkbox_Radiobtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox1 {
	public static void main(String[] args) throws InterruptedException {  
	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver109\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
     WebDriver driver = new ChromeDriver();  
     driver.get("D:\\downloads\\html\\javascript45(javascriptForm).html");
	 driver.findElement(By.id("c0")).click();
	 driver.findElement(By.id("c1")).click(); 
	}
}
