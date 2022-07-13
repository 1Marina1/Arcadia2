package tests.math1;

import helpers.LogInOutBaseChild;
import helpers.PressAnswer;
import helpers.WebDriverContainer1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.ChildDashboard;
import pages.mathElements.Math114Page;

import java.time.Duration;
import java.util.List;

public class Math114 extends LogInOutBaseChild {
    @Test
    public void math114(){
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        Math114Page math114Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math114Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnit()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math114Page.getTask114()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(math114Page.getTaskBody()));
        WebElement taskBody = math114Page.getTaskBody();
        WebElement taskSections = math114Page.getTaskSectionsDiv();
        List<WebElement> sections = taskSections.findElements(By.tagName("section"));

        String parameter = math114Page.getTaskParameter().getText();
        Actions builder = new Actions(WebDriverContainer1.getDriver());

        switch (parameter){
            case "Eichhörnchen":
                List<WebElement> objects = taskBody.findElements(By.cssSelector("img[src = '/assets/resources/things/squirrel.svg']"));
                for (int i = 0; i < objects.size(); i++ ){
                    for (int k = 0; k < sections.size(); k++ ){
                        WebElement fromElement = objects.get(i);
                        WebElement toElement = sections.get(k);
                        Action dragAndDrop = builder.clickAndHold(fromElement)
                                .moveToElement(toElement)
                                .release(toElement)
                                .build();
                        dragAndDrop.perform();
                    }
                }
                int answer = objects.size();
                switch (answer){
                    case 1 -> pressAnswer.answerOne();
                    case 2 -> pressAnswer.answerTwo();
                    case 3 -> pressAnswer.answerThree();
                    case 4 -> pressAnswer.answerFour();
                    case 5 -> pressAnswer.answerFive();
                }
            case "Medaillen":
                List<WebElement> objects1 = taskBody.findElements(By.cssSelector("img[src = '/assets/resources/things/medal.svg']"));
                for (WebElement webElement : objects1) {
                    for (WebElement section : sections) {
                        Action dragAndDrop = builder.clickAndHold(webElement)
                                .moveToElement(section)
                                .release(section)
                                .build();
                        dragAndDrop.perform();
                    }
                }
                int answer1 = objects1.size();
                switch (answer1){
                    case 1 -> pressAnswer.answerOne();
                    case 2 -> pressAnswer.answerTwo();
                    case 3 -> pressAnswer.answerThree();
                    case 4 -> pressAnswer.answerFour();
                    case 5 -> pressAnswer.answerFive();
                }
            case "Stifte":
                List<WebElement> objects2 = taskBody.findElements(By.cssSelector("img[src = '/assets/resources/things/pencil.svg']"));
                for (int i = 0; i < objects2.size(); i++ ){
                    for (int k = 0; k < sections.size(); k++ ){
                        WebElement fromElement = objects2.get(i);
                        WebElement toElement = sections.get(k);
                        Action dragAndDrop = builder.clickAndHold(fromElement)
                                .moveToElement(toElement)
                                .release(toElement)
                                .build();
                        dragAndDrop.perform();
                    }
                }
                int answer2 = objects2.size();
                switch (answer2) {
                    case 1 -> pressAnswer.answerOne();
                    case 2 -> pressAnswer.answerTwo();
                    case 3 -> pressAnswer.answerThree();
                    case 4 -> pressAnswer.answerFour();
                    case 5 -> pressAnswer.answerFive();
                }
            case "Hunde":
                List<WebElement> objects3 = taskBody.findElements(By.cssSelector("img[src = '/assets/resources/things/dog.svg']"));
                for (int i = 0; i < objects3.size(); i++ ){
                    for (int k = 0; k < sections.size(); k++ ){
                        WebElement fromElement = objects3.get(i);
                        WebElement toElement = sections.get(k);
                        Action dragAndDrop = builder.clickAndHold(fromElement)
                                .moveToElement(toElement)
                                .release(toElement)
                                .build();
                        dragAndDrop.perform();
                    }
                }
                int answer3 = objects3.size();
                switch (answer3) {
                    case 1 -> pressAnswer.answerOne();
                    case 2 -> pressAnswer.answerTwo();
                    case 3 -> pressAnswer.answerThree();
                    case 4 -> pressAnswer.answerFour();
                    case 5 -> pressAnswer.answerFive();
                }
            case "Geschenke":
                List<WebElement> objects4 = taskBody.findElements(By.cssSelector("img[src = '/assets/resources/things/gift.svg']"));
                for (int i = 0; i < objects4.size(); i++ ){
                    for (int k = 0; k < sections.size(); k++ ){
                        WebElement fromElement = objects4.get(i);
                        WebElement toElement = sections.get(k);
                        Action dragAndDrop = builder.clickAndHold(fromElement)
                                .moveToElement(toElement)
                                .release(toElement)
                                .build();
                        dragAndDrop.perform();
                    }
                }
                int answer4 = objects4.size();
                switch (answer4) {
                    case 1 -> pressAnswer.answerOne();
                    case 2 -> pressAnswer.answerTwo();
                    case 3 -> pressAnswer.answerThree();
                    case 4 -> pressAnswer.answerFour();
                    case 5 -> pressAnswer.answerFive();
                }
            case "Flugzeuge":
                List<WebElement> objects5 = taskBody.findElements(By.cssSelector("img[src = '/assets/resources/things/planes.svg']"));
                for (int i = 0; i < objects5.size(); i++ ){
                    for (int k = 0; k < sections.size(); k++ ){
                        WebElement fromElement = objects5.get(i);
                        WebElement toElement = sections.get(k);
                        Action dragAndDrop = builder.clickAndHold(fromElement)
                                .moveToElement(toElement)
                                .release(toElement)
                                .build();
                        dragAndDrop.perform();
                    }
                }
                int answer5 = objects5.size();
                switch (answer5) {
                    case 1 -> pressAnswer.answerOne();
                    case 2 -> pressAnswer.answerTwo();
                    case 3 -> pressAnswer.answerThree();
                    case 4 -> pressAnswer.answerFour();
                    case 5 -> pressAnswer.answerFive();
                }
            case "Tassen":
                List<WebElement> objects6 = taskBody.findElements(By.cssSelector("img[src = '/assets/resources/things/mug.svg']"));
                for (int i = 0; i < objects6.size(); i++ ){
                    for (int k = 0; k < sections.size(); k++ ){
                        WebElement fromElement = objects6.get(i);
                        WebElement toElement = sections.get(k);
                        Action dragAndDrop = builder.clickAndHold(fromElement)
                                .moveToElement(toElement)
                                .release(toElement)
                                .build();
                        dragAndDrop.perform();
                    }
                }
                int answer6 = objects6.size();
                switch (answer6){
                    case 1 -> pressAnswer.answerOne();
                    case 2 -> pressAnswer.answerTwo();
                    case 3 -> pressAnswer.answerThree();
                    case 4 -> pressAnswer.answerFour();
                    case 5 -> pressAnswer.answerFive();
                }
            case "Papageien":
                List<WebElement> objects7 = taskBody.findElements(By.cssSelector("img[src = '/assets/resources/things/parrot.svg']"));
                for (int i = 0; i < objects7.size(); i++ ){
                    for (int k = 0; k < sections.size(); k++ ){
                        WebElement fromElement = objects7.get(i);
                        WebElement toElement = sections.get(k);
                        Action dragAndDrop = builder.clickAndHold(fromElement)
                                .moveToElement(toElement)
                                .release(toElement)
                                .build();
                        dragAndDrop.perform();
                    }
                }
                int answer7 = objects7.size();
                switch (answer7){
                    case 1 -> pressAnswer.answerOne();
                    case 2 -> pressAnswer.answerTwo();
                    case 3 -> pressAnswer.answerThree();
                    case 4 -> pressAnswer.answerFour();
                    case 5 -> pressAnswer.answerFive();
                }
        }

    }
}
