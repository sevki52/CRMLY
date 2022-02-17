package net.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkPage extends BasePage{

    @FindBy(css = "span#bx-b-link-blogPostForm")
    public WebElement attachBtn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTest;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrl;

    @FindBy(id = "undefined")
    public WebElement saveBtn;


}
