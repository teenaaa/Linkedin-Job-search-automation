package resource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	public static WebDriver driver;
	public Properties props;

	//Method to evoke the web driver
	public WebDriver Linkedin() throws IOException {
		props = new Properties();
		// to read the .properties file
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resource\\data.properties");
		props.load(file);
		// To invoke the browser
		String browserName = props.getProperty("browser");
		if (browserName.contains("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resource\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(props.getProperty("LaunchUrl"));

		} else if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resource\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless")) {
				options.addArguments("--headless");
			}
			driver = new ChromeDriver(options);
			driver.get(props.getProperty("LaunchUrl"));
		}
		return driver;
	}
}
