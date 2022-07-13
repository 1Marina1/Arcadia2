package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChildDashboard {
    @FindBy(css = "a.logout.d-flex")
    private WebElement logOutButtonChildDashboard;

    @FindBy(xpath = "/html/body/app-root/app-layout-pupil/div/div[2]/div/div/div[2]/a")
    private WebElement goToParentDashboardButton;

    @FindBy(css = "#mat-input-0")
    private WebElement parentPassword;

    @FindBy(css = "button[type ='submit']")
    private WebElement submitPasswordToParent;

    @FindBy(css = "#svg-avatar-happy")
    private WebElement wellDonePicture;

    @FindBy(css = "app-pupil-dashboard > section > div > div:nth-child(1) > a")
    private WebElement mathSubject;

    @FindBy(css = "div.list-subjects > ng-scrollbar > div > div > div > div > div:nth-child(1) > div:nth-child(1) > a")
    private WebElement firstUnit;


    public WebElement getFirstUnit() {return firstUnit;}
    public WebElement getMathSubject() {return mathSubject;}
    public WebElement getLogOutButtonChildDashboard() {
        return this.logOutButtonChildDashboard;
    }
    public WebElement getGoToParentDashboardButton() {
        return this.goToParentDashboardButton;
    }
    public WebElement getParentPassword() {
        return this.parentPassword;
    }
    public WebElement getSubmitPasswordToParent() {
        return this.submitPasswordToParent;
    }
    public WebElement getWellDonePicture() {
        return this.wellDonePicture;
    }
}
