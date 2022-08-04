package tests.math1;

import helpers.GoToFirstUnit;
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
import pages.mathElements.math1Pages.Math1113Page;

import java.time.Duration;
import java.util.List;

public class Math1113 extends LogInOutBaseChild {
    @Test
    public void math1113(){
        Math1113Page math1113Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math1113Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);
        GoToFirstUnit goToFirstUnit = PageFactory.initElements(WebDriverContainer1.getDriver(), GoToFirstUnit.class);

        goToFirstUnit.goToFirstUnit();

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math1113Page.getTask1113()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        List<WebElement> greyCars = math1113Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cars/grey.svg']"));
        List<WebElement> blueCars = math1113Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cars/blue.svg']"));
        List<WebElement> orangeCars = math1113Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cars/orange.svg']"));
        List<WebElement> greenCars = math1113Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cars/green.svg']"));

        int greyCarsAmount = greyCars.size() - 1;
        int blueCarsAmount = blueCars.size() - 1;
        int orangeCarsAmount = orangeCars.size() - 1;
        int greenCarsAmount = greenCars.size() - 1;

        math1113Page.getFirstInput().sendKeys(String.valueOf(greyCarsAmount));
        math1113Page.getSecondInput().sendKeys(String.valueOf(blueCarsAmount));
        math1113Page.getThirdInput().sendKeys(String.valueOf(orangeCarsAmount));
        math1113Page.getFourthInput().sendKeys(String.valueOf(greenCarsAmount));

        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math1113Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        pressAnswer.assertTask();
    }
}
