package tests.math1;

import helpers.GoToFirstUnit;
import helpers.LogInOutBaseChild;
import helpers.PressAnswer;
import helpers.WebDriverContainer1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import pages.mathElements.math1Pages.Math1119Page;

import java.time.Duration;
import java.util.List;

public class Math1119 extends LogInOutBaseChild {

    @Test
    public void math1119() {
        Math1119Page math1119Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math1119Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        Actions builder = new Actions(WebDriverContainer1.getDriver());
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);
        GoToFirstUnit goToFirstUnit = PageFactory.initElements(WebDriverContainer1.getDriver(), GoToFirstUnit.class);

        goToFirstUnit.goToFirstUnit();

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math1119Page.getTask1119()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        List<WebElement> fruits = math1119Page.getTaskDiv().findElements(By.tagName("img"));

        int quantityParameter = Integer.parseInt(math1119Page.getParameter()
                                .getText().replaceAll("[\\D]", ""));
        System.out.println(quantityParameter);

        for (int i = 0; i < quantityParameter; i++) {
            Action dragAndDrop = builder.clickAndHold(fruits.get(i))
                    .moveToElement(math1119Page.getDropSection())
                    .release(math1119Page.getDropSection())
                    .build();
            dragAndDrop.perform();
        }
        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math1119Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        pressAnswer.assertTask();

    }
}