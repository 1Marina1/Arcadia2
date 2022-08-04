package pages.mathElements.math1Pages;

import io.perfeccionista.framework.Web;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math1119Page {
    @FindBy(css = "div > div:nth-child(19) > a.second")
    private WebElement task1119;

    @FindBy(css = "div.todo-list")
    private WebElement taskDiv;

    @FindBy(css = "app-header-tasks > div > div > p > span")
    private WebElement parameter;

    @FindBy(css = "div.cdk-drop-list.wallet")
    private WebElement dropSection;

    @FindBy(css = "div > button:nth-child(2)")
    private WebElement submitButton;

    public WebElement getTask1119() {
        return task1119;
    }
    public WebElement getTaskDiv() {
        return taskDiv;
    }
    public WebElement getParameter() {
        return parameter;
    }
    public WebElement getDropSection() {
        return dropSection;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
}
