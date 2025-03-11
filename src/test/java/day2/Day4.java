package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_5.html']"))).findElement(By.linkText("https://a9t9.com")).click();
		System.out.println(driver.getTitle()); 
		System.out.println(driver.switchTo().defaultContent().getTitle());
		//adding new line
		
	}

}
