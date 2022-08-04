package tests.math1;

import helpers.LogInOutBaseChild;
import helpers.WebDriverContainer1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChildDashboard;
import pages.mathElements.math1Pages.Math1118Page;

import java.time.Duration;

public class Math1118 extends LogInOutBaseChild {
    @Test
    public void math1118() {
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        Math1118Page math1118Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math1118Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));


        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnitFirstClass()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math1118Page.getTask1118()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        int taskDigit = Integer.parseInt(math1118Page.getTaskDigit().getText());
        int leftNumber = Integer.parseInt(math1118Page.getLeftNumber().getText());

        int subtraction = taskDigit - leftNumber;

        if ( subtraction == 2){
            math1118Page.getFirstAnswer().click();
        } else if (subtraction == 4){
            math1118Page.getSecondAnswer().click();
        } else math1118Page.getThirdAnswer().click();

        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math1118Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }
}
