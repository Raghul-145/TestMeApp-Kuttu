package Cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestMe.TestMeApp.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Case4 
{
	WebDriver driver;
	
	@Given("Alex has Login into TestMeApp")
	public void alex_has_Login_into_TestMeApp() 
	{
		driver=UtilityClass.getDriver("Chrome");
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click();
	    
	}

	@When("Alex search product like {string}")
	public void alex_search_product_like(String string) 
	{
		driver.findElement(By.id("myInput")).sendKeys(string);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@When("Try to proceed to payment without adding any item in the Cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_Cart() 
	{
		System.out.println("Trying to do payment");
	    
	}

	@Then("Doesn't display Cart Icon")
	public void doesn_t_display_Cart_Icon() 
	{
		Assert.assertNull(driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")));
		 
		driver.close();

	}
	
	/* PAYMENT*/

	@Given("Alex has Login into the TestMeApp")
	public void alex_has_Login_into_the_TestMeApp() 
	{
		driver=UtilityClass.getDriver("Chrome");
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click();
	}

	@Given("Alex Search a product {string}")
	public void alex_Search_a_product(String string) 
	{
		driver.findElement(By.id("myInput")).sendKeys(string);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	/*@When("He Clicks Find Details Button")
	public void he_Clicks_Find_Details_Button() 
	{
	    
	    
	}*/

	@When("Add the Product to cart")
	public void add_the_Product_to_cart() 
	{
	    
		driver.findElement(By.xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("Click the Cart Icon")
	public void click_the_Cart_Icon() 
	{
	   
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).click();
	}

	@Then("type the Quantity and click Checkout")
	public void type_the_Quantity_and_click_Checkout() 
	{
	    
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
		
	}

	@Then("The User Redirected to Payments Page and Proceed to pay")
	public void the_User_Redirected_to_Payments_Page_and_Proceed_to_pay() 
	{
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	    
	}

	@When("The payment page is opened")
	public void the_payment_page_is_opened() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));

		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();

		driver.findElement(By.id("btn")).click();
		Assert.assertEquals(driver.getTitle(), "Payment Gateway");
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		WebDriverWait waitt = new WebDriverWait(driver, 10);

		waitt.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h4")));
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		Assert.assertEquals(driver.getTitle(), "Order Details");  
	}

	@Then("Order details is displayed")
	public void order_details_is_displayed() 
	{
	    
		Assert.assertEquals(driver.getTitle(), "Order Details");
		driver.close();
	}

}
