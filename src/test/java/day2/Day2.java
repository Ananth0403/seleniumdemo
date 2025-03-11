package day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		System.out.println(driver.findElement(By.partialLinkText("GUI") ).isDisplayed()) ;
		driver.findElement(By.xpath("//label[text()='Sunday']")).click();
		Thread.sleep(5000);
		WebElement ds = driver.findElement(By.xpath("//label[text()='Sunday']"));
		System.err.println(ds.isSelected());
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
////		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.className("oxd-button")).click();
	}

}
