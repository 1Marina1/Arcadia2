package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math118Page {

    @FindBy(css = "div > div:nth-child(8) > a.second")
    private WebElement task118;

    @FindBy(css = "app-header-tasks > div > div > p > span")
    private WebElement taskParameter;

    @FindBy(css = "div#todo")
    private WebElement taskBody;

    @FindBy(css = "div.body-question > div.flex-wrap.justify-content-center")
    private WebElement taskSectionsDiv;


    public WebElement getTaskParameter() {
        return taskParameter;
    }
    public WebElement getTaskBody() {
        return taskBody;
    }
    public WebElement getTaskSectionsDiv() {
        return taskSectionsDiv;
    }
    public WebElement getTask118() {
        return task118;
    }
}
