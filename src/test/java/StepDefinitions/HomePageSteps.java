package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import pages.HomePage;
import pages.TestBase;

public class HomePageSteps {

	HomePage homePage = new HomePage();

	@Given("Jdoddle page is open and click on Login")
	public void jdoddle_page_is_open_and_click_on_Login() {
		homePage.clickOnLoginButton();
	}

	@When("username as {string} and password as {string} and click on submit")
	public void username_as_and_password_as_and_click_on_submit(String string, String string2) {

		homePage.Login(string, string2);
	}

	@Then("verify login should be successful")
	public void verify_login_should_be_successful() {
		boolean isLoginSuccess = false;

		isLoginSuccess = homePage.verifyLoginSuccess();
		assertEquals(isLoginSuccess, true);
		
	}

	@Then("validate dashboard elements")
	public void validate_dashboard_elements() {
		homePage.clickOnDashBoard();
		boolean isSuccess = homePage.validateStartCodingBtnPresent();
		assertEquals(isSuccess, true);
		isSuccess = homePage.validateManagePlanPresent();
		assertEquals(isSuccess, true);
		isSuccess = homePage.validateMyProjectPresent();
		assertEquals(isSuccess, true);
		
	}

	@Given("click on pricing tab")
public void click_on_pricing_tab() {
    homePage.clickPricing();
}

@Then("verify login error message")
public void verify_login_error_message() {
   
	String msg=homePage.errorMsgLogin();
	assertTrue(msg.contains("Sorry, "));
	
}

@When("click on platform under pricing section")
public void click_on_platform_under_pricing_section() {
    homePage.clickPlatformTab();
}

@Then("verify Pricing designed for scale")
public void verify_Pricing_designed_for_scale() {
	String msg = homePage.getMessage();
	assertEquals(msg,"Pricing designed for scale");
	
}

@When("click on  API tab under pricing section")
public void click_on_API_tab_under_pricing_section() {
    homePage.clickApiTab();
	
}

@Then("verify Pricing plans for all use cases")
public void verify_Pricing_plans_for_all_use_cases() {
    String msg = homePage.getMessage();
	assertEquals(msg,"Pricing plans for all use cases");
	
}





}
