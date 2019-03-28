package com.fiservautomation.pageObjects;

import framework.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GuildLoginPage extends  BasePage {

    @FindBy(id = "username")
    private WebElement usernameFld;

    @FindBy(id = "password")
    private WebElement passwordFld;

    @FindBy(xpath = "//button[@value='Log in']")
    private WebElement loginBtn;

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(loginBtn);
    }

    public GuildLoginPage open(String url) {
        DriverManager.getDriver().navigate().to(url);
        return (GuildLoginPage) openPage(GuildLoginPage.class);
    }

    public GuildHomePage login(String username,String password){
        click(usernameFld,"usernameFld");
        type(usernameFld,username,"username");
        click(passwordFld,"passwordFld");
        type(passwordFld,password,"passwordFld");
        click(loginBtn,"loginBtn");
        return (GuildHomePage) openPage(GuildHomePage.class);
    }


    public WebElement getLoginBtn() {
        return loginBtn;
    }
}
