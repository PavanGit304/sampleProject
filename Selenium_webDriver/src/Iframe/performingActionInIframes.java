package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class performingActionInIframes {
	public static void main(String[]args){
		WebDriver d= new FirefoxDriver();
		d.navigate().to("https://timesofindia.indiatimes.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ifr= d.findElement(By.xpath(".//*[@id='content']/div/div[8]"));
		ifr.click();
		d.switchTo().frame(ifr);
		d.findElement(By.id("name")).sendKeys("8");
}
}
