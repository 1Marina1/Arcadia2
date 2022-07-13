package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math111Page {

    @FindBy(css = "div > div:nth-child(1) > a.second.text-decoration-none")
    private WebElement task111;

    @FindBy(css = "app-counting-fingers > form > div")
    private WebElement taskDiv;

    @FindBy(xpath = "//app-counting-fingers/form/div/div[2]/div[1]")
    private WebElement firstSummand;

    @FindBy(xpath = "//app-counting-fingers/form/div/div[2]/div[2]")
    private WebElement secondSummand;

    @FindBy(css = "#forautofocus")
    private WebElement answerFieldInput;

    @FindBy(css = "button.btn-question")
    private WebElement submitButton;


    public WebElement getAnswerFieldInput() {
        return this.answerFieldInput;
    }
    public WebElement getFirstSummand() {
        return this.firstSummand;
    }
    public WebElement getSecondSummand() {
        return this.secondSummand;
    }
    public WebElement getSubmitButton() {
        return this.submitButton;
    }
    public WebElement getTask111() {
        return task111;
    }
    public WebElement getTaskDiv() {
        return taskDiv;
    }
}
