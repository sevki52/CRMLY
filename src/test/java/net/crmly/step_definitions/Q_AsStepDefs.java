package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.PollTabPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;


public class Q_AsStepDefs {
    PollTabPage pollTabPage = new PollTabPage();

    @When("the user writes message title")
    public void the_user_writes_message_title() {
        BrowserUtils.waitFor(2);
        Driver.get().switchTo().frame(0);
        pollTabPage.messageBody.clear();
        pollTabPage.messageBody.sendKeys("Questions and Answers");
        Driver.get().switchTo().defaultContent();
    }

    @And("the user clicks Add question button")
    public void the_user_clicks_Add_question_button() {
        BrowserUtils.waitFor(4);
        BrowserUtils.scrollToElement(pollTabPage.addQuestionBtn);
        pollTabPage.addQuestionBtn.click();
        BrowserUtils.waitFor(2);
    }

    @And("the user adds questions")
    public void the_user_adds_questions() {
        BrowserUtils.waitFor(1);
        pollTabPage.questionOne.sendKeys("What is your name?");
        BrowserUtils.waitFor(1);
        pollTabPage.addQuestionTwo.sendKeys("Where are you from?");
    }

    @And("the user gives multiple answers")
    public void the_user_gives_multiple_answers() {
        pollTabPage.q1Ans1.sendKeys("Mike");
        pollTabPage.q1Ans2.sendKeys("Smith");
        pollTabPage.q2AnswerOne.sendKeys("German");
        pollTabPage.q2AnswerTwo.sendKeys("Frankfurt");

    }

//    @When("the user clicks Send button")
//    public void the_user_clicks_Send_button() {
//        pollTabPage.sendBtn.click();
//        BrowserUtils.waitFor(10);
//    }

    @Then("verify the message box")
    public void verify_the_message_box() {
        Assert.assertTrue(pollTabPage.questionOne.isDisplayed());
        Assert.assertTrue(pollTabPage.addQuestionTwo.isDisplayed());
        Assert.assertTrue(pollTabPage.q1Ans1.isDisplayed());
        Assert.assertTrue(pollTabPage.q1Ans2.isDisplayed());
    }
}
