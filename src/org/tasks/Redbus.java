package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement icon = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		icon.click();
		
		WebElement clksighin = driver.findElement(By.xpath("//li[@id='signInLink']"));
		clksighin.click();
	
		// using swith to frame by webElement
		
		WebElement framechck = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(framechck);
		
		WebElement txtph = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		txtph.sendKeys("8667704263");

	}

}
