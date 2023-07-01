package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/\r\n");
				
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		WebElement txtlogin = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtlogin.sendKeys("8667704263");

		WebElement btncontinue = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		btncontinue.click();

	}

}
