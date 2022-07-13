package tests.math1;

import helpers.LogInOutBaseChild;
import helpers.WebDriverContainer1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChildDashboard;
import pages.mathElements.Math111Page;

import java.time.Duration;


public class Math111 extends LogInOutBaseChild {

    @Test
    public void math111(){
        Math111Page math111Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math111Page.class);
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));


        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnit()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math111Page.getTask111()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(math111Page.getTaskDiv()));

        int firstSummand = Integer.parseInt(math111Page.getFirstSummand().getText());
        int secondSummand = Integer.parseInt(math111Page.getSecondSummand().getText());
        int answer = firstSummand + secondSummand;

        math111Page.getAnswerFieldInput().sendKeys(String.valueOf(answer));

        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math111Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }
}
