package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	public WebDriver driver;
	

@Given("user is on Facebook page on chrome browser")
public void user_is_on_Facebook_page_on_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
}

@When("user should enter usernsme and password")
public void user_should_enter_usernsme_and_password() {
	driver.findElement(By.id("email")).sendKeys("bala@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("1234567");
	
}

@When("user click with Login button")
public void user_click_with_Login_button() {
	driver.findElement(By.name("login")).click();
	
}

@Then("user should verify Facebook home pag edisplayed or not")
public void user_should_verify_Facebook_home_pag_edisplayed_or_not() {
	System.out.println("Invalid User");
	
}


	

}
