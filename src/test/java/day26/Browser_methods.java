package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);
		// driver.close(); // close one window which is focused.
		driver.quit(); // close all multiple windows with single command.

	}

}
