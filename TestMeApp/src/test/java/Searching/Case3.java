package Searching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestMe.TestMeApp.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case3 
{
	WebDriver driver;
	
	@Given("Must be in home page {string} and {string}")
	public void must_be_in_home_page_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   
	    driver=UtilityClass.getDriver("Chrome");
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    driver.findElement(By.name("userName")).sendKeys(string);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);
	    driver.findElement(By.name("Login")).click();
	    
	}

	@Given("Search the product {string}")
	public void search_the_product(String st) {
	    // Write code here that turns the phrase above into concrete actions
		
		
		driver.findElement(By.id("myInput")).sendKeys(st);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='myInputautocomplete-list']/div/input")));
		//driver.findElement(By.xpath("//*[@id='myInputautocomplete-list']/div/input)")).click();
		Actions act=new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//*[@id='myInputautocomplete-list']/div/input"));
		act.doubleClick(link).build().perform();
}

	@When("Clicks the find detail button")
	public void clicks_the_find_detail_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Cart page appeared")
	public void cart_page_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("You are in Cart");
	}

}
