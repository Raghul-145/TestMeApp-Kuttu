package TestMe.TestMeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case2 
{
WebDriver driver;

/*@Given("User is in login page")
public void user_is_in_login_page() {
    // Write code here that turns the phrase above into concrete actions
	driver=UtilityClass.getDriver("Chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
}

@Given("Enter the {string}")
public void enters_the(String string) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("userName")).sendKeys(string);
	
}

@When("Enters the {string}")
public void enter_the(String s) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s);
}

@Then("Click the signin button")
public void click_the_signin_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("Login")).click();
}*/
@Given("User is in login page")
public void user_is_in_login_page() {
    // Write code here that turns the phrase above into concrete actions
	driver=UtilityClass.getDriver("Chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
}

@Given("Enter the {string}")
public void enter_the(String string) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("userName")).sendKeys(string);
}
@When("Enters the {string}")
public void enters_the(String stringg) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(stringg);
}

@Then("Click the signin button")
public void click_the_signin_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("Login")).click();
}
}
