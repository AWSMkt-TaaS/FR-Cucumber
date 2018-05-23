package demo.web.test.fr.component;


import demo.web.test.fr.component.*;
import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.opera.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.*;

import com.google.common.base.Strings;

public class AppTestManager {
	String testvar="test";
	private String BROWSER=System.getProperty("browser");
	WebDriver driver = null;
	String strtrace = "";
	String output = "";
	Boolean isError=false;


	private String getBrowser() {
		if (Strings.isNullOrEmpty(BROWSER) ) {
			return "chrome";
		}
		else {
			return BROWSER.toLowerCase();
		}
	}
	public String getTrce() {
		   return strtrace;
	} 
	
	public Boolean getIsError() {
		   return isError;
	}

	public String getOutput() {
		   return output;
	}
	
	public WebDriver getDriver() {
		   return driver;
	}
	
	public AppTestManager()
	{
		
		
	}
	public void initBrowser() {
		System.out.println("selected browser=" + this.getBrowser());
		if (this.getBrowser().equals("chrome")) {
			driver = new ChromeDriver(RemoteWebDriverManager.getChromeOptions());
		}
		else if (this.getBrowser().equals("firefox")) {
			driver = new FirefoxDriver(RemoteWebDriverManager.getFirefoxOptions());
		}
		else {
			//if not specified then use chrome
			driver = new FirefoxDriver(RemoteWebDriverManager.getChromeOptions());
		}
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int Width = (int) toolkit.getScreenSize().getWidth();
		int Height = (int)toolkit.getScreenSize().getHeight();
		driver.manage().window().setSize(new Dimension(Width,Height));
		
	}
	
	public void navigateToTargetPage(String url)
	{
		 System.out.println("navigateToTargetPage-in");
	    //driver.navigate().to(url);
		 Actions x = new Actions(driver);
		 try{
		 x.build().wait(10);
		 }
		 catch(Exception ex){
			 String sss=""; 
		 }
	    driver.get(url);
	   
		
	    String sss="";
	    
	    sss="sd";
	    System.out.println("navigateToTargetPage-out");
	    //this.sleep(1000);
	}
	
	

	public void enterFirstTextBox(int ip1)
	{
	    WebElement ele1 = driver.findElement(By.id("a"));
	    ele1.sendKeys(Integer.toString(ip1));
	}
	public void enterSecondTextBox(int ip2)
	{
	    WebElement ele1 = driver.findElement(By.id("b"));
	    ele1.sendKeys(Integer.toString(ip2));
	}
	public void clickConcatenateButton()
	{
			WebElement ele3 = driver.findElement(By.id("c"));
			
			Actions actions = new Actions(driver);
			actions.click(ele3).perform();
	}
	
	public void validateThirdTextBox(int ip3)
	{
	    try
	    {
	        WebElement ele4 = driver.findElement(By.id("d"));
	        output = ele4.getAttribute("value");
	        if (Strings.isNullOrEmpty(output))
	        {
	            output = "No value found";
	        }
	    }
	    catch (Exception ex)
	    {
	        output = "Unexpected Error: " + ex.getMessage();
	    }

	    strtrace = "Expected output=" + Integer.toString(ip3) + "; Generated output=" + output;
	  
	}

	


	


	//PAGE 333333333333333333333333333333333


	public void enterFirstTextBoxContact(int ip1)
	{
	    WebElement ele1 = driver.findElement(By.id("a1"));
	    ele1.sendKeys(Integer.toString(ip1));
	}
	public void enterSecondTextBoxContact(int ip2)
	{
	    WebElement ele1 = driver.findElement(By.id("b1"));
	    ele1.sendKeys(Integer.toString(ip2));
	}
	public void clickConcatenateButtonContact()
	{
	    WebElement ele3 = driver.findElement(By.id("c1"));
	    Actions actions = new Actions(driver);
 		actions.click(ele3).perform();
	}

	public void validateThirdTextBoxContact(int ip3)
	{
	    try
	    {
	        WebElement ele4 = driver.findElement(By.id("d1"));
	        output = ele4.getAttribute("value");
	        if (Strings.isNullOrEmpty(output))
	        {
	            output = "No value found";
	        }
	    }
	    catch (Exception ex)
	    {
	        output = " Uexpected Error: " + ex.getMessage();
	    }

	    strtrace = "Expected output=" + Integer.toString(ip3) + "; Generated output=" + output;

	}


	public void closeTest()
	{
		System.out.println(this.strtrace);
		System.out.println("Driver destroying");
	   
	    closeDriver();
	    System.out.println("Driver destroyed");
	   
	    strtrace = "";
	    output = "";
	}

	private void closeDriver()
	{
	    try
	    {
	        if (driver != null)
	        {
	            driver.close();
	        }
	        
	        if (driver != null)
	        {
	            driver.quit();
	        }
	    }
	    catch (Exception ee)
	    {
	    	if (driver != null)
	        {
	            driver.quit();
	        }
	    }
	   
	}


	
	private void sleep(int time){
		try {
			Thread.sleep(1000);
		}
		catch(Exception ex){
			//swallow exception
		}
	}

}