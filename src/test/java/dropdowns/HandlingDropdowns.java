package dropdowns;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandlingDropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		Select cntry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		List<WebElement> li = cntry.getOptions();
		
		for(WebElement el: li) {
			if(el.getText().equals("India")) 
				el.click();
		}
		

	}

}
