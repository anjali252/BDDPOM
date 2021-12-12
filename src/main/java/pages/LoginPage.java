package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement pwd;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement loginBtn;
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void login(String strName,String strPwd) {
	uname.sendKeys(strName);
	pwd.sendKeys(strPwd);
	loginBtn.click();
	}
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	

}
