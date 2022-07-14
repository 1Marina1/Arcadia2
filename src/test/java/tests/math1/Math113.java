package tests.math1;

import helpers.LogInOutBaseChild;
import helpers.PressAnswer;
import helpers.WebDriverContainer1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.ChildDashboard;
import pages.mathElements.Math113Page;

import java.time.Duration;
import java.util.List;

public class Math113 extends LogInOutBaseChild {
    @Test
    public void math113(){
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        Math113Page math113Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math113Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnitFirstClass()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math113Page.getTask113()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(math113Page.getTaskBody()));

        WebElement taskBody = math113Page.getTaskBody();
        List<WebElement> objects = taskBody.findElements(By.tagName("img"));
        int count = objects.size();

        switch (count) {
            case 1 -> pressAnswer.answerOne();
            case 2 -> pressAnswer.answerTwo();
            case 3 -> pressAnswer.answerThree();
            case 4 -> pressAnswer.answerFour();
            case 5 -> pressAnswer.answerFive();
            case 6 -> pressAnswer.answerSix();
            case 7 -> pressAnswer.answerSeven();
            case 8 -> pressAnswer.answerEight();
            case 9 -> pressAnswer.answerNine();
            case 10 -> pressAnswer.answerTen();
        }
    }
}
