package pages.mathElements.math1Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math1118Page {

    @FindBy(css = "div > div:nth-child(18) > a.second")
    private WebElement task1118;

    @FindBy(css = "app-sending-letters > div > div.row.m-0 > div > div:nth-child(2) > img")
    private WebElement firstAnswer;

    @FindBy(css = "app-sending-letters > div > div.row.m-0 > div > div:nth-child(3) > img")
    private WebElement secondAnswer;

    @FindBy(css = "app-sending-letters > div > div.row.m-0 > div > div:nth-child(4) > img")
    private WebElement thirdAnswer;

    @FindBy(css = "div.row> div > svg > text")
    private WebElement taskDigit;

    @FindBy(css = "div:nth-child(1) > div.numbers")
    private WebElement leftNumber;

    @FindBy(css = "button.btn-question")
    private WebElement submitButton;

    public WebElement getTask1118() {
        return task1118;
    }
    public WebElement getFirstAnswer() {
        return firstAnswer;
    }
    public WebElement getSecondAnswer() {
        return secondAnswer;
    }
    public WebElement getTaskDigit() {
        return taskDigit;
    }
    public WebElement getThirdAnswer() {
        return thirdAnswer;
    }
    public WebElement getLeftNumber() {
        return leftNumber;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
}
