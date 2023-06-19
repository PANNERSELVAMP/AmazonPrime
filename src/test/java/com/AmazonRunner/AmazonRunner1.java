package com.AmazonRunner;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Workspace\\AmazonPrime\\src\\test\\java\\com\\FeatureFile\\AmazonPrimeTestCase.feature", glue = "com.StepDefnination", monochrome = true, plugin = "com.cucumber.listener.ExtentCucumberFormatter:ReportFolder/extentReport.html")

public class AmazonRunner1 {

	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Workspace\\AmazonPrime\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
