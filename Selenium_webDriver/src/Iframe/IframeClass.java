package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeClass {
	public static void main(String[]args){
		WebDriver d= new FirefoxDriver();
		d.navigate().to("https://timesofindia.indiatimes.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frms= d.findElement(By.xpath(".//*[@id='adsdivLyr']"));
		// it is frame xpath
		System.out.println(frms.getSize());// getSize():it prints frame size
	}
}
