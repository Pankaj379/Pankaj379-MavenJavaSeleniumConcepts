package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo {

	public static void main(String[] args) {
		// Basic Locators Demo.

		// To Automate with chrome browser.
		WebDriver driver = new ChromeDriver();

		// To open the URL.
		driver.get("https://demo.automationtesting.in/Register.html");

		// To maximize the window.
		driver.manage().window().maximize();

		// 1) by Name.
		driver.findElement(By.name("radiooptions")).click();


		// 2) By Id.
		boolean idLoc = driver.findElement(By.id("header")).isDisplayed();
		System.out.println(	"Header is visible or not : " + idLoc);

		// 3) Linktext and partial link text.
	//	driver.findElement(By.linkText("WebTable")).click(); // Recommended.
		driver.findElement(By.partialLinkText("WebTab")).click(); // Not-Recommended.
		
		// 4) by Class Name.
		List<WebElement> headerLinks = driver.findElements(By.className("dropdown"));
		System.out.println("Total number of elements present in header is: "+headerLinks.size());
		
		
		// 5) by Tagname.
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number if links present in this webpage is : "+ links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Images Present in the WebPages is :"+ images.size());

		driver.quit();


	}

}
