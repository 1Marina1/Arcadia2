package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math113Page {

    @FindBy(css = "div > div:nth-child(3) > a.second")
    private WebElement task113;

    @FindBy(css = "div.body-question")
    private WebElement taskBody;

    @FindBy(css = "button.btn-question")
    private WebElement submitButton;

    @FindBy(css = "div.footer-question.align-items-center.mb-5> div:nth-child(1) > div")
    private WebElement answerSix;

    @FindBy(css = "div.footer-question.align-items-center.mb-5> div:nth-child(2) > div")
    private WebElement answerSeven;

    @FindBy(css = "div.footer-question.align-items-center.mb-5> div:nth-child(3) > div")
    private WebElement answerEight;

    @FindBy(css = "div.footer-question.align-items-center.mb-5> div:nth-child(4) > div")
    private WebElement answerNine;

    @FindBy(css = "div.footer-question.align-items-center.mb-5> div:nth-child(5) > div")
    private WebElement answerTen;

    public WebElement getTask113() {
        return task113;
    }
    public WebElement getAnswerSix() {
        return this.answerSix;
    }
    public WebElement getAnswerSeven() {
        return this.answerSeven;
    }
    public WebElement getAnswerEight() {
        return this.answerEight;
    }
    public WebElement getAnswerNine() {
        return this.answerNine;
    }
    public WebElement getAnswerTen() {
        return this.answerTen;
    }
    public WebElement getSubmitButton() {
        return this.submitButton;
    }

    public WebElement getTaskBody() {
        return this.taskBody;
    }
}

