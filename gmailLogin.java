package testing;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.FirefoxDriver;

public class gmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		
		System.setProperty("webdriver.firefox.marionette","");
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//launching gmail url
		WebDriver driver= new FirefoxDriver();
 String url="https://www.gmail.com";
		driver.get(url);
		//SIGN IN with mail and password
	WebElement email= driver.findElement(By.id("identifierId"));
	email.sendKeys("vandana.chauhan@abspl.in");
	driver.findElement(By.id("identifierNext")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
	WebElement password=driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
	password.sendKeys("Abspl#2017");
	driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	
	//click on compose button
	driver.findElement(By.xpath(".//*[@id=':h4']/div/div")).click();

    //Enter email in mail box
	//driver.findElement(By.id(":m4")).clear();
	//WebElement to= (WebElement) driver.findElements(By.className("vO"));
	//to.sendKeys("ranavandana94@yahoo.in");
	 driver.findElement(By.xpath("//form[1]//textarea[1]")).sendKeys("pranavkaushik4449@gmail.com");
	//System.out.println(to);
	 WebElement sub=(WebElement) driver.findElement(By.xpath("//div[@class='aoD az6']//input[@class='aoT']"));
			 sub.sendKeys("Please find attachment");
	driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("This is the test email send to test the selenium script.");
  driver.findElement(By.xpath(".//div[text()='Send']")).click();
	driver.close();
	}
}
		



