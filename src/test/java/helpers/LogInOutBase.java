package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pages.MainPage;
import pages.parentPages.ParentDashboard;
import tests.mainPage.TestLogInOutToParent;

import java.util.concurrent.TimeUnit;

@Listeners({ScreenshotListener1.class})
public class LogInOutBase {
    protected WebDriver driver = WebDriverContainer1.initDriver();
    protected String baseUrl = "https://arcadia.study/de/";

    @BeforeTest
    public void logIn() {
        WebDriverContainer1.getDriver().get(this.baseUrl);
        System.out.println(WebDriverContainer1.getDriver().getCurrentUrl());
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        mainPage.getMyAccountHeaderLink().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TestLogInOutToParent logInToParent = PageFactory.initElements(WebDriverContainer1.getDriver(), TestLogInOutToParent.class);
        logInToParent.attemptLogin("marina.veremchuk@northitgroup.eu", "zmxncbv12344321");
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(parentDashboard.getDashboardTitle().isDisplayed());
    }

    @AfterTest
    public void logOutAndTearDown() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        parentDashboard.getLogoutButton().click();
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        Assert.assertTrue(mainPage.getPictureWithChildren().isDisplayed());
        WebDriverContainer1.closeDriver();
    }
}

