package net.crmly.pages;

import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PollTabPage extends BasePage {
    WebDriver driver;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollTab;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span/span[1]")
    public WebElement allEmployeesBtn;

    @FindBy(css = "a[href='#switchTab']:nth-child(2)")
    public WebElement empsAndDepsTab;

    @FindBy(xpath = "//*[@id='bx-lm-category-relation-129']/a[9]")
    public WebElement contactsOne;

    //@FindBy(css = "a[href='#U513']")
    @FindBy(xpath = "//*[@id='bx-lm-category-relation-129']/a[4]")
    public WebElement contactsTwo;

    //@FindBy(css = "a[href='#U514']")
    @FindBy(xpath = "//*[@id='bx-lm-category-relation-129']/a[3]/div[1]/div[1]")
    public WebElement contactsThree;


    @FindBy(className = "popup-window-close-icon")
    public WebElement closeTab;

    @FindBy(css = "span#feed-add-post-destination-item")
    public List<WebElement> employeesBox;

    @FindBy(css = "span#bx-b-link-blogPostForm")
    public WebElement attachBtn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrl;

    @FindBy(id = "undefined")
    public WebElement saveBtn;

    @FindBy(css = "#bx-b-mention-blogPostForm")
    public WebElement addMention;

    @FindBy(className = "bx-finder-box-item-t7-name")
    public WebElement firstMention;

    @FindBy(css = "a[href='#U693']")
    public WebElement secondMention;

    @FindBy(xpath = "//html/body")
    public WebElement messageBody;

    @FindBy(linkText = "Add question")
    public WebElement addQuestionBtn;

    @FindBy(id = "question_0")
    public WebElement questionOne;

    @FindBy(id = "question_1")
    public WebElement addQuestionTwo;

    @FindBy(id = "answer_0__0_")
    public WebElement q1Ans1;

    @FindBy(id = "answer_0__1_")
    public WebElement q1Ans2;

    @FindBy(id = "answer_1__0_")
    public WebElement q2AnswerOne;

    @FindBy(id = "answer_1__1_")
    public WebElement q2AnswerTwo;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "//*[@id='blg-post-737']")
    public WebElement message;

    @FindBy(xpath = "//label[@title='Delete question']")
    public WebElement deleteQuestion;

    @FindBy(xpath = "//*[@id='votes-ac3ab09e1ab5bccbdfe6e02e0dec8cff']")
    public WebElement questionBox;

    @FindBy(css = "#multi_0")
    public  WebElement checkBoxBtn1;

    @FindBy(css = "#multi_1")
    public  WebElement checkBoxBtn2;

    @FindBy(xpath = "//*[@id='BXSocNetLogDestination']/span[1]")
    public WebElement closeBtn;



    public void actualtitle() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("(10) Portal", actualTitle);

    }
}