package pages.mathElements.math1Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math1114Page {

    @FindBy(css = "div > div:nth-child(14) > a.second")
    private WebElement task1114;

    @FindBy(css = "div.body-question")
    private WebElement taskBody;

    @FindBy(css = "app-header-tasks > div > div > p > span")
    private WebElement taskParameter;

    @FindBy(css = "button.btn-question")
    private WebElement submitButton;

    public WebElement getTask1114() {
        return task1114;
    }
    public WebElement getTaskParameter() {
        return taskParameter;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
    public WebElement getTaskBody() {
        return taskBody;
    }
}
