package testing;


import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.apache.commons.io.FileUtils;
import org.monte.screenrecorder.ScreenRecorder;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

//import com.sun.jna.platform.FileUtils;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;
//import com.sun.jna.platform.FileUtils;

public class gmailsignup {

	

public static void main(String[] args) throws IOException, AWTException {
//setup graphic configuration for video recording
		 GraphicsConfiguration gconfig = GraphicsEnvironment
		         .getLocalGraphicsEnvironment()
		         .getDefaultScreenDevice()
		         .getDefaultConfiguration();
		      
	    ScreenRecorder screenRecorder = new ScreenRecorder(gconfig);
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    screenRecorder.start();
 //String driverPath = "C:\\geckodriver.exe";
		 String baseUrl="https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default";
		 driver.get(baseUrl);
		// driver.findElement(By.id("ow191")).click();;
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//getting screenshot 
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("/Users/shiv/Desktop/random/abc1.jpg"));
	      
//adding first and last name and email	
		driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Vikraqm");
		driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("Rana");
		WebElement mail=driver.findElement(By.xpath(".//*[@id='GmailAddress']"));
		mail.sendKeys("vikraqmr");;
	    driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Rana@123");
		driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys("Rana@123");
		 driver.manage().window().maximize();

	        // This  will scroll down the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,1000)");
//select birthmonth and birth day		
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).sendKeys("March");
	    driver.findElement(By.id("BirthDay")).sendKeys("16");
        driver.findElement(By.id("BirthYear")).sendKeys("1978");
//select gender         
	    driver.findElement(By.xpath(".//*[@id='Gender']/div")).sendKeys("Male");
	    driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).sendKeys("9910446392");
	    driver.findElement(By.xpath(".//*[@id='RecoveryEmailAddress']")).sendKeys("cvandana094@gmail.com");
	    driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
	//  WebElement Element=  driver.findElement(By.xpath(".//*[@id='header-text-div']"));
	  //  js.executeScript("arguments[0].scrollIntoView();",Element );	
	    driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
	    //driver.switchTo().frame("Privacy and Terms");
	  driver.findElement(By.className("tos-scroll-button-icon")).click();
	  driver.getWindowHandle();
	 //   window.scrollBy(0, 50);
	
	//  js.executeScript("window.scrollBy(0,1000)");
	    ((JavascriptExecutor)driver).executeScript("scroll(300,400)");
	    driver.findElement(By.xpath(".//*[@id='iagreebutton']")).click();
	    driver.findElement(By.id("next-button")).click();
	    driver.findElement(By.id("verify-phone-input")).sendKeys("358737");
	    //driver.findElement(By.className("g-button g-button-submit")).click();
	  
	   
	      screenRecorder.stop();
	      // driver.close();
	      
		
		
	}
}
	
