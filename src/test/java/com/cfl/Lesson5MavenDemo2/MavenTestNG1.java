package com.cfl.Lesson5MavenDemo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTestNG1 {
	@Test
	public void browserOpen() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getenv("DRIVER_HOME")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
		Thread.sleep(3000);
		driver.quit();
	}

}
