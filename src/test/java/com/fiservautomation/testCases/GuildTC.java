package com.fiservautomation.testCases;

import com.fiservautomation.pageObjects.GuildHomePage;
import com.fiservautomation.pageObjects.GuildLoginPage;
import framework.driver.TestFixtures;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuildTC extends TestFixtures {

    @Test
    public void checkLoginPageLanded() {
        logInfo("checkLoginPageLanded");
        launchBrowser(Config.getProperty("browser"));
        logInfo("Launched Browser : " + Config.getProperty("browser"));
        GuildLoginPage guildLoginPage = new GuildLoginPage().open(Config.getProperty("guildUrl"));
        Assert.assertTrue(guildLoginPage.getLoginBtn().isDisplayed(), "LoginBtn is displayed");
    }

    @Test
    public void doLoginAndVerifyHomePage() {
        log.info("doLoginAndVerifyHomePage");
        launchBrowser(Config.getProperty("browser"));
        logInfo("Launched Browser : " + Config.getProperty("browser"));
        GuildLoginPage guildLoginPage = new GuildLoginPage().open(Config.getProperty("guildUrl"));
        GuildHomePage guildHomePage = guildLoginPage.login(Config.getProperty("guildUsername"), Config.getProperty("guildPassword"));
        Assert.assertTrue(guildHomePage.getGuildLogo().isDisplayed(), "GuildLogo is displayed");
    }
}
