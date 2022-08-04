package pages.mathElements.math1Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math1117Page {

    @FindBy(css = "div > div:nth-child(17) > a.second")
    private WebElement task1117;

    @FindBy(css = "div.todo-list > div")
    private WebElement taskDiv;

    @FindBy(css = "div.even-list > div")
    private WebElement evenDropSection;

    @FindBy(css = "div.odd-list > div")
    private WebElement oddDropSection;

    @FindBy(css = "button.btn-question")
    private WebElement submitButton;

    public WebElement getTaskDiv() {
        return taskDiv;
    }
    public WebElement getTask1117() {
        return task1117;
    }
    public WebElement getEvenDropSection() {
        return evenDropSection;
    }
    public WebElement getOddDropSection() {
        return oddDropSection;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
}
