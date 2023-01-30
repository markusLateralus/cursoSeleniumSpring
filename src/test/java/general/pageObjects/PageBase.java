package general.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PageBase {

	protected WebDriver webdriver;
	
	@Autowired
	public PageBase(WebDriver webdriver) {
		this.webdriver=webdriver;
		PageFactory.initElements(webdriver, this);
	}
}
