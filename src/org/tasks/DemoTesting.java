package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemoTesting {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Register.html");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement txtname = driver.findElement(By.xpath("//input[@type='text']"));
		txtname.sendKeys("gowtham");
		
		WebElement txtlast = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlast.sendKeys("mura");
		
		WebElement txtAddr = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddr.sendKeys("omr st");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("mura@132");
		WebElement txtph = driver.findElement(By.xpath("//input[@type='tel']"));
		txtph.sendKeys("8667704263");
		WebElement btnmale = driver.findElement(By.xpath("//input[@value='Male']"));
		btnmale.click();
		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.id("checkbox2"));
		checkbox2.click();
		
		//WebElement checkbox3 = driver.findElement(By.id("checkbox3"));
		//checkbox3.click();
	
		// txtlanguage = driver.findElement(By.id("msdd"));
		//txtlanguage.click();
		//Actions actions = new Actions(driver);
		//actions.moveToElement(txtlanguage).perform();
		//WebElement lnkenglish = driver.findElement(By.xpath("//a[text()='English']"));
		//lnkenglish.click();
		WebElement ddnskill = driver.findElement(By.id("Skills"));
		Select s=new Select(ddnskill);
		s.selectByValue("Android");
		//actions.moveToElement(btnskill).perform();
		//WebElement txtSoftware = driver.findElement(By.xpath("//option[text()='Android']"));
		//txtSoftware.click();
		
		//WebElement clkyear = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		//clkyear.click();
		WebElement clickcountry = driver.findElement(By.xpath("//span[@role='combobox']"));
		clickcountry.click();
		WebElement txtsearch = driver.findElement(By.xpath("//input[@type='search']"));
		txtsearch.sendKeys("india",Keys.ENTER);
		
		
		WebElement txtpass = driver.findElement(By.id("firstpassword"));
		txtpass.sendKeys("123456");
		
		WebElement txtpass1 = driver.findElement(By.id("secondpassword"));
		txtpass1.sendKeys("123456");
		

	}

}
