package com.StepDefnination;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.AmazonRunner.AmazonRunner1;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon_Step {

	public static WebDriver driver = AmazonRunner1.driver;

	Actions ac = new Actions(driver);

	@Given("^user launch the application by using URL$")
	public void user_launch_the_application_by_using_URL() throws Throwable {
		driver.get("https://www.primevideo.com/");
		driver.manage().window().maximize();

	}

	@When("^user move the element in Account icon$")
	public void user_move_the_element_in_Account_icon() throws Throwable {

		WebElement Accicon = driver.findElement(By.id("accounts"));
		ac.moveToElement(Accicon).perform();

	}

	@When("^user move the element in singin element$")
	public void user_move_the_element_in_singin_element() throws Throwable {

		WebElement signin = driver.findElement(By.linkText("Sign In"));
		ac.moveToElement(signin).perform();
	}

	@Then("^usr click the singin Button and its navigate to the Amazon Sign-in page$")
	public void usr_click_the_singin_Button_and_its_navigate_to_the_Amazon_Sign_in_page() throws Throwable {

		WebElement signin = driver.findElement(By.linkText("Sign In"));
		signin.click();

	}

	@When("^user Enter the user in Username Field$")
	public void user_Enter_the_user_in_Username_Field() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("panner1204@gmail.com");
	}

	@When("^user Enter the Passowrd in password Field$")
	public void user_Enter_the_Passowrd_in_password_Field() throws Throwable {

		driver.findElement(By.name("password")).sendKeys("Panner@123");
	}

	@Then("^Click the SignIn Button and its Naviagate to the Home Page$")
	public void click_the_SignIn_Button_and_its_Naviagate_to_the_Home_Page() throws Throwable {

		driver.findElement(By.id("signInSubmit")).click();

		driver.findElement(By.name("password")).sendKeys("Panner@123");

		Scanner s = new Scanner(System.in);

		WebElement captcha = driver.findElement(By.id("auth-captcha-guess"));
		System.out.println("Enter The Captcha Character");
		captcha.sendKeys(s.next());

		driver.findElement(By.id("signInSubmit")).click();

	}

	@When("^The User Can be Click the Search Icon Button$")
	public void the_User_Can_be_Click_the_Search_Icon_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@role=\"button\"]")).click();
	}

	@When("^Then user enter the movie name in the search box text field$")
	public void then_user_enter_the_movie_name_in_the_search_box_text_field() throws Throwable {
		WebElement moviename = driver.findElement(By.xpath("//input[@name=\"phrase\"]"));
		moviename.sendKeys("pathan");
	}

	@Then("^User Select The Movie then It will be naviagte To The Movie page$")
	public void user_Select_The_Movie_then_It_will_be_naviagte_To_The_Movie_page() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//a[text()=\"Pathaan\"]")).click();

	}

	@When("^user click Deatails button then the Details page Will Be Show$")
	public void user_click_Deatails_button_then_the_Details_page_Will_Be_Show() throws Throwable {
		driver.findElement(By.xpath("(//span[text()=\"Details\"])[1]")).click();
	}

	@When("^For The Checking Purpose We Can get The Movie Starring cast name$")
	public void for_The_Checking_Purpose_We_Can_get_The_Movie_Starring_cast_name() throws Throwable {

		List<WebElement> names = driver.findElements(By.xpath("//a[@class=\"_1NNx6V\"]"));

		for (WebElement e : names) {
			System.out.println(e.getText());

		}

	}

	@Then("^Then Click The Play Button the Video Will played$")
	public void then_Click_The_Play_Button_the_Video_Will_played() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement trailer = driver.findElement(By.xpath("//a[@aria-label=\"Watch Trailer\"]"));

		js.executeScript("window.scrollBy(0,-3000);", trailer);

		Thread.sleep(10000);
		trailer.click();

	}

}
