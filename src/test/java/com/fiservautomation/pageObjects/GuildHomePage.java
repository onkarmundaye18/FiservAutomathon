package com.fiservautomation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GuildHomePage extends BasePage {


    @FindBy(className = "site-title")
    private WebElement guildLogo;

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(guildLogo);
    }


    public WebElement getGuildLogo() {
        return  guildLogo;
    }
}
