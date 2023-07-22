package org.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement ddncountry = driver.findElement(By.name("country"));
		Select s = new Select(ddncountry);
		s.selectByValue("ALBANIA");
		
		List<WebElement> options1 = s.getOptions();
		WebElement webElement = options1.get(7);
		String text = webElement.getText();
		System.out.println(text);
		
		for (int i = 0; i < options1.size(); i++) {
			WebElement webElement2 = options1.get(i);
			String attribute = webElement2.getAttribute("value");
			System.out.println(attribute);

	}

	}}
