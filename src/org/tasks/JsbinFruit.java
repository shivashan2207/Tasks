package org.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class JsbinFruit {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);
		List<WebElement> options1 = s.getOptions();
		WebElement webElement = options1.get(1);
		String text = webElement.getText();
		System.out.println(text);
		System.out.println("============");
		for (int i = 0; i < options1.size(); i++) {
			if (i==1) {
				continue;
				
			}
			WebElement webElement2 = options1.get(i);
			String text2 = webElement2.getText();
			System.out.println(text2);

	}

	}}
