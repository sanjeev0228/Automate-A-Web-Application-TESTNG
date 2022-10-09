package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class LoginAutomation {
	@Test(priority = 1)
	  public void register() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32/chromedriver.exe");
	      WebDriver wd = new ChromeDriver();
		 
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("Sanjeev Sagar");
	      wd.findElement(By.id("ap_phone_number")).sendKeys("9999326049");
	      wd.findElement(By.id("ap_email")).sendKeys("sanjeevsagar013@gmail.com");
	      wd.findElement(By.id("ap_password")).sendKeys("987654321");
	      wd.findElement(By.id("ap_password_check")).sendKeys("987654321");
	   

	     
	  }
	@Test(priority = 2)
	  public void login() {
		  
	      WebDriver wd=new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("ap_email")).sendKeys("sanjeevsagar013@gmail.com");
		  wd.findElement(By.id("continue")).click();
	      wd.findElement(By.id("ap_password")).sendKeys("987654321");


	  }
	  @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		  	WebDriver wd=new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("Macbook Air");
		    Thread.sleep(5000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		    wd.findElement(By.linkText("Macbook Air (Space Grey, 8GB RAM, 256 SSD)")).click();
	        wd.findElement(By.id("add-to-cart-button")).click();
	  }

}

 
	
	
