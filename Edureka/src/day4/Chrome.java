package day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

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
		
		driver.get("http://facebook.com");
		
	}
	public void closeBrowser() {
		// closes all the opened window
		driver.quit();
		
		//Closes current active window
		
		driver.close();
	}
	
	public String getTitle() {
		return driver.getTitle()
	}
	
	
	public void navigateCommands() {
		
		driver.navigate().to("http://qatechhub.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
	}
	}

}
