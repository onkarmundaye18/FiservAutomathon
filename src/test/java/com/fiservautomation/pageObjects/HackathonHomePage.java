package com.fiservautomation.pageObjects;

import framework.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HackathonHomePage extends BasePage {


    @FindBy(xpath = "//div[@class='sec_text']")
    private WebElement mainSec;

    @FindBy(xpath = "//*[contains(text(),'#CTHackATAhon')]")
    private List<WebElement> logoCount;

    @FindBy(xpath = "//h2[text()='NSE Top Gainers:']//following::p[1]//br")
        private List<WebElement> nseTopGainers;

    public int getLogoCount() {
        return logoCount.size();
    }

    public List<WebElement> getNscTopGainers(){
        return nseTopGainers;
    }


    public HackathonHomePage open(String url){
        DriverManager.getDriver().navigate().to(url);
        return (HackathonHomePage) openPage(HackathonHomePage.class);
    }

    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(mainSec);
    }
}
