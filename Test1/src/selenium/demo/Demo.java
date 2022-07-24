package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\kisho\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement (By.id("identifierId")).sendKeys ("anusha78@gmail.com");
		driver.findElement (By.id("identifierNext")).click();
		String auto_title = driver.getTitle ();
		String actual_title = "gmail";
		driver.close ();
		if(auto_title.equalsIgnoreCase (actual_title))
		{
			System.out.println ("Test Successful");
		}
		else
		{
			System.out.println ("Test Failure");
		}
		
	}

}
