package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("user clicked on Sign In option");
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email,String password) {
		sendText(factory.signInPage().emailField,email);
		sendText(factory.signInPage().passwordField,password);
		logger.info("user entered email "+ email + " and password "+ password);
	//	slowDown();
		
	}
	
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("user logged in into account");
		slowDown();
		
	}
	
	

}
