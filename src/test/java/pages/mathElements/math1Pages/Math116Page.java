package pages.mathElements.math1Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math116Page {
    @FindBy(css = "div > div:nth-child(6) > a.second")
    private WebElement task116;

    @FindBy(css = "div.body-question")
    private WebElement taskDiv;


    public WebElement getTaskDiv() {
        return this.taskDiv;
    }
    public WebElement getTask116() {
        return task116;
    }
}
