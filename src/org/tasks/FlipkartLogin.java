package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLogin {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement lnklogin = driver.findElement(By.xpath("//a[text()='Login']"));
		lnklogin.click();
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(txtusername).perform();
		String text = txtusername.getText();
		System.out.println("gowtham");

	}

}
