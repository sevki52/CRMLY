package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.ConfigurationReader;
import net.crmly.utilities.Driver;
import org.junit.Assert;

public class LoginStepDefs {
     LoginPage loginPage = new LoginPage();

    @Given("the user navigates to the login page")
    public void the_user_navigates_to_the_login_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Given("the user enters username as a {string} and {string}")
    public void the_user_enters_username_as_a_and(String userName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitFor(1);
        loginPage.usernameBox.sendKeys("hr1@cybertekschool.com");
        loginPage.passwordBox.sendKeys("UserUser");

    }

    @When("the user clicks log in button")
    public void the_user_clicks_log_in_button() throws InterruptedException {
    loginPage.loginBtn.click();

    }
    @Then("the user should have logged in Portal")
    public void the_user_should_have_logged_in_Portal() throws InterruptedException {
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("(10) Portal",actualTitle);

    }

}


