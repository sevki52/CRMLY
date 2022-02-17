package net.crmly.pages;

import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PollTabPage extends BasePage {

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollTab;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span/span[1]")
    public WebElement allEmployeesBtn;

    @FindBy(css = "a[href='#switchTab']:nth-child(2)")
    public WebElement empsAndDepsTab;

    @FindBy(css = "a[href='#U772']")
    public WebElement contactsOne;

    @FindBy(css ="a[href='#U513']")
    public WebElement contactsTwo;

    @FindBy(css ="a[href='#U514']")
    public WebElement contactsThree;

    @FindBy(className = "popup-window-close-icon")
    public WebElement closeTab;

    @FindBy (css = "span#feed-add-post-destination-item")
    public List<WebElement> employeesBox;

    @FindBy(css = "span#bx-b-link-blogPostForm")
    public WebElement attachBtn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTest;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrl;

    @FindBy(id = "undefined")
    public WebElement saveBtn;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMention;
    @FindBy(className = "bx-finder-box-item-t7-name")
    public WebElement firstMention;
    @FindBy(css = "a[href='#U693']")
    public WebElement secondMention;





    public void actualtitle() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("(10) Portal",actualTitle);
    }



}
