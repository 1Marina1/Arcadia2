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
import pages.mathElements.math1Pages.Math1114Page;

import java.time.Duration;
import java.util.Objects;

public class Math1114 extends LogInOutBaseChild {
    @Test
    public void math1114(){
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        Math1114Page math1114Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math1114Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnitFirstClass()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math1114Page.getTask1114()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        String parameter = math1114Page.getTaskParameter().getText();

        if (Objects.equals(parameter, "3 Arme, 2 Beine, 3 Flecken und 3 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/73.svg']")).click();
        }else if (Objects.equals(parameter, "2 Flecken, 3 Beine, 1 Arm und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/3.svg']")).click();
        }else if (Objects.equals(parameter, "4 Flecken, 3 Augen, 5 Beine und 2 Arme")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/5.svg']")).click();
        }else if (Objects.equals(parameter, "2 Beine, 5 Arme, 3 Flecken und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/7.svg']")).click();
        }else if (Objects.equals(parameter, "1 Auge, 4 Arme, 3 Beine und 1 Fleck")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/12.svg']")).click();
        }else if (Objects.equals(parameter, "5 Flecken, 3 Arme, 4 Beine und 3 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/14.svg']")).click();
        }else if (Objects.equals(parameter, "5 Arme, 2 Flecken, 3 Beine und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/16.svg']")).click();
        }else if (Objects.equals(parameter, "1 Flecken, 1 Arm, 2 Beine und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/19.svg']")).click();
        }else if (Objects.equals(parameter, "3 Beine, 2 Arme, 4 Flecken und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/24.svg']")).click();
        }else if (Objects.equals(parameter, "2 Flecken, 4 Arme, 4 Beine und 3 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/26.svg']")).click();
        }else if (Objects.equals(parameter, "2 Beine, 3 Flecken, 4 Arme und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/30.svg']")).click();
        }else if (Objects.equals(parameter, "5 Flecken, 3 Augen, 3 Beine und 3 Arme")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/31.svg']")).click();
        }else if (Objects.equals(parameter, "2 Arme, 3 Flecken, 2 Beine und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/35.svg']")).click();
        }else if (Objects.equals(parameter, "3 Beine, 1 Auge, 4 Flecken und 2 Arme")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/38.svg']")).click();
        }else if (Objects.equals(parameter, "2 Flecken, 5 Arme, 3 Beine und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/41.svg']")).click();
        }else if (Objects.equals(parameter, "2 Beine, 3 Flecken, 4 Arme und 3 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/44.svg']")).click();
        }else if (Objects.equals(parameter, "3 Beine, 5 Flecken, 2 Arme und 1 Auge")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/48.svg']")).click();
        }else if (Objects.equals(parameter, "2 Beine, 1 Auge, 2 Flecken und 3 Arme")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/51.svg']")).click();
        }else if (Objects.equals(parameter, "3 Beine, 3 Flecken, 2 Arme und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/52.svg']")).click();
        }else if (Objects.equals(parameter, "1 Arm, 4 Flecken, 2 Beine und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/55.svg']")).click();
        }else if (Objects.equals(parameter, "4 Beine, 5 Flecken, 3 Arme und 2 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/60.svg']")).click();
        }else if (Objects.equals(parameter, "1 Arm, 3 Flecken, 2 Beine und 1 Auge")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/61.svg']")).click();
        }else if (Objects.equals(parameter, "2 Augen, 2 Flecken, 4 Arme und 3 Beine")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/66.svg']")).click();
        }else if (Objects.equals(parameter, "2 Augen, 3 Beine, 1 Arm und 2 Flecken")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/68.svg']")).click();
        }else if (Objects.equals(parameter, "3 Arme, 2 Beine, 3 Flecken und 3 Augen")){
            math1114Page.getTaskBody().findElement(By.cssSelector("img[src = '/assets/resources/monster/71.svg']")).click();
        }
        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(math1114Page.getSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element4);

        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }
}
