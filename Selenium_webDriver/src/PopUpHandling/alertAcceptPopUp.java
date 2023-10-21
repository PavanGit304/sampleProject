package PopUpHandling;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertAcceptPopUp {
	/*  Alert Interface to perform various required actions. For example, accepting and dismissing the alert,
	 *  getting the text from the alert window, writing some text on the alert window, and so on.
	 * accept(): This method clicks on the 'OK' button of the alert box.
	 * dismiss(): We use this method when the 'Cancel' button clicks in the alert box.
	 * getText(): This method captures the message from the alert box.
	 * sendKeys(String stringToSend): This method sends data to the alert box.
	 * */
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver109\\chromedriver.exe");
	
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("D:\\downloads\\html\\javascript4(alertDilogbox).html");
		//d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”. The default setting is 0.
		Thread.sleep(2000);
		Alert obj = d.switchTo().alert();
		obj.accept();
	//	d.quit();
	}
}
