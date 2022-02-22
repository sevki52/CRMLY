package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.PollTabPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;

public class MultipleChoiceStepDefs {
    PollTabPage pollTabPage = new PollTabPage();

    @When("the user clicks Allow multiple choice button")
    public void the_user_clicks_Allow_multiple_choice_button() {
        pollTabPage.checkBoxBtn1.click();
        pollTabPage.checkBoxBtn2.click();
        BrowserUtils.waitFor(1);

    }

    @Then("the user sees blue thick on checkbox")
    public void the_user_sees_blue_thick_on_checkbox() {
        BrowserUtils.waitFor(6);
        Assert.assertTrue(pollTabPage.checkBoxBtn1.isEnabled());
        BrowserUtils.waitFor(6);
        Assert.assertTrue(pollTabPage.checkBoxBtn2.isEnabled());

    }
}
