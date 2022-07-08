package pages.parentPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParentDashboard {
    @FindBy(
            css = "a.logout"
    )
    private WebElement logoutButton;
    @FindBy(
            xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-dashboard/div[1]/h1"
    )
    private WebElement dashboardTitle;
    @FindBy(
            xpath = "/html/body/app-root/app-layout-parent/div/div[2]/app-parent-menu/nav/ul/li[1]/a"
    )
    private WebElement dashboardLeftMenu;
    @FindBy(
            xpath = "/html/body/app-root/app-layout-parent/div/div[2]/app-parent-menu/nav/ul/li[3]/a"
    )
    private WebElement statistikLeftMenu;
    @FindBy(
            css = "img[alt='Arcadia']"
    )
    private WebElement dashboardLogo;
    @FindBy(
            css = "div.sidebar-content > a.name-user"
    )
    private WebElement parentNameContainingKids;
    @FindBy(
            xpath = "/html/body/app-root/app-layout-parent/div/div[2]/div/div/ul/li[1]/a"
    )
    private WebElement linkToKristinaKidsAccount;
    @FindBy(
            css = "#user-avatar-238 > svg"
    )
    private WebElement svgKristinaAvatar;
    @FindBy(
            xpath = "/html/body/app-root/app-layout-parent/div/div[2]/div/div/div/a[1]"
    )
    private WebElement settingRightMenu;
    @FindBy(
            css = "a#cart"
    )
    private WebElement cartRightMenu;

    public ParentDashboard() {
    }

    public WebElement getLogoutButton() {
        return this.logoutButton;
    }

    public WebElement getDashboardTitle() {
        return this.dashboardTitle;
    }

    public WebElement getDashboardLeftMenu() {
        return this.dashboardLeftMenu;
    }

    public WebElement getStatistikLeftMenu() {
        return this.statistikLeftMenu;
    }

    public WebElement getDashboardLogo() {
        return this.dashboardLogo;
    }

    public WebElement getParentNameContainingKids() {
        return this.parentNameContainingKids;
    }

    public WebElement getLinkToKristinaKidsAccount() {
        return this.linkToKristinaKidsAccount;
    }

    public WebElement getSvgKristinaAvatar() {
        return this.svgKristinaAvatar;
    }

    public WebElement getSettingRightMenu() {
        return this.settingRightMenu;
    }

    public WebElement getCartRightMenu() {
        return this.cartRightMenu;
    }
}
