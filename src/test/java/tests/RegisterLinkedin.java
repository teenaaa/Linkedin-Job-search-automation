package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import resource.Base;
import resource.SignupRepo;

public class RegisterLinkedin extends Base {
	// public static Logger log=LogManager.getLogger(Base.class.getName());
	@Test
	public void Sign_Up() throws IOException {

		Linkedin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// LinkedIn SignUp
		SignupRepo signup = new SignupRepo(driver);
		signup.ClickJoinNow().click();
		signup.EnterEmail().sendKeys(props.getProperty("username"));
		signup.EnterPassword().sendKeys(props.getProperty("password"));
		signup.ClickSubmit().click();
		signup.EnterFirstName().sendKeys(props.getProperty("firstName"));
		signup.EnterLastName().sendKeys(props.getProperty("lastName"));
		signup.Clickcontinue().click();
		signup.ClickcheckBox().click();

	}
}