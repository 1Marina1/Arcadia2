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

    @FindBy(css = "div.card-body.well-done")
    private WebElement wellDonePicture;

    @FindBy(css = "app-pupil-dashboard > section > div > div:nth-child(1) > a")
    private WebElement mathSubject;

    @FindBy(css = "div.list-subjects > ng-scrollbar > div > div > div > div > div:nth-child(1) > div:nth-child(1) > a")
    private WebElement firstUnitFirstClass;

    @FindBy(css = "a[href = '/de/pupil/subjects/math/2']")
    private WebElement secondClassTab;

    @FindBy(css = "div:nth-child(1) > div:nth-child(1) > a[href = '/de/pupil/subjects/math/2/2']")
    private WebElement firstUnitSecondClass;




    public WebElement getFirstUnitFirstClass() {return firstUnitFirstClass;}
    public WebElement getMathSubject() {return mathSubject;}
    public WebElement getLogOutButtonChildDashboard() {
        return logOutButtonChildDashboard;
    }
    public WebElement getGoToParentDashboardButton() {
        return goToParentDashboardButton;
    }
    public WebElement getParentPassword() {
        return parentPassword;
    }
    public WebElement getSubmitPasswordToParent() {
        return submitPasswordToParent;
    }
    public WebElement getWellDonePicture() {
        return wellDonePicture;
    }
    public WebElement getSecondClassTab() {
        return secondClassTab;
    }
    public WebElement getFirstUnitSecondClass() {
        return firstUnitSecondClass;
    }
}
