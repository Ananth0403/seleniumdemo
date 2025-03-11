package day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> wids = new HashSet<String>(driver.getWindowHandles());
		List<String> li = new ArrayList<>(wids);
		driver.switchTo().window(li.get(1));
		Thread.sleep(5000);
		driver.switchTo().window(li.get(0));
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@title= 'Apply Leave' and @type = 'button']")).click();
		
	}

}
