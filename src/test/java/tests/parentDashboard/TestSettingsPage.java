package tests.parentDashboard;

import helpers.LogInOutBase;
import helpers.WebDriverContainer1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.parentPages.ParentDashboard;
import pages.parentPages.SettingsPage;

import java.time.Duration;

public class TestSettingsPage extends LogInOutBase {
    public TestSettingsPage() {
    }

    @Test
    public void changeParentName() {
        ParentDashboard parentDashboard =  PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getNameChangeButton().click();
        String newName = "a";
        settingsPage.getParentNameInput().sendKeys(newName);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessage().getText();
        Assert.assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newNameCheck = settingsPage.getParentName().getText();
        Assert.assertEquals(newNameCheck, "Marinaa");
        settingsPage.getNameChangeButton().click();
        settingsPage.getParentNameInput().sendKeys(Keys.BACK_SPACE);
        settingsPage.getSubmitButton().click();
    }

   // @Test
    public void changeParentSurname() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getSurnameChangeButton().click();
        String newSurname = "a";
        settingsPage.getParentSurnameInput().sendKeys(newSurname);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessage().getText();
        Assert.assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newSurnameCheck = settingsPage.getParentSurname().getText();
        Assert.assertEquals(newSurnameCheck, "Testera");
        settingsPage.getSurnameChangeButton().click();
        settingsPage.getParentSurnameInput().sendKeys(Keys.BACK_SPACE);
        settingsPage.getSubmitButton().click();
    }

    //@Test
    public void changeParentEmail() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getEmailChangeButton().click();
        String newEmail = "a";
        settingsPage.getParentEmailInput().sendKeys(newEmail);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessage().getText();
        Assert.assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newEmailCheck = settingsPage.getParentEmail().getText();
        Assert.assertEquals(newEmailCheck, "marina.veremchuk@northitgroup.eu");
        settingsPage.getNewEmailDeclineButton().click();
    }

   // @Test
    public void changeParentPassword() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));

        parentDashboard.getSettingRightMenu().click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(settingsPage.getPasswordChangeButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);
        String newPassword = "zmxncbv12344321";
        settingsPage.getParentPasswordInput().sendKeys(newPassword);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessage().getText();
        Assert.assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newPasswordCheck = settingsPage.getParentPassword().getText();
        Assert.assertEquals(newPasswordCheck, "...........");
    }

    @Test
    public void changeKidName() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getKidsTab().click();
        settingsPage.getFirstKidNameChangeButton().click();
        String newName = "a";

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(settingsPage.getFirstKidNameInput()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        settingsPage.getFirstKidNameInput().sendKeys(newName);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessageKidTab().getText();
        Assert.assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newNameCheck = settingsPage.getFirstKidName().getText();
        Assert.assertEquals(newNameCheck, "Kristinaa");
        settingsPage.getFirstKidNameChangeButton().click();
        settingsPage.getFirstKidNameInput().sendKeys(Keys.BACK_SPACE);
        settingsPage.getSubmitButton().click();
    }

    @Test
    public void changeKidSurname() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getKidsTab().click();
        settingsPage.getFirstKidSurnameChangeButton().click();
        String newSurname = "a";
        settingsPage.getFirstKidSurnameInput().sendKeys(newSurname);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessageKidTab().getText();
        Assert.assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newSurnameCheck = settingsPage.getFirstKidSurname().getText();
        Assert.assertEquals(newSurnameCheck, "a");
        settingsPage.getFirstKidSurnameChangeButton().click();
        settingsPage.getFirstKidSurnameInput().sendKeys(Keys.BACK_SPACE);
        settingsPage.getSubmitButton().click();
    }

    @Test
    public void changeKidClass() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getKidsTab().click();
        settingsPage.getFirstKidClassChangeButton().click();
        settingsPage.getClassDropDown().click();
        settingsPage.getSecondClassFromDropDown().click();
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessageKidTab().getText();
        Assert.assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newKidClass = settingsPage.getFirstKidClass().getText();
        Assert.assertEquals(newKidClass, "2");
        settingsPage.getFirstKidClassChangeButton().click();
        settingsPage.getClassDropDown().click();
        settingsPage.getFirstClassFromDropDown().click();
        settingsPage.getSubmitButton().click();
    }
}

