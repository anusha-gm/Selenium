package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\kisho\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.facebook.com/login");
		driver.manage().window().maximize();
		driver.findElement (By.linkText("Create new account")).click();
		driver.findElement (By.name("firstname")).sendKeys ("anusha");
		driver.findElement (By.name("lastname")).sendKeys ("gm");
		driver.findElement (By.name("reg_email__")).sendKeys ("abcd@gmail.com");
		driver.findElement (By.name("reg_email_confirmation__")).sendKeys ("abcd@gmail.com");
		driver.findElement (By.name("reg_passwd__")).sendKeys ("a12345");
		Select selMonth = new Select(driver.findElement(By.id("month")));
		selMonth.selectByVisibleText("Aug");
		Select selDay = new Select(driver.findElement(By.id("day")));
		selDay.selectByVisibleText("7");
		Select selYear = new Select(driver.findElement(By.id("year")));
		selYear.selectByVisibleText("1991");
		driver.findElement (By.xpath("//label[@class='_58mt']")).click();
		driver.findElement (By.name("websubmit")).click();
		String auto_title = driver.getTitle ();
		String actual_title = "Sign Up for Facebook | Facebook";
		driver.close ();
		if(auto_title.equalsIgnoreCase(actual_title))
		{
			System.out.println ("Test Successful");
		}
		else
		{
			System.out.println ("Test Failure");
		}
		
	}

}
