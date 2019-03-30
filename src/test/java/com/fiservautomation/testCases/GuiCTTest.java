package com.fiservautomation.testCases;

import com.fiservautomation.pageObjects.GuildLoginPage;
import com.fiservautomation.pageObjects.HackathonHomePage;
import com.fiservautomation.pageObjects.TopGainersPage;
import framework.driver.DriverManager;
import framework.driver.TestFixtures;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GuiCTTest extends TestFixtures {

    @Test
    public void checkCTHackATAhonCount(){
        logInfo("checkCTHackATAhonCount");
        launchBrowser(Config.getProperty("browser"));
        logInfo("Launched Browser : " + Config.getProperty("browser"));
        HackathonHomePage hackathonHomePage = new HackathonHomePage().open(Config.getProperty("guildUrl"));
        int count = hackathonHomePage.getLogoCount();
        logInfo("#CTHackATAhon logo count is:"+count);
        System.out.println("Count is:"+count);
    }

    @Test
    public void getNSCTopGainersCheck(){
        logInfo("getNSCTopGainersCheck");
        launchBrowser(Config.getProperty("browser"));
        logInfo("Launched Browser : " + Config.getProperty("browser"));
        HackathonHomePage hackathonHomePage = new HackathonHomePage().open(Config.getProperty("guildUrl"));
       List<WebElement> nseGainersEle =  hackathonHomePage.getNscTopGainers();
        for (WebElement singleNse:nseGainersEle) {
            singleNse.getText().trim();
        }
        TopGainersPage topGainersPage = new TopGainersPage().open(Config.getProperty("topGainerURL"));
        DriverManager.getDriver().navigate().to("https://nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");


    }

}
