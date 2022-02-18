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
import java.util.List;

public class PollTabStepDefs {
    PollTabPage pollTabPage = new PollTabPage();

    @Given("the user successfully navigates to the Homepage")
    public void the_user_successfully_navigates_to_the_Homepage() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login();
    }

    @Then("the user is on home page")
    public void the_user_is_on_home_page() throws InterruptedException{
        pollTabPage.actualtitle();

    }
    @When("the user clicks Poll tab on the homepage")
    public void the_user_clicks_Poll_tab_on_the_homepage() throws InterruptedException {
        pollTabPage.pollTab.click();

    }
    @And("the user  clicks All employees under the pool tab")
    public void the_user_clicks_All_employees_under_the_pool_tab() {
        BrowserUtils.waitForClickablility(pollTabPage.allEmployeesBtn,5);
        pollTabPage.allEmployeesBtn.click();
    }
    @And("the user clicks on employees and departments on the right side")
    public void the_user_clicks_on_employees_and_departments_on_the_right_side() {
        BrowserUtils.waitFor(2);
        pollTabPage.empsAndDepsTab.click();

    }
    @And("the user selects multiple contacts from Employees and Departments contact lists")
    public void the_user_selects_multiple_contacts_from_Employees_and_Departments_contact_lists() {
        BrowserUtils.waitFor(5);
        pollTabPage.contactsOne.click();
        BrowserUtils.waitFor(5);
        pollTabPage.contactsTwo.click();
        BrowserUtils.waitFor(5);
        pollTabPage.contactsThree.click();
    }
    @And("the user closes the contact lists window")
    public void the_user_closes_the_contact_lists_window() {
        pollTabPage.closeTab.click();

    }
    @Then("verify the contacts in the employee box")
    public void verify_the_contacts_in_the_employee_box(List<String> expectedContacts) {
        List<String> actualContacts = BrowserUtils.getElementsText(new PollTabPage().employeesBox);
        Assert.assertNotEquals(expectedContacts, actualContacts);
        System.out.println(actualContacts);
        BrowserUtils.waitFor(5);


    }


}
