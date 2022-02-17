package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.crmly.pages.PollTabPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;

public class LinkStepDefs {

    PollTabPage pollTabPage = new PollTabPage();

    @And("the user clicks on the post attach button")
    public void the_user_clicks_on_the_post_attach_button() {
        pollTabPage.pollTab.click();
        BrowserUtils.waitFor(3);
        pollTabPage.attachBtn.click();
        BrowserUtils.waitFor(5);
    }

    @And("the user fills in the fields with link text and link url.")
    public void the_user_fills_in_the_fields_with_link_text_and_link_url() {

        pollTabPage.linkTest.sendKeys("CRM 24");
        BrowserUtils.waitFor(3);
        pollTabPage.linkUrl.sendKeys("https://qa.crmly.net/stream/");
        BrowserUtils.waitFor(2);
    }
    @And("the user clicks Save button.")
    public void the_user_clicks_Save_button() {
        pollTabPage.saveBtn.click();
        BrowserUtils.waitFor(2);
    }
    @Then("verify the link text in the message header as written")
    public void verify_the_link_text_in_the_message_header_as_written() {
        String actualMsg = "CRM 24";
        Assert.assertEquals("CRM 24", actualMsg);

    }
}
