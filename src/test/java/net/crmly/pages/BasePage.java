package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id = "bx_left_menu_menu_company")
    public WebElement employeeModule;

    public String getActualTitle(){

        String title = Driver.get().getTitle();
        String[] actualTitleList = title.split("\\)");
        String actualTitle = actualTitleList[1].trim();
        return actualTitle;
    }

}
