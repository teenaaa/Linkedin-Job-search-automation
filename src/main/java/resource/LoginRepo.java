package resource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginRepo {
	public WebDriver driver;

	public LoginRepo(WebDriver driver) {
		this.driver = driver;
	}

	By signin = By.xpath("//a[@class='nav__button-secondary']");
	By username = By.cssSelector("#username");
	By password = By.cssSelector("#password");
	By go = By.xpath("//button[@class='btn__primary--large from__button--floating']");

	//element to opt for sign in
	public WebElement ClickSignin() {
		return driver.findElement(signin);

	}

	//element for user name
	public WebElement EnterUserName() {
		return driver.findElement(username);

	}

	//element for password
	public WebElement EnterPassword() {
		return driver.findElement(password);

	}

	//element to login
	public WebElement Submit() {
		return driver.findElement(go);

	}
}
