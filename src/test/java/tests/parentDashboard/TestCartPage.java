package tests.parentDashboard;

import helpers.LogInOutBase;
import helpers.WebDriverContainer1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.parentPages.CartPage;
import pages.parentPages.ParentDashboard;
import pages.parentPages.SettingsPage;

public class TestCartPage extends LogInOutBase {
    public TestCartPage() {
    }

    @Test
    public void deleteSubscription() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);
        CartPage cartPage = PageFactory.initElements(WebDriverContainer1.getDriver(), CartPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getSubscriptionsTab().click();
        settingsPage.getSubscriptionForMark().click();
        settingsPage.getOneMonthRadioButton().click();
        settingsPage.getAddToCartButtonOnPopUp().click();

        String addedToCartMessage = settingsPage.getAddedToCartMessage().getText();
        Assert.assertEquals(addedToCartMessage, "in den Warenkorb hinzugefügt.");

        settingsPage.getToCartButton().click();
        Assert.assertTrue(cartPage.getSubscriptionDiv().isDisplayed());
        cartPage.getDeleteSubscriptionButton().click();

        String cartIsEmptyMessage = cartPage.getCartIsEmpty().getText();
        Assert.assertEquals(cartIsEmptyMessage, "Der Warenkorb ist leer");
    }

    @Test
    public void goToPayment() {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(), SettingsPage.class);
        CartPage cartPage = PageFactory.initElements(WebDriverContainer1.getDriver(), CartPage.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(10));

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getSubscriptionsTab().click();
        settingsPage.getSubscriptionForMark().click();
        settingsPage.getOneMonthRadioButton().click();
        settingsPage.getAddToCartButtonOnPopUp().click();

        String addedToCartMessage = settingsPage.getAddedToCartMessage().getText();
        Assert.assertEquals(addedToCartMessage, "in den Warenkorb hinzugefügt.");

        settingsPage.getToCartButton().click();
        Assert.assertTrue(cartPage.getSubscriptionDiv().isDisplayed());

        cartPage.getGoToPaymentButton().click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(cartPage.getPaymentSubmitButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(cartPage.getErrorMessage()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        Assert.assertTrue(cartPage.getErrorMessage().isDisplayed());
        String errorMessage = cartPage.getErrorMessage().getText();
        Assert.assertEquals(errorMessage, "Ihre Kartennummer ist unvollständig.");
        cartPage.getCrossOnPopUp().click();
    }
}

