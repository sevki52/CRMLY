package net.crmly.pages;

import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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



    public void actualtitle() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("(10) Portal",actualTitle);
    }
}
