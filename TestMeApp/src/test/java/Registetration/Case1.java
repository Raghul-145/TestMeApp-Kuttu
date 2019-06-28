package Registetration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import TestMe.TestMeApp.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case1 
{
WebDriver driver;

@Given("User is in the  home page")
public void user_is_in_the_home_page() {
 
    driver=UtilityClass.getDriver("Chrome");
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}

@Given("Click the signup button")
public void click_the_signup_button() {
    
	 driver.findElement(By.linkText("SignUp")).click();
}

@When("Enter the details")
public void enter_the_details() {
    
	driver.findElement(By.id("userName")).sendKeys("kuttu");
	driver.findElement(By.name("firstName")).sendKeys("rahul");
	driver.findElement(By.name("lastName")).sendKeys("kuttu");
    driver.findElement(By.id("password")).sendKeys("password1234");
    driver.findElement(By.id("pass_confirmation")).sendKeys("password1234");
    driver.findElement(By.xpath("//*[@id='gender']")).click();
    driver.findElement(By.id("emailAddress")).sendKeys("rahul45@gmail.com");
    driver.findElement(By.id("mobileNumber")).sendKeys("8072065485");
    
    driver.findElement(By.name("dob")).sendKeys("07/21/1998");
    driver.findElement(By.id("address")).sendKeys("kerala");
    Select question = new Select(driver.findElement(By.id("securityQuestion")));
    question.selectByValue("411011");
    driver.findElement(By.id("answer")).sendKeys("blue");
	
	
	
	
	
}

@When("Clicks register button")
public void clicks_register_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("Submit")).click();
}

@Then("Intent to next page")
public void intent_to_next_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Successfull");
}
}
