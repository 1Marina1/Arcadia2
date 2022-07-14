package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pages.ChildDashboard;
import pages.MainPage;
import pages.parentPages.ParentDashboard;
import tests.mainPage.TestLogInOutToParent;

import java.util.concurrent.TimeUnit;

@Listeners({ScreenshotListener1.class})
public class LogInOutBaseChild {
    protected WebDriver driver = WebDriverContainer1.initDriver();
    protected String baseUrl = "https://arcadia.study/de/";

    @BeforeTest
    public void logIn() {

        WebDriverContainer1.getDriver().switchTo().newWindow(WindowType.WINDOW);
        WebDriverContainer1.getDriver().get(this.baseUrl);
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);

        mainPage.getMyAccountHeaderLink().click();//здесь ошибка

        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TestLogInOutToParent logInToParent = PageFactory.initElements(WebDriverContainer1.getDriver(), TestLogInOutToParent.class);
        logInToParent.attemptLogin("marina.veremchuk@northitgroup.eu", "zmxncbv12344321");
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        String dashboardLoggedIn = parentDashboard.getDashboardTitle().getText();
        Assert.assertEquals(dashboardLoggedIn, "Dashboard");
        parentDashboard.getLinkToKristinaKidsAccount().click();
    }

   // @AfterTest
    public void logOutAndTearDown() {
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        childDashboard.getLogOutButtonChildDashboard().click();
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        Assert.assertTrue(mainPage.getPictureWithChildren().isDisplayed());
        WebDriverContainer1.closeDriver();
    }
}
