package resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupRepo {
public WebDriver driver;
	
	public SignupRepo(WebDriver driver) {
		this.driver=driver;
	}
	
		
		By sign_up =By.xpath("//a[@class='nav__button-tertiary']");
		By username=By.cssSelector("#email-or-phone");
	    By password=By.cssSelector("#password");
	    By go=By.cssSelector("#join-form-submit");
	    By firstName=By.cssSelector("#first-name");
	    By lastName=By.cssSelector("#last-name");
	    By submit=By.cssSelector("#join-form-submit");
	    By checkBox=By.cssSelector("div.recaptcha-checkbox-border");
	  
	  
	    
	    public WebElement ClickJoinNow() {
			return driver.findElement(sign_up);
			
		}
	    
	    public WebElement EnterEmail() {
			return driver.findElement(username);
			
		}
	    
	    public WebElement EnterPassword() {
			return driver.findElement(password);
			
		}
	    
	    public WebElement ClickSubmit() {
			return driver.findElement(go);
			
		}
	    
	    public WebElement EnterFirstName() {
			return driver.findElement(firstName);
			
		}
	    
	    public WebElement EnterLastName() {
			return driver.findElement(lastName);
			
		}
	    
	    public WebElement Clickcontinue() {
			return driver.findElement(submit);
			
		}
	    
	    public WebElement ClickcheckBox() {
			return driver.findElement(firstName);
			
		}

}
