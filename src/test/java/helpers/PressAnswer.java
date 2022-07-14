package helpers;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.ChildDashboard;
import pages.mathElements.Math113Page;
import pages.mathElements.Math114Page;


public class PressAnswer {
    ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
    Math114Page math114 = PageFactory.initElements(WebDriverContainer1.getDriver(), Math114Page.class);
    Math113Page math113Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math113Page.class);


    public void answerOne() {
        math114.getAnswerOne().click();
        math114.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerTwo() {
        math114.getAnswerTwo().click();
        math114.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerThree() {
        math114.getAnswerThree().click();
        math114.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerFour() {
        math114.getAnswerFour().click();
        math114.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerFive() {
        math114.getAnswerFive().click();
        math114.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerSix() {
        math113Page.getAnswerSix().click();
        math113Page.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerSeven() {
        math113Page.getAnswerSeven().click();
        math113Page.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerEight() {
        math113Page.getAnswerEight().click();
        math113Page.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerNine() {
        math113Page.getAnswerNine().click();
        math113Page.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }

    public void answerTen() {
        math113Page.getAnswerTen().click();
        math113Page.getSubmitButton().click();
        Assert.assertTrue(childDashboard.getWellDonePicture().isDisplayed());
    }
}
