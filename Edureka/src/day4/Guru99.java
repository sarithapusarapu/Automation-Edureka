package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver;	
		
		public void invokeBrowser(){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pusar\\Desktop\\Automation\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			Dimension dim= new Dimension (512,1024);
			
			driver.manage().window().setSize(dim);
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.get("http://demo.guru99.com/v4/");
			
				}

		public void login(String userID, String password) {
			WebElement userIDbox= driver.findElement(By.name("uid"));
			userIdb
			
		}
}
