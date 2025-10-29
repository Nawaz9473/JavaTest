package LaunchBrowsers;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChoiceBrouser {
	
	public static void main(String[] args)
	{
		System.out.println("enter your choice");
		System.out.println("enter  chrome  for chrome");
		System.out.println("enter  edge for edge ");
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();	
		WebDriver driver = null;//declare the webdriver is nus as we do not have to use crome hromeDriver driver = new ChromeDriver(); just have to writedriver = new ChromeDriver(); 
		 
		if (c.equalsIgnoreCase("chrome"))
		 {
			  driver = new ChromeDriver();
		 }
		 else if(c.equalsIgnoreCase("edge"))
		 {
			  driver = new EdgeDriver();e
		 }
		 else {
	            System.out.println("Invalid browser choice.");
	        }
	        
		
		 /*switch (c) {
        case "chrome":
       	  driver = new ChromeDriver();
            break;
        case "edge":
       	 driver = new EdgeDriver();
            break;
        case "firefox":
       	 driver = new FirefoxDriver();
            break;
        default:
            System.out.println("That's a unique choice!");
    }*/
		 
	}

			
}


