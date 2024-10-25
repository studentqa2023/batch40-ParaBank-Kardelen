package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.generic.DriverManager;
import com.generic.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	MasterPageFactory mpf;
	
	
	@Given("Open the browser")
	public void open_the_browser() {
	    DriverManager dm= new DriverManager();
	   driver= dm.getChromeDriver(driver);
	}

	@Given("pass the Parabank URL {string}")
	public void pass_the_parabank_url(String URL ) {
	    driver.navigate().to (URL);
	    }

	@When("Enter the username {string}")
	public void enter_the_username(String username) {
		mpf= new MasterPageFactory(driver);
		mpf.getUsername().sendKeys(username);
	    
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
		mpf.getPassword().sendKeys(password);
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
		mpf.getLoginbtn().click();
	
	   
	}

	@Then("Validate login is successful")
	public void validate_login_is_successful() {
		
		Assert.assertTrue(mpf.getLogoutbtn().isDisplayed(), "Login is successful!");

		if (mpf.getLogoutbtn().isDisplayed()) {
			System.out.println("Login successful!");
		}else {
			System.out.println("Login failled!");
		}
	
	}
	
	@Given("Quit all browser")
	public void tearDown() {
		driver.quit();
	}
	
	@Then("Validate error message is displayed")
		public void getError() {
			Assert.assertTrue(mpf.getErrormsg().isDisplayed(), "Login is successful!");
	}
			
			@When("Click on logout button")	
		public void clickLogout() {
				mpf.getLogoutbtn().click();
			}
			
			@Then("Validate logout is successful")
			public void validate_logout_is_succesful() {
				SoftAssert sa = new SoftAssert();
				sa.assertTrue(mpf.getLoginbtn().isDisplayed(), "Logout is succesful!");
			}
			
			

			
			



		
		}
		
	
  


