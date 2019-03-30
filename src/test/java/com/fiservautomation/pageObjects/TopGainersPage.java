package com.fiservautomation.pageObjects;

import framework.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TopGainersPage extends BasePage{

    @FindBy(xpath = "//table[@id='topGainers']//tr[not(contains(@style,'width:200px'))]//td[1]")
    private WebElement topGainSymbol;

    public WebElement getTopGainSymbol(){
        return topGainSymbol;
    }

    public TopGainersPage open(String url){
        DriverManager.getDriver().navigate().to(url);
        return (TopGainersPage) openPage(TopGainersPage.class);
    }
    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(topGainSymbol);
    }
}
