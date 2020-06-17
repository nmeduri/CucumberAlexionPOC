package com.alexion.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
		WebElement option = driver
				.findElement(By.xpath("//*[@id=\"edit_a0130895_field_nir_news_category_value_chosen\"]/div/ul/li[3]"));
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

	public static void clickContactUsLink() {
		driver.findElement(By.linkText("Contact Us")).click();
		System.out.println("Clicked on ContactUs link");
	}

	public static void clickMedicalInfoLink() {
		driver.findElement(By.linkText("Medical Information")).click();
	}

	public static void enterTextBox(String xpath, String testdata) {
		driver.findElement(By.xpath(xpath)).sendKeys(testdata);
	}

	public static void assertLink(String link) {
		boolean displayed = driver.findElement(By.linkText(link)).isDisplayed();
		Assert.assertEquals(true, displayed);

	}

	public static void selectDropdown() {
		Select sel = new Select(driver.findElement(
				By.xpath("//select[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_11__Value']")));
		sel.selectByVisibleText("India");
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void clickOurResearchLink() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='ourresearch']")).click();
		System.out.println("Clicked on OurResearchLink");
		Actions ac = new Actions(driver);
		Thread.sleep(1000);
		WebElement option = driver.findElement(By.xpath("//a[text()='Research and Development']"));
		ac.moveToElement(option).click().build().perform();
	}

	public static void ourInspirationLink() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='ourinspiration']")).click();
		System.out.println("Clicked on OurInspirationLink....");
		Actions ac = new Actions(driver);
		Thread.sleep(1000);
		WebElement option = driver.findElement(By.xpath("//a[text()='aHUS']"));
		ac.moveToElement(option).click().build().perform();
	}

}
