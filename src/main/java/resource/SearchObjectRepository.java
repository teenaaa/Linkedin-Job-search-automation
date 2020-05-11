package resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchObjectRepository {

	public WebDriver driver;

	public SearchObjectRepository(WebDriver driver) {
		this.driver = driver;
	}

	By headerTxtSearch = By.cssSelector("[class='search-global-typeahead__input always-show-placeholder']");
	By ddlExpLevel = By.cssSelector("button[aria-controls='experience-level-facet-values']");
	By fltrExpMidSenior = By.xpath("//div[@id='experience-level-facet-values']//span[text()='Mid-Senior level']");
	By btnExpLevel = By
			.xpath("//div[@id='experience-level-facet-values']//button[@data-control-name='filter_pill_apply']");
	By btnAllFltr = By.cssSelector("button[data-control-name='all_filters']");
	By fltrJobTypeFt = By.xpath("//span[text()='Full-time']");
	By btnAplyAll = By.cssSelector("button[data-control-name='all_filters_apply']");
	By clearFilters = By.cssSelector("button[data-control-name='clear_filters']");
	By btnCardPannelcls = By.cssSelector("button[data-control-name='launchpad.close']");
	By lnkUserSettings = By.cssSelector("button[data-control-name='nav.settings']");
	By lnkSignout = By.cssSelector("a[data-control-name='nav.settings_signout']");

	// element for global search
	public WebElement ClickSearch() {
		return driver.findElement(headerTxtSearch);
	}

	// element to open experience level drop-down
	public WebElement OpenExpLevel() {
		return driver.findElement(ddlExpLevel);

	}

	// element to select experience level
	public WebElement SelectExpLevel() {
		return driver.findElement(fltrExpMidSenior);

	}

	// element to apply experience level filter
	public WebElement ApplyExplevel() {
		return driver.findElement(btnExpLevel);

	}

	// element to open advance filter panel
	public WebElement OpenAllFilter() {
		return driver.findElement(btnAllFltr);

	}

	// element to select job type in advance filter panel
	public WebElement SelectJobType() {
		return driver.findElement(fltrJobTypeFt);

	}

	// element to apply all selected filter
	public WebElement ApplyAllFilter() {
		return driver.findElement(btnAplyAll);
	}

	// element to get currently applied filters
	public WebElement CheckClearText() {
		return driver.findElement(clearFilters);

	}

	// element to get Launch Pad Close button
	public WebElement ClickLaunchPadcls() {
		return driver.findElement(btnCardPannelcls);

	}

	// element to Open User Settings
	public WebElement OpenUserSettings() {
		return driver.findElement(lnkUserSettings);

	}

	// element to Click Sign-out
	public WebElement ClickSignout() {
		return driver.findElement(lnkSignout);

	}

}
