package stepdefs;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;

public class CRMStepDef extends TestBase {
	LoginPage lp;
	
	@Before
	public void setup() {
		initialize();
		lp=new LoginPage();
	}
	
	@Given("User is already on login page")
	public void user_is_already_on_login_page() {
		String pageTitle=driver.getTitle();
		Assert.assertEquals("Cogmento CRM",pageTitle);
	}
	
	//using data table as maps with table header
		@When("User enters credentials")
		public void user_enters_credentials(DataTable userCred) {
			List<Map<String,String>> data=userCred.asMaps();
			String strUser=data.get(0).get("username");
			String strPwd=data.get(0).get("password");
			lp.login(strUser,strPwd);
		}
	
	@Then("User is on  Home Page")
	public void user_is_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("close the browser")
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
	}

}
