package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\kisho\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.ebay.ca/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[@_sp='p2481888.m1382.l3250']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
	}

}
