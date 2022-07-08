package tests.mainPage;

import helpers.ScreenshotListener1;
import helpers.TestBase;
import helpers.WebDriverContainer1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.parentPages.ParentDashboard;

import java.util.concurrent.TimeUnit;

@Listeners({ScreenshotListener1.class})
public class TestLogInOutToParent extends TestBase {
    @FindBy(css = "#mat-input-0")
    private WebElement emailInputLocator;
    @FindBy(css = "#mat-input-1")
    private WebElement passwordInputLocator;
    @FindBy(css = "button[type='submit']")
    private WebElement logInButton;
    @FindBy(css = "snack-bar-container > div > div > simple-snack-bar")
    private WebElement logInErrorMessage;

    public TestLogInOutToParent() {
    }

    public WebElement getEmailInputLocator() {
        return this.emailInputLocator;
    }

    public WebElement getPasswordInputLocator() {
        return this.passwordInputLocator;
    }

    public WebElement getLogInButton() {
        return this.logInButton;
    }

    public WebElement getLogInErrorMessage() {
        return this.logInErrorMessage;
    }

    public void attemptLogin(String email, String password) {
        TestLogInOutToParent logInToParent = (TestLogInOutToParent) PageFactory.initElements(WebDriverContainer1.getDriver(), TestLogInOutToParent.class);
        logInToParent.getEmailInputLocator().sendKeys(email);
        logInToParent.getPasswordInputLocator().sendKeys(password);
        logInToParent.getLogInButton().click();
    }

    @Test(priority = 0)
    public void invalidLogIn() {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        mainPage.getMyAccountHeaderLink().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TestLogInOutToParent logInToParent = PageFactory.initElements(WebDriverContainer1.getDriver(), TestLogInOutToParent.class);
        logInToParent.attemptLogin("marina.veremchuk@northitgr", "zmxncbv12344321");
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String errorMessage = logInToParent.getLogInErrorMessage().getText();
        Assert.assertEquals(errorMessage, "Falsches Login oder Passwort.\nclose");
        WebDriverContainer1.getDriver().navigate().refresh();
    }

    @Test(priority = 1)
    public void testLogInProcess() {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        mainPage.getMyAccountHeaderLink().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TestLogInOutToParent logInToParent = PageFactory.initElements(WebDriverContainer1.getDriver(), TestLogInOutToParent.class);
        logInToParent.attemptLogin("marina.veremchuk@northitgroup.eu", "zmxncbv12344321");
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        String dashboardLoggedIn = parentDashboard.getDashboardTitle().getText();
        Assert.assertEquals(dashboardLoggedIn, "Dashboard");
    }

    @Test(priority = 1)
    public void testLogOutProcess() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        parentDashboard.getLogoutButton().click();
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        Assert.assertTrue(mainPage.getPictureWithChildren().isDisplayed());
    }
}
