package tests.parentDashboard;

import helpers.LogInOutBase;
import helpers.WebDriverContainer1;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.parentPages.CartPage;
import pages.parentPages.ParentDashboard;
import pages.parentPages.SettingsPage;
import pages.parentPages.StatisticsPage;

import java.util.concurrent.TimeUnit;

public class TestParentDashboard extends LogInOutBase {

    @Test
    public void goToDashboardViaLeftMenu() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        parentDashboard.getDashboardLeftMenu().click();
        String dashboardTitle = parentDashboard.getDashboardTitle().getText();
        Assert.assertEquals(dashboardTitle, "Dashboard");
    }

    @Test
    public void goToStatisticsViaLeftMenu() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), StatisticsPage.class);

        parentDashboard.getStatistikLeftMenu().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String statisticsTitle = statisticsPage.getStatisticsTitle().getText();
        Assert.assertEquals(statisticsTitle, "Statistik");
    }

    @Test
    public void goToDashboardViaLogo() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        parentDashboard.getDashboardLogo().click();
        String title = parentDashboard.getDashboardTitle().getText();
        Assert.assertEquals(title, "Dashboard");
    }

    @Test
    public void goToSettingsRightMenu() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();

        String title = settingsPage.getSettingsTitle().getText();
        Assert.assertEquals(title, "Einstellungen");
    }

    @Test
    public void goToCartRightMenu() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        CartPage cartPage = PageFactory.initElements(WebDriverContainer1.getDriver(), CartPage.class);

        parentDashboard.getCartRightMenu().click();

        String title = cartPage.getCartTitle().getText();
        Assert.assertEquals(title, "Warenkorb");
    }

    @Test
    public void translateMainPageToEN() {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);

        mainPage.getLanguageSwitcher().click();
        mainPage.getLanguageSwitcherToEN().click();

        String title = parentDashboard.getLogoutButton().getText();
        Assert.assertEquals(title, "Logout");
        String switcherText = mainPage.getLanguageSwitcher().getText();
        Assert.assertEquals(switcherText, "EN");
        mainPage.getLanguageSwitcher().click();
        mainPage.getLanguageSwitcherToDE().click();
    }

    @Test
    public void translateMainPageToDE() {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        mainPage.getLanguageSwitcher().click();
        mainPage.getLanguageSwitcherToDE().click();

        String title = parentDashboard.getLogoutButton().getText();
        Assert.assertEquals(title, "Abmelden");
        String switcherText = mainPage.getLanguageSwitcher().getText();
        Assert.assertEquals(switcherText, "DE");
    }
}

