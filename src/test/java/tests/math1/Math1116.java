package tests.math1;

import helpers.LogInOutBaseChild;
import helpers.WebDriverContainer1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChildDashboard;

import pages.mathElements.math1Pages.Math1116Page;

import java.time.Duration;
import java.util.List;

public class Math1116 extends LogInOutBaseChild {
    @Test
    public void math1116() {
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        Math1116Page math1116Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math1116Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));


        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnitFirstClass()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math1116Page.getTask1116()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        int[] numbers = new int[4];
        numbers[0] = Integer.parseInt(math1116Page.getTaskDiv()
                .findElement(By.cssSelector("form > div > div:nth-child(1) > div:nth-child(1)")).getText());
        numbers[1] = Integer.parseInt(math1116Page.getTaskDiv()
                .findElement(By.cssSelector("form > div > div:nth-child(1) > div:nth-child(2)")).getText());
        numbers[2] = Integer.parseInt(math1116Page.getTaskDiv()
                .findElement(By.cssSelector("form > div > div:nth-child(1) > div:nth-child(3)")).getText());
        numbers[3] = Integer.parseInt(math1116Page.getTaskDiv()
                .findElement(By.cssSelector("form > div > div:nth-child(1) > div:nth-child(4)")).getText());


        List<WebElement> inputs = math1116Page.getInputs().findElements(By.tagName("input"));


        for (int number : numbers) {
                for (int k = 0; k < 2; k++) {
                    boolean isEmpty = inputs.get(k).getAttribute("value").isEmpty();
                    if (number % 2 == 0 && isEmpty) {
                        inputs.get(k).sendKeys(String.valueOf(number));
                        break;
                    }
                }
                for (int k = 2; k < 4; k++) {
                    boolean isEmpty = inputs.get(k).getAttribute("value").isEmpty();
                    if (number % 2 != 0 && isEmpty) {
                        inputs.get(k).sendKeys(String.valueOf(number));
                        break;
                    }
                }
        }

        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math1116Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
        }
    }
