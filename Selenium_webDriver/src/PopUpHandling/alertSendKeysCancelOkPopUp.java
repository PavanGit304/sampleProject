package PopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertSendKeysCancelOkPopUp {
	

	public static void main(String []args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver109\\chromedriver.exe");
		
		 WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("D:\\downloads\\html\\javascript8(if cond using prompt).html");
		//d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”. The default setting is 0.
		Thread.sleep(1000);	
		Alert obj = d.switchTo().alert();
		obj.sendKeys("1");
		obj.accept();
		Thread.sleep(2000);
		obj.sendKeys("2");
		obj.accept();
//		obj.dismiss();
		
		//d.close();
		
	}

}
