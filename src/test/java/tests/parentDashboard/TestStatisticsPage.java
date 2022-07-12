package tests.parentDashboard;

import helpers.LogInOutBase;
import helpers.WebDriverContainer1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.parentPages.ParentDashboard;
import pages.parentPages.StatisticsPage;

import java.time.Duration;

public class TestStatisticsPage extends LogInOutBase {
    public TestStatisticsPage() {
    }

    @Test
    public void switchBetweenChildren() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), StatisticsPage.class);
        parentDashboard.getStatistikLeftMenu().click();
        statisticsPage.getKristinaChoosingChild().click();
        String kristinaIsChosenColor = statisticsPage.getKristinaChoosingChild().getCssValue("background-color");
        Assert.assertEquals(kristinaIsChosenColor, "rgba(255, 255, 255, 1)");
        statisticsPage.getValentinChoosingChild().click();
        String valentinIsChosenColor = statisticsPage.getValentinChoosingChild().getCssValue("background-color");
        Assert.assertEquals(valentinIsChosenColor, "rgba(255, 255, 255, 1)");
        statisticsPage.getMarkChoosingChild().click();
        String markIsChosenColor = statisticsPage.getMarkChoosingChild().getCssValue("background-color");
        Assert.assertEquals(markIsChosenColor, "rgba(255, 255, 255, 1)");
    }

    @Test
    public void switchBetweenTimeTabs() throws InterruptedException {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), StatisticsPage.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(10));
        Actions actions = new Actions(WebDriverContainer1.getDriver());
        parentDashboard.getStatistikLeftMenu().click();


        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(statisticsPage.getDayTabButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);
        actions.moveToElement(statisticsPage.getDayTabButton()).doubleClick().perform();
        String valueDay = statisticsPage.getDayTabButton().getAttribute("class");
        Assert.assertEquals(valueDay, "mat-button-toggle w-100 active mat-button-toggle-appearance-standard cdk-focused cdk-mouse-focused mat-button-toggle-checked");


        actions.moveToElement(statisticsPage.getWeekTabButton()).doubleClick().perform();
        String valueWeek = statisticsPage.getWeekTabButton().getAttribute("class");
        Assert.assertEquals(valueWeek, "mat-button-toggle w-100 mat-button-toggle-appearance-standard cdk-focused cdk-mouse-focused active mat-button-toggle-checked");

        actions.moveToElement(statisticsPage.getMonthTabButton()).doubleClick().perform();
        String valueMonth = statisticsPage.getMonthTabButton().getAttribute("class");
        Assert.assertEquals(valueMonth, "mat-button-toggle w-100 mat-button-toggle-appearance-standard cdk-focused cdk-mouse-focused active mat-button-toggle-checked");

        actions.moveToElement(statisticsPage.getAllTabButton()).doubleClick().perform();
        String valueAll = statisticsPage.getAllTabButton().getAttribute("class");
        Assert.assertEquals(valueAll, "mat-button-toggle w-100 mat-button-toggle-appearance-standard cdk-focused cdk-mouse-focused active mat-button-toggle-checked");

        String script = "return window.getComputedStyle(document.querySelector('mat-button-toggle.active'),':before').getPropertyValue('background-color')";
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)WebDriverContainer1.getDriver();
        String barColorDay = (String)js.executeScript(script, new Object[0]);
        Assert.assertEquals(barColorDay, "rgb(255, 255, 255)");
    }

    @Test
    public void switchBetweenStatisticsScopes() throws InterruptedException {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), StatisticsPage.class);
        parentDashboard.getStatistikLeftMenu().click();
        statisticsPage.getTasksChoosingStatistics().click();

        String newUrl;
        do {
            newUrl = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        } while(newUrl.contentEquals("https://arcadia.study/en/parent/statistics/tasks"));

        statisticsPage.getUnitChoosingStatistics().click();

        String newUrl1;
        do {
            newUrl1 = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        } while(newUrl1.contentEquals("https://arcadia.study/en/parent/statistics/units"));

        statisticsPage.getSubjectChoosingStatistics().click();

        String newUrl2;
        do {
            newUrl2 = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        } while(newUrl2.contentEquals("https://arcadia.study/en/parent/statistics/subject"));

        statisticsPage.getClassChoosingStatistics().click();

        String newUrl3;
        do {
            newUrl3 = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        } while(newUrl3.contentEquals("https://arcadia.study/en/parent/statistics/class"));

    }

    @Test
    public void switchTasksGermanMath() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), StatisticsPage.class);
        parentDashboard.getStatistikLeftMenu().click();
        statisticsPage.getMathTab().click();
        String classValueMathTab = statisticsPage.getMathTab().getAttribute("class");
        Assert.assertEquals(classValueMathTab, "btn-math btn-subjects cursor-pointer text-decoration-none active");
        statisticsPage.getGermanTab().click();
        String classValueGermanTab = statisticsPage.getGermanTab().getAttribute("class");
        Assert.assertEquals(classValueGermanTab, "btn-german btn-subjects cursor-pointer text-decoration-none active");
    }

    @Test
    public void chooseClassForKidStatistics() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), StatisticsPage.class);
        parentDashboard.getStatistikLeftMenu().click();
        statisticsPage.getKristinaClassDropDown().click();
        statisticsPage.getFirstClassKristinaFromDropDown().click();
        String classDropDownText = statisticsPage.getKristinaClassDropDown().getText();
        Assert.assertEquals(classDropDownText, "Klasse 1");
        statisticsPage.getValentinChoosingChild().click();
        statisticsPage.getValentinClassDropDown().click();
        statisticsPage.getFirstClassValentinFromDropDown().click();
        String classDropDownTextV = statisticsPage.getValentinClassDropDown().getText();
        Assert.assertEquals(classDropDownTextV, "Klasse 1");
    }
}
