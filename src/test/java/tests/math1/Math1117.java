package tests.math1;

import helpers.LogInOutBaseChild;
import helpers.WebDriverContainer1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChildDashboard;
import pages.mathElements.math1Pages.Math1117Page;

import java.time.Duration;
import java.util.List;

public class Math1117 extends LogInOutBaseChild {
    @Test
    public void math1117() {
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        Math1117Page math1117Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math1117Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        Actions builder = new Actions(WebDriverContainer1.getDriver());


        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnitFirstClass()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math1117Page.getTask1117()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        List<WebElement> images = math1117Page.getTaskDiv().findElements(By.tagName("img"));

        for (int i = 0; i < images.size(); i++) {
            int floor = Integer.parseInt(images.get(i).getAttribute("src").replaceAll("[\\D]", ""));
            if (floor % 2 == 0){
                Action dragAndDrop = builder.clickAndHold(images.get(i))
                        .moveToElement(math1117Page.getEvenDropSection())
                        .release(math1117Page.getEvenDropSection())
                        .build();
                dragAndDrop.perform();
            } else {
                    Action dragAndDrop = builder.clickAndHold(images.get(i))
                            .moveToElement(math1117Page.getOddDropSection())
                            .release(math1117Page.getOddDropSection())
                            .build();
                    dragAndDrop.perform();
            }
        }
        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math1117Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }
}
