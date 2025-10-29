package LaunchBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args)
	{
	   //ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver = new EdgeDriver();
		
		package Locators;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class AutomateFacebookSignup {
		    public static void main(String[] args) throws InterruptedException {
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.facebook.com");

		        WebElement createaccount = driver.findElement(By.linkText("Create new account"));
		        createaccount.click();

		        WebElement firstname = driver.findElement(By.name("firstname"));
		        firstname.sendKeys("Nawaz");
		        Thread.sleep(3000);

		        WebElement lastname = driver.findElement(By.name("lastname"));
		        lastname.sendKeys("jamil");
		        Thread.sleep(3000);

		        WebElement birthday_day = driver.findElement(By.name("birthday_day"));
		        birthday_day.sendKeys("10");
		        Thread.sleep(3000);

		        WebElement birthday_month = driver.findElement(By.name("birthday_month"));
		        birthday_month.sendKeys("Jul");
		        Thread.sleep(3000);

		        WebElement birthday_year = driver.findElement(By.name("birthday_year"));
		        birthday_year.sendKeys("1999");
		        Thread.sleep(3000);

		        WebElement reg_email__ = driver.findElement(By.name("reg_email__"));
		        reg_email__.sendKeys("jamilnawaz086@gmail.coom");
		        Thread.sleep(3000);

		        WebElement password_step_input = driver.findElement(By.id("password_step_input"));
		        password_step_input.sendKeys("N@@z1234");
		        Thread.sleep(3000);

		        WebElement summit = driver.findElement(By.name("websubmit"));
		        summit.click();




		    }
		}

		
	}
}
	
 