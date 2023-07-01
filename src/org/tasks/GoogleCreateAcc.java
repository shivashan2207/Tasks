package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleCreateAcc {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.manage().window().maximize();
		
		WebElement txtfstname = driver.findElement(By.id("firstName"));
		txtfstname.sendKeys("gowtham");
		
		WebElement txtlstname = driver.findElement(By.id("lastName"));
		txtlstname.sendKeys("rithik");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("gowtham");
		
		WebElement txtpass = driver.findElement(By.name("Passwd"));
		txtpass.sendKeys("123456789");
		
		WebElement txtpass1 = driver.findElement(By.name("ConfirmPasswd"));
		txtpass1.sendKeys("123456789");

	}

}
