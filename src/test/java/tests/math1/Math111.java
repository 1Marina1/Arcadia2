package tests.math1;

import helpers.GoToFirstUnit;
import helpers.LogInOutBaseChild;
import helpers.PressAnswer;
import helpers.WebDriverContainer1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.mathElements.math1Pages.Math111Page;

import java.time.Duration;


public class Math111 extends LogInOutBaseChild {

    @Test
    public void math111(){
        Math111Page math111Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math111Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);
        GoToFirstUnit goToFirstUnit = PageFactory.initElements(WebDriverContainer1.getDriver(), GoToFirstUnit.class);

        goToFirstUnit.goToFirstUnit();

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math111Page.getTask111()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(math111Page.getTaskDiv()));

        int firstSummand = Integer.parseInt(math111Page.getFirstSummand().getText());
        int secondSummand = Integer.parseInt(math111Page.getSecondSummand().getText());
        int answer = firstSummand + secondSummand;

        math111Page.getAnswerFieldInput().sendKeys(String.valueOf(answer));

        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math111Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        pressAnswer.assertTask();
    }
}
