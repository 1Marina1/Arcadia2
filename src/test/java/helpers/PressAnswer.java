package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.ChildDashboard;
import pages.mathElements.Math113Page;
import pages.mathElements.Math114Page;

import java.time.Duration;

public class PressAnswer {
    ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
    Math114Page math114 = PageFactory.initElements(WebDriverContainer1.getDriver(), Math114Page.class);
    Math113Page math113Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math113Page.class);
    WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));


    public void answerOne() {
        this.math114.getAnswerOne().click();
        this.math114.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerTwo() {
        this.math114.getAnswerTwo().click();
        this.math114.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerThree() {
        this.math114.getAnswerThree().click();
        this.math114.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerFour() {
        this.math114.getAnswerFour().click();
        this.math114.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerFive() {
        this.math114.getAnswerFive().click();
        this.math114.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerSix() {
        this.math113Page.getAnswerSix().click();
        this.math113Page.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerSeven() {
        this.math113Page.getAnswerSeven().click();
        this.math113Page.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerEight() {
        this.math113Page.getAnswerEight().click();
        this.math113Page.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerNine() {
        this.math113Page.getAnswerNine().click();
        this.math113Page.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerTen() {
        this.math113Page.getAnswerTen().click();
        this.math113Page.getSubmitButton().click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getWellDonePicture()));
        Assert.assertTrue(this.childDashboard.getWellDonePicture().isDisplayed());
    }
}
