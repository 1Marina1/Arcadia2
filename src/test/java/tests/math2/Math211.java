package tests.math2;

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
import pages.mathElements.Math211Page;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Math211 extends LogInOutBaseChild {
    @Test
    public void math211(){
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        Math211Page math211Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math211Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getSecondClassTab()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnitSecondClass()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(math211Page.getTask211()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element3);


        int firstSummand = Integer.parseInt(math211Page.getFirstSummand().getText());
        int secondSummand = Integer.parseInt(math211Page.getSecondSummand().getText());
        int answer = firstSummand + secondSummand;

        math211Page.getAnswerFieldInput().sendKeys(String.valueOf(answer));

        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math211Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }
}
