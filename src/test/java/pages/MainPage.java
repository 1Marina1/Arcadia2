package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(
            css = "a > img.logo"
    )
    private WebElement headerLogo;
    @FindBy(
            xpath = "/html/body/app-root/app-layout/app-header/nav/div[1]/div[1]/app-top-menu/div/ul/li[1]/a"
    )
    private WebElement aboutUsHeaderLink;
    @FindBy(
            xpath = "/html/body/app-root/app-layout/app-header/nav/div[1]/div[1]/app-top-menu/div/ul/li[2]"
    )
    private WebElement myAccountHeaderLink;
    @FindBy(
            css = ".create-account > a"
    )
    private WebElement createAccountHeaderButton;
    @FindBy(
            xpath = "/html/body/app-root/app-layout/app-layout/section[6]/div/div[2]/a"
    )
    private WebElement createAccountFooterButton;
    @FindBy(
            xpath = "/html/body/app-root/app-layout/app-layout/section[1]/div[1]/h1"
    )
    private WebElement titleTextMainPage;
    @FindBy(
            css = "section.login > mat-card > mat-card-title"
    )
    private WebElement loginCardTitle;
    @FindBy(
            css = "mat-card > div > div > div > div > mat-card-title"
    )
    private WebElement registrationCardTitle;
    @FindBy(
            css = "div.social-network.d-xl-block > a"
    )
    private WebElement instagramFooterIcon;
    @FindBy(
            xpath = "/html/body/app-root/app-layout/app-footer-front/section/div/div/div[4]/div/a"
    )
    private WebElement subscribeToInstagramButton;
    @FindBy(
            xpath = "/html/body/app-root/app-layout/app-footer-front/footer/div/div/div[2]/ul/li[1]/a"
    )
    private WebElement impressum;
    @FindBy(
            css = "div:nth-child(2) > ul > li:nth-child(2) > a"
    )
    private WebElement datenschutz;
    @FindBy(
            css = "body > app-root > app-layout > div > app-imprint > div > h1"
    )
    private WebElement impressumPageTitle;
    @FindBy(
            xpath = "/html/body/app-root/app-layout/div/app-data-protection/div/h1"
    )
    private WebElement datenschutzPageTitle;
    @FindBy(
            css = "app-localization > button"
    )
    private WebElement languageSwitcher;
    @FindBy(
            css = "div > button:nth-child(1)"
    )
    private WebElement languageSwitcherToDE;
    @FindBy(
            css = "div > button:nth-child(2)"
    )
    private WebElement languageSwitcherToEN;
    @FindBy(
            css = "img[alt='Arcadia'].d-none.d-xl-inline.h-100.w-auto"
    )
    private WebElement pictureWithChildren;
    @FindBy(
            css = "div.cdk-overlay-backdrop.cdk-overlay-transparent-backdrop"
    )
    private WebElement overlay;
    @FindBy(
            css = "#cdk-overlay-1.cdk-overlay-pane"
    )
    private WebElement overlay2;


    public WebElement getHeaderLogo() {
        return this.headerLogo;
    }

    public WebElement getAboutUsHeaderLink() {
        return this.aboutUsHeaderLink;
    }

    public WebElement getMyAccountHeaderLink() {
        return this.myAccountHeaderLink;
    }

    public WebElement getCreateAccountHeaderButton() {
        return this.createAccountHeaderButton;
    }

    public WebElement getCreateAccountFooterButton() {
        return this.createAccountFooterButton;
    }

    public WebElement getTitleTextMainPage() {
        return this.titleTextMainPage;
    }

    public WebElement getLoginCardTitle() {
        return this.loginCardTitle;
    }

    public WebElement getRegistrationCardTitle() {
        return this.registrationCardTitle;
    }

    public WebElement getInstagramFooterIcon() {
        return this.instagramFooterIcon;
    }

    public WebElement getSubscribeToInstagramButton() {
        return this.subscribeToInstagramButton;
    }

    public WebElement getDatenschutz() {
        return this.datenschutz;
    }

    public WebElement getImpressum() {
        return this.impressum;
    }

    public WebElement getImpressumPageTitle() {
        return this.impressumPageTitle;
    }

    public WebElement getDatenschutzPageTitle() {
        return this.datenschutzPageTitle;
    }

    public WebElement getLanguageSwitcher() {
        return this.languageSwitcher;
    }

    public WebElement getLanguageSwitcherToDE() {
        return this.languageSwitcherToDE;
    }

    public WebElement getLanguageSwitcherToEN() {
        return this.languageSwitcherToEN;
    }

    public WebElement getPictureWithChildren() {
        return this.pictureWithChildren;
    }

    public WebElement getOverlay2() {
        return this.overlay2;
    }

    public WebElement getOverlay() {
        return this.overlay;
    }
}

