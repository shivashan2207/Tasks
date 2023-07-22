package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement s = driver.findElement(By.id("credit2"));
		WebElement d = driver.findElement(By.id("java-class"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
		
		WebElement s1 = driver.findElement(By.id("fourth"));
		WebElement d1 = driver.findElement(By.id("java-interface"));
		
		Actions actions1 = new Actions(driver);
		actions1.dragAndDrop(s1, d1).perform();
		
		WebElement s2 = driver.findElement(By.id("fifth"));
		WebElement d2 = driver.findElement(By.id("selenium-class"));
		
		Actions actions2 = new Actions(driver);
		actions2.dragAndDrop(s2, d2).perform();
		
		WebElement s3 = driver.findElement(By.id("credit1"));
		WebElement d3 = driver.findElement(By.id("selenium-interface"));
		
		Actions actions3 = new Actions(driver);
		actions3.dragAndDrop(s3, d3).perform();

	}

}
