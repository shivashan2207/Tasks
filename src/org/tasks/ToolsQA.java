package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToolsQA {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		WebElement txtuser = driver.findElement(By.id("username"));
		j.executeScript("arguments[0].setAttribute('value','gowtham')",txtuser );
		
		String value = (String) j.executeScript("return arguments[0].getAttribute('value')", txtuser);
		System.out.println(value);
		
		WebElement txtpass = driver.findElement(By.id("password"));
		j.executeScript("arguments[0].setAttribute('value','123456')",txtpass );
		String value1 = (String) j.executeScript("return arguments[0].getAttribute('value')", txtpass);
		System.out.println(value1);
	
		
		WebElement clklogin = driver.findElement(By.id("login"));
		j.executeScript("arguments[0].click()", clklogin);
		
		
		//WebElement btnclose = driver.findElement(By.xpath("(//button[@class='modal__close'])[2]"));
		//j.executeScript("arguments[0].click()",btnclose);
		

	}

}
