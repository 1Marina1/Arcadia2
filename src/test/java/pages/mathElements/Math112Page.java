package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math112Page {

    @FindBy(css = "div > div:nth-child(2) > a.second")
    private WebElement task112;

    @FindBy(css = "div.body-question")
    private WebElement taskBody;

    @FindBy(css = "button.btn-question")
    private WebElement submitButton;

    public WebElement getTask112() { return task112;}
    public WebElement getTaskBody() {
        return this.taskBody;
    }
    public WebElement getSubmitButton() {
        return this.submitButton;
    }
}

