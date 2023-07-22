package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://flipkart.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    btnclose.click();
	    
	    
	    WebElement lnkmore = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(lnkmore).perform();
		
		WebElement btncustomer = driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"));
		btncustomer.click();
		
		WebElement txtlogin = driver.findElement(By.xpath("//span[@class='hDTmm5'][1]"));
		String text = txtlogin.getText();
		System.out.println(text);
		

	}

}
