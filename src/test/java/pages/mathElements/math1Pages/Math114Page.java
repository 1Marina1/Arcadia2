package pages.mathElements.math1Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math114Page {

    @FindBy(css = "div > div:nth-child(4) > a.second")
    private WebElement task114;

    @FindBy(css = "app-header-tasks > div > div > p > span")
    private WebElement taskParameter;

    @FindBy(css = "#todo")
    private WebElement taskBody;

    @FindBy(css = "div.footer-question> div:nth-child(1) > div")
    private WebElement answerOne;

    @FindBy(css = "div.footer-question> div:nth-child(2) > div")
    private WebElement answerTwo;

    @FindBy(css = "div.footer-question> div:nth-child(3) > div")
    private WebElement answerThree;

    @FindBy(css = "div.footer-question> div:nth-child(4) > div")
    private WebElement answerFour;

    @FindBy(css = "div.footer-question> div:nth-child(5) > div")
    private WebElement answerFive;

    @FindBy(css = "button.btn-question")
    private WebElement submitButton;

    @FindBy(css = "div.body-question > div.justify-content-center")
    private WebElement taskSectionsDiv;


    public WebElement getTaskParameter() {
        return this.taskParameter;
    }
    public WebElement getTaskBody() {
        return this.taskBody;
    }
    public WebElement getSubmitButton() {
        return this.submitButton;
    }
    public WebElement getAnswerOne() {
        return this.answerOne;
    }
    public WebElement getAnswerFive() {
        return this.answerFive;
    }
    public WebElement getAnswerTwo() {
        return this.answerTwo;
    }
    public WebElement getAnswerThree() {
        return this.answerThree;
    }
    public WebElement getAnswerFour() {
        return this.answerFour;
    }
    public WebElement getTaskSectionsDiv() {
        return this.taskSectionsDiv;
    }
    public WebElement getTask114() {
        return task114;
    }
}

