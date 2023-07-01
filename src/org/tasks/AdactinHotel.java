package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdactinHotel {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://adactinhotelapp.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("gowtham");
		
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("12301");

	}

}
