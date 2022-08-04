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
import pages.mathElements.math1Pages.Math1115Page;

import java.time.Duration;

public class Math1115 extends LogInOutBaseChild {
    @Test
    public void math1115() {
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        Math1115Page math1115Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math1115Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnitFirstClass()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math1115Page.getTask1115()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        String image = math1115Page.getTaskDiv().findElement(By.tagName("img")).getAttribute("src");
        int floor = Integer.parseInt(image.replaceAll("[\\D]", ""));

        switch (floor){
            case 0, 29, 28, 31, 14, 13 -> pressAnswer.answerFive();
            case 24, 11, 22 -> pressAnswer.answerSeven();
            case 21, 15, 26, 3, 20, 4 -> pressAnswer.answerFour();
            case 7, 5, 6, 35 -> pressAnswer.answerSix();
            case 10 -> pressAnswer.answerNine();
            case 33 -> pressAnswer.answerTen();
            case 8 -> pressAnswer.answerEight();

        }
    }
}