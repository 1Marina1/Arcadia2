package helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ChildDashboard;

import java.time.Duration;

public class GoToFirstUnit {
    public void goToFirstUnit(){

        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnitFirstClass()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);
    }

}
