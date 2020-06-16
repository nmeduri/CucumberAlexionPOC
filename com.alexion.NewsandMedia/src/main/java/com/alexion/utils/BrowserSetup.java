package com.alexion.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class BrowserSetup {
	public static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alexion.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Browser Launched");
	}

	public static void clickLink() {
		driver.findElement(By.linkText("News & Media")).click();
		System.out.println("Clicked on News & Media link");
	}

	public static void assertText() {
		try {
			boolean displayed = driver.findElement(By.xpath("//input[@id='edit-submit']")).isDisplayed();
			Assert.assertEquals(true, displayed);
		} catch (Exception e) {
			System.out.println(e.getMessage() + "Filter button not displayed");
		}

	}

	public static void selectOptionsFromDropdown() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Choose from list']")).click();
		Actions ac = new Actions(driver);
		Thread.sleep(1000);
		WebElement option = driver.findElement(By.xpath("//*[@id=\"edit_a0130895_field_nir_news_category_value_chosen\"]/div/ul/li[3]"));
		ac.moveToElement(option).click().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='chosen-single']")).click();
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//*[@id=\"edit_a0130895_year_value_chosen\"]/div/ul/li[5]"));
		ac.moveToElement(year).click().build().perform();

	}
	
	public static void clickButton() {
		driver.findElement(By.id("edit-submit")).click();
	}

}
