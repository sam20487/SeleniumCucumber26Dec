package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends TestBase {

	public HomePage() {
		initialization();

	}

	public void clickOnLoginButton() {
		try {
			Thread.sleep(2000);
			WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-basic\"]//div//button[2]"));
			loginBtn.click();

		} catch (Exception e) {

		}

	}

	public void Login(String userName, String password) {
		try {
			WebElement userNameWebElement = driver.findElement(By.id("Email Addressjoe@example.com"));
			userNameWebElement.sendKeys(userName);
			WebElement passwdWebElement = driver.findElement(By.id("login_pwd"));
			passwdWebElement.sendKeys(password);
			WebElement submitBtnWebElement = driver
					.findElement(By.xpath("//*[@id=\"hs-login-modal\"]//div/div[2]/form/button"));
			submitBtnWebElement.click();
			Thread.sleep(2000);
		} catch (Exception e) {

		}

	}

	public boolean verifyLoginSuccess() {
		boolean isSuccess = false;
		WebElement dashboardWebelement = driver
				.findElement(By.xpath("//div//span[text()='Dashboard']"));
		if (dashboardWebelement.isDisplayed())
			isSuccess = true;

		return isSuccess;
	}

	public void clickOnDashBoard() {
		WebElement dashboardWebelement = driver
				.findElement(By.xpath("//div//span[text()='Dashboard']"));
		dashboardWebelement.click();
	}

	public boolean validateStartCodingBtnPresent() {

		boolean isSuccess = false;
		WebElement startCodingWebelement = driver
				.findElement(By.xpath("//div//span[text()='Start Coding']"));
		if (startCodingWebelement.isDisplayed())
			isSuccess = true;

		return isSuccess;

	}

	public boolean validateMyProjectPresent() {

		boolean isSuccess = false;
		WebElement myProjectWebelement = driver
				.findElement(By.xpath("//div//div/h3[text()='My Projects']"));
		if (myProjectWebelement.isDisplayed())
			isSuccess = true;

		return isSuccess;

	}

	public boolean validateManagePlanPresent() {

		boolean isSuccess = false;
		WebElement managePlanWebelement = driver
				.findElement(By.xpath("//div//div/a[text()='Manage Plan']"));
		if (managePlanWebelement.isDisplayed())
			isSuccess = true;

		return isSuccess;

	}

	public void clickPricing() {
		WebElement pricingWebelement = driver
				.findElement(By.xpath("//div//a[text()='Pricing']"));
		pricingWebelement.click();
	}

	public void clickPlatformTab() {
		try{
			WebElement platformWebelement = driver
				.findElement(By.xpath("//div//nav//button[text()='Platform']"));
			platformWebelement.click();
			Thread.sleep(2000);
		}
		catch(Exception e){

		}
		

	}

	public void clickApiTab() {
		try{
		WebElement apiWebelement = driver
				.findElement(By.xpath("//div//nav//button[text()='API']"));
		apiWebelement.click();
		Thread.sleep(2000);
	}
		catch(Exception e){
			
		}
		
	}

	public String errorMsgLogin(){
		String errorMsg = "";
		WebElement errMsgWebelement = driver
				.findElement(By.xpath("//div/div[2]/form/p[2]"));
		errorMsg = errMsgWebelement.getText();
		return errorMsg;
	}
	public String getMessage(){
		String message = "";
		WebElement messageWebelement = driver
				.findElement(By.xpath("//div/h2"));
		message = messageWebelement.getText();
		return message;
	}

	
}
