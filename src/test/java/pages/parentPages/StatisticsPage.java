package pages.parentPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatisticsPage {
    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[1]/h1")
    private WebElement statisticsTitle;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[1]")
    private WebElement kristinaChoosingChild;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[2]")
    private WebElement valentinChoosingChild;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[3]")
    private WebElement markChoosingChild;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[1]/a/p")
    private WebElement kristinaClassDropDown;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[2]/a/p")
    private WebElement valentinClassDropDown;

    @FindBy(xpath = "//app-statistics/mat-button-toggle-group/mat-button-toggle[1]")
    private WebElement dayTabButton;

    @FindBy(xpath = "//app-statistics/mat-button-toggle-group/mat-button-toggle[2]")
    private WebElement weekTabButton;

    @FindBy(xpath = "//app-statistics/mat-button-toggle-group/mat-button-toggle[3]")
    private WebElement monthTabButton;

    @FindBy(xpath = "//app-statistics/mat-button-toggle-group/mat-button-toggle[4]")
    private WebElement allTabButton;

    @FindBy(xpath = "//div/button[1]")
    private WebElement firstClassKristinaFromDropDown;

    @FindBy(xpath = "//div/button[1]")
    private WebElement firstClassValentinFromDropDown;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[1]/ul/li[1]")
    private WebElement tasksChoosingStatistics;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[1]/ul/li[2]")
    private WebElement unitChoosingStatistics;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[1]/ul/li[3]")
    private WebElement subjectChoosingStatistics;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[1]/ul/li[4]")
    private WebElement classChoosingStatistics;

    @FindBy(css = "a.btn-math")
    private WebElement mathTab;

    @FindBy(css = "a.btn-german")
    private WebElement germanTab;

    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-0']/span[1]/mat-panel-description")
    private WebElement unitFromStatistics;

    @FindBy(xpath = "//*[@id='cdk-accordion-child-0']/div/table/tbody/tr[1]/td[3]/div/span[1]")
    private WebElement rightAnswers;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[2]/app-parent-statistics-tasks/div/mat-accordion[1]/mat-expansion-panel/div/div/table/tbody/tr[1]/td[3]/div/span[2]")
    private WebElement wrongAnswers;
    

    public WebElement getStatisticsTitle() {
        return this.statisticsTitle;
    }

    public WebElement getKristinaChoosingChild() {
        return this.kristinaChoosingChild;
    }

    public WebElement getValentinChoosingChild() {
        return this.valentinChoosingChild;
    }

    public WebElement getMarkChoosingChild() {
        return this.markChoosingChild;
    }

    public WebElement getKristinaClassDropDown() {
        return this.kristinaClassDropDown;
    }

    public WebElement getValentinClassDropDown() {
        return this.valentinClassDropDown;
    }

    public WebElement getDayTabButton() {
        return this.dayTabButton;
    }

    public WebElement getWeekTabButton() {
        return this.weekTabButton;
    }

    public WebElement getMonthTabButton() {
        return this.monthTabButton;
    }

    public WebElement getFirstClassKristinaFromDropDown() {
        return this.firstClassKristinaFromDropDown;
    }

    public WebElement getFirstClassValentinFromDropDown() {
        return this.firstClassValentinFromDropDown;
    }

    public WebElement getAllTabButton() {
        return this.allTabButton;
    }

    public WebElement getClassChoosingStatistics() {
        return this.classChoosingStatistics;
    }

    public WebElement getSubjectChoosingStatistics() {
        return this.subjectChoosingStatistics;
    }

    public WebElement getTasksChoosingStatistics() {
        return this.tasksChoosingStatistics;
    }

    public WebElement getUnitChoosingStatistics() {
        return this.unitChoosingStatistics;
    }

    public WebElement getMathTab() {
        return this.mathTab;
    }

    public WebElement getGermanTab() {
        return this.germanTab;
    }

    public WebElement getUnitFromStatistics() {
        return this.unitFromStatistics;
    }

    public WebElement getRightAnswers() {
        return this.rightAnswers;
    }

    public WebElement getWrongAnswers() {
        return this.wrongAnswers;
    }
}
