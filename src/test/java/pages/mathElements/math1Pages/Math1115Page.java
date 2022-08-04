package pages.mathElements.math1Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math1115Page {

    @FindBy(css = "div > div:nth-child(15) > a.second")
    private WebElement task1115;

    @FindBy(css = "div.body-question")
    private WebElement taskDiv;

    public WebElement getTask1115() {
        return task1115;
    }

    public WebElement getTaskDiv() {
        return taskDiv;
    }
}
