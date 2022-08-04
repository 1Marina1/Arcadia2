package pages.mathElements.math1Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math1116Page {

    @FindBy(css = "div > div:nth-child(16) > a.second")
    private WebElement task1116;

    @FindBy(xpath = "//app-odd-even/form/div/div[1]")
    private WebElement taskDiv;

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

    @FindBy(xpath = "//app-odd-even/form/div/div[3]")
    private WebElement inputs;

    public WebElement getTask1116() {
        return task1116;
    }
    public WebElement getTaskDiv() {
        return taskDiv;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
    public WebElement getFourthInput() {
        return fourthInput;
    }
    public WebElement getThirdInput() {
        return thirdInput;
    }
    public WebElement getSecondInput() {
        return secondInput;
    }
    public WebElement getFirstInput() {
        return firstInput;
    }
    public WebElement getInputs() {
        return inputs;
    }
}
