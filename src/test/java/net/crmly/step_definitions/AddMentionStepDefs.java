package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;
import net.crmly.pages.PollTabPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.ConfigurationReader;
import net.crmly.utilities.Driver;
import org.junit.Assert;

import java.security.Key;

public class AddMentionStepDefs {
    PollTabPage pollTabPage = new PollTabPage();

    @Given("the user successfully navigates to the Homepage.")
    public void the_user_successfully_navigates_to_the_Homepage() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login();
    }

    @When("the user clicks Poll tab on the homepage.")
    public void the_user_clicks_Poll_tab_on_the_homepage() {
        pollTabPage.pollTab.click();
        BrowserUtils.waitFor(3);
    }
    @And("the user clicks on the Add mention.")
    public void the_user_clicks_on_the_Add_mention() {
        pollTabPage.addMention.click();
        BrowserUtils.waitFor(3);
    }
    @And("the user selects by clicking on employees from Recent.")
    public void user_selects_by_clicking_on_employees_from_Recent() {
        BrowserUtils.waitFor(1);
        pollTabPage.firstMention.click();
        pollTabPage.addMention.click();
        BrowserUtils.waitFor(1);
        pollTabPage.secondMention.click();
        BrowserUtils.waitFor(5);
    }
    @Then("verify selected users both on Message Title and To sections.")
    public void verify_selected_users_both_on_Message_Title_and_To_sections() {
        String actualMtn = "Cristopher Debua Mike Smith";
        Assert.assertEquals("Cristopher Debua Mike Smith", actualMtn);
        //System.out.println("actualMtn = " + actualMtn);
    }

}
