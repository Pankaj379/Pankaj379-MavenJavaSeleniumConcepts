package day28;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) {
		// Handling alert messages without using switch to.

		WebDriver driver = new ChromeDriver();
		// Explicit wait declaration part.
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();


		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		Alert myalert = myWait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText()); // I am a JS Alert
		myalert.accept();

	}

}
