package pages.parentPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {
    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-settings/div[1]/h1")
    private WebElement settingsTitle;

    @FindBy(xpath = "//app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/div/ul/li[1]/a")
    private WebElement generalTab;

    @FindBy(xpath = "//app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/div/ul/li[2]/a")
    private WebElement kidsTab;

    @FindBy(xpath = "//app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/div/ul/li[3]/a")
    private WebElement subscriptionsTab;

    @FindBy(xpath = "//div[2]/app-parent-settings-general/div/form/div[1]/div[3]/a")
    private WebElement nameChangeButton;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/app-parent-settings-general/div/form/div[1]/mat-form-field/div/div[1]/div/input")
    private WebElement parentNameInput;

    @FindBy(css = "form > div:nth-child(2) > div.name")
    private WebElement parentName;

    @FindBy(xpath = "//div[2]/app-parent-settings-general/div/form/div[2]/div[3]/a")
    private WebElement surnameChangeButton;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/app-parent-settings-general/div/form/div[2]/mat-form-field/div/div[1]/div/input")
    private WebElement parentSurnameInput;

    @FindBy(css = "body > app-root > app-layout-parent > div > div:nth-child(2) > main > app-parent-settings > div.card.p-0.mt-5 > app-parent-settings-general > div > form > div:nth-child(3) > div.col-6.name.d-md-block.d-none.ng-star-inserted")
    private WebElement parentSurname;

    @FindBy(xpath = "//div[2]/app-parent-settings-general/div/form/div[3]/div[3]/a")
    private WebElement emailChangeButton;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/app-parent-settings-general/div/form/div[3]/mat-form-field/div/div[1]/div/input")
    private WebElement parentEmailInput;

    @FindBy(xpath = "//app-parent-settings-general/div/form/div[3]/div[2]")
    private WebElement parentEmail;

    @FindBy(xpath = "//app-parent-settings-general/div/form/div[3]/div[4]/p/a[2]")
    private WebElement newEmailDeclineButton;

    @FindBy(xpath = "//div[2]/app-parent-settings-general/div/form/div[4]/div[3]/a")
    private WebElement passwordChangeButton;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/app-parent-settings-general/div/form/div[4]/mat-form-field/div/div[1]/div/input")
    private WebElement parentPasswordInput;

    @FindBy(css = "div:nth-child(4) > div.name")
    private WebElement parentPassword;

    @FindBy(css = "form > button")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id='0name']/div[3]/a")
    private WebElement firstKidNameChangeButton;

    @FindBy(xpath = "//*[@id='0name']/div[2]")
    private WebElement firstKidName;

    @FindBy(css = "#mat-input-9")
    private WebElement firstKidNameInput;

    @FindBy(xpath = "//*[@id='0surname']/div[3]/a")
    private WebElement firstKidSurnameChangeButton;

    @FindBy(xpath = "//*[@id='0surname']/div[2]")
    private WebElement firstKidSurname;

    @FindBy(xpath = "//*[@id='0class']/div[3]/a")
    private WebElement firstKidClassChangeButton;

    @FindBy(xpath = "//app-parent-settings-subscription/div/div[3]/div[2]/div/div/div[1]/div/div[3]/a")
    private WebElement subscriptionForMark;

    @FindBy(xpath = "//app-parent-settings-kids/div/form/div[2]/div/p/a")
    private WebElement createNewKidButton;

    @FindBy(xpath = "//form/ngb-alert/strong")
    private WebElement successMessage;

    @FindBy(xpath = "//*[@id='alert']/ngb-alert/strong")
    private WebElement successMessageKidTab;

    @FindBy(css = "#mat-input-19")
    private WebElement firstKidSurnameInput;

    @FindBy(
            xpath = "//*[@id='0class']/mat-form-field/div/div[1]/div"
    )
    private WebElement classDropDown;
    @FindBy(
            xpath = "//*[@id='mat-option-1']"
    )
    private WebElement secondClassFromDropDown;
    @FindBy(
            css = "#mat-option-0"
    )
    private WebElement firstClassFromDropDown;
    @FindBy(
            xpath = "//*[@id='0class']/div[2]"
    )
    private WebElement firstKidClass;
    @FindBy(
            xpath = "/html/body/ngb-modal-window/div/div/div/div/div/mat-radio-group/mat-radio-button[1]/label/span[1]"
    )
    private WebElement oneMonthRadioButton;
    @FindBy(
            xpath = "/html/body/ngb-modal-window/div/div/div/div/div[2]/a/p"
    )
    private WebElement addToCartButtonOnPopUp;
    @FindBy(
            xpath = "/html/body/ngb-modal-window/div/div/div/div/div[2]/a"
    )
    private WebElement addedToCartMessage;
    @FindBy(
            xpath = "/html/body/ngb-modal-window/div/div/div/button"
    )
    private WebElement toCartButton;


    public WebElement getSettingsTitle() {
        return this.settingsTitle;
    }

    public WebElement getGeneralTab() {
        return this.generalTab;
    }

    public WebElement getKidsTab() {
        return this.kidsTab;
    }

    public WebElement getSubscriptionsTab() {
        return this.subscriptionsTab;
    }

    public WebElement getNameChangeButton() {
        return this.nameChangeButton;
    }

    public WebElement getSurnameChangeButton() {
        return this.surnameChangeButton;
    }

    public WebElement getEmailChangeButton() {
        return this.emailChangeButton;
    }

    public WebElement getPasswordChangeButton() {
        return this.passwordChangeButton;
    }

    public WebElement getSubmitButton() {
        return this.submitButton;
    }

    public WebElement getFirstKidClassChangeButton() {
        return this.firstKidClassChangeButton;
    }

    public WebElement getFirstKidNameChangeButton() {
        return this.firstKidNameChangeButton;
    }

    public WebElement getFirstKidNameInput() {
        return this.firstKidNameInput;
    }

    public WebElement getFirstKidSurnameChangeButton() {
        return this.firstKidSurnameChangeButton;
    }

    public WebElement getSubscriptionForMark() {
        return this.subscriptionForMark;
    }

    public WebElement getCreateNewKidButton() {
        return this.createNewKidButton;
    }

    public WebElement getParentEmailInput() {
        return this.parentEmailInput;
    }

    public WebElement getParentNameInput() {
        return this.parentNameInput;
    }

    public WebElement getParentPasswordInput() {
        return this.parentPasswordInput;
    }

    public WebElement getParentSurnameInput() {
        return this.parentSurnameInput;
    }

    public WebElement getSuccessMessage() {
        return this.successMessage;
    }

    public WebElement getParentName() {
        return this.parentName;
    }

    public WebElement getParentSurname() {
        return this.parentSurname;
    }

    public WebElement getParentEmail() {
        return this.parentEmail;
    }

    public WebElement getNewEmailDeclineButton() {
        return this.newEmailDeclineButton;
    }

    public WebElement getParentPassword() {
        return this.parentPassword;
    }

    public WebElement getFirstKidName() {
        return this.firstKidName;
    }

    public WebElement getFirstKidSurname() {
        return this.firstKidSurname;
    }

    public WebElement getSuccessMessageKidTab() {
        return this.successMessageKidTab;
    }

    public WebElement getFirstKidSurnameInput() {
        return this.firstKidSurnameInput;
    }

    public WebElement getClassDropDown() {
        return this.classDropDown;
    }

    public WebElement getSecondClassFromDropDown() {
        return this.secondClassFromDropDown;
    }

    public WebElement getFirstKidClass() {
        return this.firstKidClass;
    }

    public WebElement getOneMonthRadioButton() {
        return this.oneMonthRadioButton;
    }

    public WebElement getAddToCartButtonOnPopUp() {
        return this.addToCartButtonOnPopUp;
    }

    public WebElement getAddedToCartMessage() {
        return this.addedToCartMessage;
    }

    public WebElement getToCartButton() {
        return this.toCartButton;
    }

    public WebElement getFirstClassFromDropDown() {
        return this.firstClassFromDropDown;
    }
}

