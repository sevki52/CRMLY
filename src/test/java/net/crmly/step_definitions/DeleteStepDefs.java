package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.PollTabPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DeleteStepDefs {
    PollTabPage pollTabPage = new PollTabPage();
    WebDriver driver;

    @When("the user clicks X button")
    public void the_user_clicks_X_button() {
        BrowserUtils.waitFor(10);
        BrowserUtils.clickWithJS(pollTabPage.deleteQuestion);
        BrowserUtils.waitFor(5);
        Driver.get().switchTo().alert().accept();
    }

    @Then("verify to delete questions and answer")
    public void verify_to_delete_questions_and_answer() {
        Assert.assertNotEquals(pollTabPage.questionBox, pollTabPage.addQuestionBtn);
        BrowserUtils.waitFor(2);
    }
}
