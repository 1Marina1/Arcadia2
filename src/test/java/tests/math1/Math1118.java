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
import pages.mathElements.math1Pages.Math1118Page;

import java.time.Duration;

public class Math1118 extends LogInOutBaseChild {
    @Test
    public void math1118() {
        Math1118Page math1118Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math1118Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);
        GoToFirstUnit goToFirstUnit = PageFactory.initElements(WebDriverContainer1.getDriver(), GoToFirstUnit.class);

        goToFirstUnit.goToFirstUnit();

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

        pressAnswer.assertTask();
    }
}
