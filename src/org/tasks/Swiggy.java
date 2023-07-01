package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Swiggy {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.swiggy.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement btnsignup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		btnsignup.click();
		
		WebElement txtph = driver.findElement(By.id("mobile"));
		txtph.sendKeys("8667704263");
		
		WebElement txtname = driver.findElement(By.id("name"));
		txtname.sendKeys("gowtham");
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("gowtham@gmail.com");
	}

}
