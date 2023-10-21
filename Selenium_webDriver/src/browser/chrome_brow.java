package browser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import grid.newGrid;

public class chrome_brow {

	public static void main(String[]args){
		chrome_brow obj= new chrome_brow();
		obj.lunchbrow();
	}
		
		public void lunchbrow() {	
		try {

			Map<String, Object> prefs = new HashMap<String, Object>();
	     	prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
//			FirefoxOptions option = new FirefoxOptions();
			options.setExperimentalOption("prefs", prefs);
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver114\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		WebDriver d= new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.lightinthebox.com/en/p/men-s-t-shirt-tee-solid-color-v-neck-street-casual-short-sleeve-tops-basic-fashion-classic-comfortable-white-navy-blue-summer_p9169020.html?prm=1.5.1.1");
//		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/form/ul/li[2]/div[1]/div[1]/div/div[3]/span")).click();
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/form/div[3]/input")).click();
//		d.findElement(By.xpath("//*[@id=\"registerEmail\"]")).sendKeys("abc@gmail.com");
//		d.findElement(By.xpath("//*[@id=\"registerPassword\"]")).sendKeys("1111");
		
//		d.findElement( By.xpath("//*[@id=\"2_288\"]")).click();
		WebElement ele = d.findElement( By.xpath("//*[@id=\"2_288\"]"));
		Select obj = new Select(ele);
		obj.selectByVisibleText("pavankalyan");
		obj.selectByIndex(0);
		obj.selectByValue("pavankalyan");
		List<WebElement> allcar = obj.getOptions();
		for(WebElement obj1 :allcar) {
			System.out.print(obj1.getText());
			obj1.click();
		}
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement obj1 = d.findElement(By.id(""));
	
	List<WebElement> obj3 = d.findElements(By.id(""));
	for(int i=0; i<obj3.size();i++) {
		obj3.get(i).click();
		System.out.println(obj3.get(i));
	}
	

			
//		d.get("https://www.google.com/");
//		WebElement srch = d.findElement(By.name("q")); 
//		srch.sendKeys("pawan kalyan photos",Keys.RETURN);//Keys.RETURN/Keys.ENTER  :it press enter
//		d.findElement(By.xpath("//*[contains(text(),'330 Pavan kalyan ideas - Pinterest')]")).click();
		}
		
		catch (Exception e){	
			System.out.println(e);}
	    }
		
	}


