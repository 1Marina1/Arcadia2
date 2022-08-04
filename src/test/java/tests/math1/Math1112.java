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
import pages.mathElements.math1Pages.Math1112Page;


import java.time.Duration;

public class Math1112 extends LogInOutBaseChild {
    @Test
    public void math1112(){
        Math1112Page math1112Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math1112Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);
        GoToFirstUnit goToFirstUnit = PageFactory.initElements(WebDriverContainer1.getDriver(), GoToFirstUnit.class);

        goToFirstUnit.goToFirstUnit();

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math1112Page.getTask1112()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        int firstAnswer = Integer.parseInt(math1112Page.getFirstNumber().getText()) - 1;
        int secondAnswer = Integer.parseInt(math1112Page.getFirstNumber().getText()) + 1;
        int thirdAnswer = Integer.parseInt(math1112Page.getSecondNumber().getText()) + 1;
        int fourthAnswer = Integer.parseInt(math1112Page.getFourthNumber().getText()) - 1;
        int fifthAnswer = Integer.parseInt(math1112Page.getFourthNumber().getText()) + 1;

        math1112Page.getFirstInput().sendKeys(String.valueOf(firstAnswer));
        math1112Page.getSecondInput().sendKeys(String.valueOf(secondAnswer));
        math1112Page.getThirdInput().sendKeys(String.valueOf(thirdAnswer));
        math1112Page.getFourthInput().sendKeys(String.valueOf(fourthAnswer));
        math1112Page.getFifthInput().sendKeys(String.valueOf(fifthAnswer));

        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math1112Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        pressAnswer.assertTask();
    }
}
