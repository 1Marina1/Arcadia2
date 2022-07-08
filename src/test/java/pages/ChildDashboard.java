package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChildDashboard {
    @FindBy(
            css = "a.logout.d-flex"
    )
    private WebElement logOutButtonChildDashboard;
    @FindBy(
            xpath = "/html/body/app-root/app-layout-pupil/div/div[2]/div/div/div[2]/a"
    )
    private WebElement goToParentDashboardButton;
    @FindBy(
            css = "#mat-input-0"
    )
    private WebElement parentPassword;
    @FindBy(
            css = "button[type ='submit']"
    )
    private WebElement submitPasswordToParent;
    @FindBy(
            css = "#svg-avatar-happy"
    )
    private WebElement wellDonePicture;


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
