package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math1112Page {

    @FindBy(css = "div > div:nth-child(12) > a.second")
    private WebElement task1112;

    @FindBy(css = "input[formcontrolname = 'one']")
    private WebElement firstInput;

    @FindBy(css = "form > div > div:nth-child(2) > svg > text")
    private WebElement firstNumber;

    @FindBy(css = "input[formcontrolname = 'two']")
    private WebElement secondInput;

    @FindBy(css = "form > div > div:nth-child(4) > svg:nth-child(1) > text")
    private WebElement secondNumber;

    @FindBy(css = "input[formcontrolname = 'three']")
    private WebElement thirdInput;

    @FindBy(css = "input[formcontrolname = 'four']")
    private WebElement fourthInput;

    @FindBy(css = "input[formcontrolname = 'five']")
    private WebElement fifthInput;

    @FindBy(css = "form > div > div:nth-child(6) > svg > text")
    private WebElement fourthNumber;

    @FindBy(css = "button.btn-question")
    private WebElement submitButton;


    public WebElement getFirstInput() {
        return firstInput;
    }
    public WebElement getFirstNumber() {
        return firstNumber;
    }
    public WebElement getSecondInput() {
        return secondInput;
    }
    public WebElement getSecondNumber() {
        return secondNumber;
    }
    public WebElement getThirdInput() {
        return thirdInput;
    }
    public WebElement getFifthInput() {
        return fifthInput;
    }
    public WebElement getFourthInput() {
        return fourthInput;
    }
    public WebElement getFourthNumber() {
        return fourthNumber;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
    public WebElement getTask1112() {
        return task1112;
    }
}
