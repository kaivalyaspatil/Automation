package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_All_elements {
	
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open in firefox ::
		//System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		// linktext :: 
		String forgot_pwd = driver.findElement(By.linkText("Forgotten account?")).getText();
		System.out.println(forgot_pwd);
		
		// ID :  
		driver.findElement(By.id("u_0_j")).sendKeys("kaivalya");
		
		// Name ::
		driver.findElement(By.name("firstname")).sendKeys("kaivalya");
		
		// Class Name  ::
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("kaivalya");
		
		// By xpath and Search in all html by xpath ::
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kaivalya");
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("kaivalya");
				
		// By css  and Search in all html by css ::
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("kaivalya");
		driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("kaivalya");
		
		//  by css specific to id and class name
		driver.findElement(By.cssSelector("input#u_0_j")).sendKeys("kaivalya");
		driver.findElement(By.cssSelector("input.inputtext _58mg _5dba _2ph-")).sendKeys("kaivalya");

	
		// Tab tile, current url and page source ::
		
		//String TabTitle = driver.getTitle();		
		//System.out.println(TabTitle);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());

		// Page naviagte ::
		
		//driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
	
		// Browser close and quite ::
		
		//driver.close(); - closes current tab
		//driver.quit();
	
		
	}

}
