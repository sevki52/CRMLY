package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.PollTabPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;

public class PollStepDefs {
    PollTabPage pollTabPage = new PollTabPage();

    @When("the user clicks Poll tab on the home page")
    public void the_user_clicks_Poll_tab_on_the_home_page() {
     pollTabPage.pollTab.click();
    }

    @When("the user writes message title.")
    public void the_user_writes_message_title() {
        BrowserUtils.waitFor(3);
        Driver.get().switchTo().frame(0);
        pollTabPage.messageBody.clear();
        pollTabPage.messageBody.sendKeys("Questions and answers");
        Driver.get().switchTo().defaultContent();
    }
    @When("the user  clicks All employees under the pool tab.")
    public void the_user_clicks_All_employees_under_the_pool_tab() {
        BrowserUtils.waitForClickablility(pollTabPage.allEmployeesBtn,5);
        pollTabPage.allEmployeesBtn.click();
    }
    @When("the user clicks on employees and departments on the right side.")
    public void the_user_clicks_on_employees_and_departments_on_the_right_side() {
        BrowserUtils.waitFor(3);
        pollTabPage.empsAndDepsTab.click();
    }
    @When("the user selects multiple contacts from Employees and Departments contact lists.")
    public void the_user_selects_multiple_contacts_from_Employees_and_Departments_contact_lists() {
        //BrowserUtils.scrollToElement(pollTabPage.contactsOne);
        BrowserUtils.waitFor(5);
        pollTabPage.contactsOne.click();
        BrowserUtils.waitFor(5);
        pollTabPage.contactsTwo.click();
        BrowserUtils.waitFor(5);
        pollTabPage.contactsThree.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(pollTabPage.closeBtn);
    }
    @When("the user adds questions.")
    public void the_user_adds_questions() {
        pollTabPage.questionOne.sendKeys("What is your name?");
        BrowserUtils.waitFor(5);

    }
    @When("the user gives multiple answers.")
    public void the_user_gives_multiple_answers() {
        pollTabPage.q1Ans1.sendKeys("Mike");
        pollTabPage.q1Ans2.sendKeys("Smith");

    }
    @Then("the user clicks Send button.")
    public void the_user_clicks_Send_button() {
        pollTabPage.sendBtn.click();
        BrowserUtils.waitFor(10);

    }
}
