package pages.mathElements.math1Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math1113Page {

    @FindBy(css = "div > div:nth-child(13) > a.second")
    private WebElement task1113;

    @FindBy(css = "div.body-question")
    private WebElement taskBody;

    @FindBy(css = "input[formcontrolname = 'one']")
    private WebElement firstInput;

    @FindBy(css = "input[formcontrolname = 'two']")
    private WebElement secondInput;

    @FindBy(css = "input[formcontrolname = 'three']")
    private WebElement thirdInput;

    @FindBy(css = "input[formcontrolname = 'four']")
    private WebElement fourthInput;

    @FindBy(css = "button.btn-question")
    private WebElement submitButton;

    public WebElement getTask1113() {
        return task1113;
    }
    public WebElement getTaskBody() {
        return taskBody;
    }
    public WebElement getFirstInput() {
        return firstInput;
    }
    public WebElement getSecondInput() {
        return secondInput;
    }
    public WebElement getThirdInput() {
        return thirdInput;
    }
    public WebElement getFourthInput() {
        return fourthInput;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
}
