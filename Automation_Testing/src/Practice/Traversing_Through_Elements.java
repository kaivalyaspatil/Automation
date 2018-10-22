package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing_Through_Elements {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.manage().window().maximize();
	
		// Parent to child traversing :: 
		// xpath of parent then /child tag name.
		
		
	// parent to child	 - first way
	//driver.findElement(By.xpath("//div[@class='interview-question']/div/div/ul/li[2]")).click();
	
	
	// parent to child	 - second way
	//driver.findElement(By.xpath("//div/div/div/ul/li[3]")).click();
	
	// sibling to sibling traverse	
	//driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		
		// need to confirm
	// child to parent travers	
	System.out.print(driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::li")).getAttribute("role"));
		
		// using text available on screen 
	//	driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();	
		
		
		

		
	}


}
