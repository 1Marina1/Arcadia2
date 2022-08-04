package tests.math1;

import helpers.GoToFirstUnit;
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
import pages.mathElements.math1Pages.Math114Page;

import java.time.Duration;
import java.util.List;

public class Math114 extends LogInOutBaseChild {
    @Test
    public void math114(){
        Math114Page math114Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math114Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);
        Actions builder = new Actions(WebDriverContainer1.getDriver());
        GoToFirstUnit goToFirstUnit = PageFactory.initElements(WebDriverContainer1.getDriver(), GoToFirstUnit.class);

        goToFirstUnit.goToFirstUnit();

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math114Page.getTask114()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        List<WebElement> sections = math114Page.getTaskSectionsDiv().findElements(By.cssSelector("section.dropzone"));

        String parameter = math114Page.getTaskParameter().getText();

        switch (parameter){
            case "Eichhörnchen":
                List<WebElement> objects = math114Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/things/squirrel.svg']"));

                for (int i = 0; i < objects.size(); i++) {
                    System.out.println(objects.get(i).getAttribute("src"));
                    for (int k = 0; k < sections.size(); k++) {
                        if (i == k){
                        Action dragAndDrop = builder.clickAndHold(objects.get(i))
                                .moveToElement(sections.get(k))
                                .release(sections.get(k))
                                .build();
                        dragAndDrop.perform();
                            break;
                         }

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
                List<WebElement> objects1 = math114Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/things/medal.svg']"));

                for (int i = 0; i < objects1.size(); i++) {
                    System.out.println(objects1.get(i).getAttribute("src"));
                    for (int k = 0; k < sections.size(); k++) {
                        if (i == k) {
                            Action dragAndDrop = builder.clickAndHold(objects1.get(i))
                                    .moveToElement(sections.get(k))
                                    .release(sections.get(k))
                                    .build();
                            dragAndDrop.perform();
                            break;
                        }
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
                List<WebElement> objects2 = math114Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/things/pencil.svg']"));

                for (int i = 0; i < objects2.size(); i++) {
                    System.out.println(objects2.get(i).getAttribute("src"));
                    for (int k = 0; k < sections.size(); k++) {
                        if (i == k) {
                            Action dragAndDrop = builder.clickAndHold(objects2.get(i))
                                    .moveToElement(sections.get(k))
                                    .release(sections.get(k))
                                    .build();
                            dragAndDrop.perform();
                            break;
                        }
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
                List<WebElement> objects3 = math114Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/things/dog.svg']"));

                for (int i = 0; i < objects3.size(); i++) {
                    System.out.println(objects3.get(i).getAttribute("src"));
                    for (int k = 0; k < sections.size(); k++) {
                        if (i == k) {
                            Action dragAndDrop = builder.clickAndHold(objects3.get(i))
                                    .moveToElement(sections.get(k))
                                    .release(sections.get(k))
                                    .build();
                            dragAndDrop.perform();
                            break;
                        }
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
                List<WebElement> objects4 = math114Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/things/gift.svg']"));

                for (int i = 0; i < objects4.size(); i++) {
                    System.out.println(objects4.get(i).getAttribute("src"));
                    for (int k = 0; k < sections.size(); k++) {
                        if (i == k) {
                            Action dragAndDrop = builder.clickAndHold(objects4.get(i))
                                    .moveToElement(sections.get(k))
                                    .release(sections.get(k))
                                    .build();
                            dragAndDrop.perform();
                            break;
                        }
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
                List<WebElement> objects5 = math114Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/things/planes.svg']"));

                for (int i = 0; i < objects5.size(); i++) {
                    System.out.println(objects5.get(i).getAttribute("src"));
                    for (int k = 0; k < sections.size(); k++) {
                        if (i == k) {
                            Action dragAndDrop = builder.clickAndHold(objects5.get(i))
                                    .moveToElement(sections.get(k))
                                    .release(sections.get(k))
                                    .build();
                            dragAndDrop.perform();
                            break;
                        }
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
                List<WebElement> objects6 = math114Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/things/mug.svg']"));

                for (int i = 0; i < objects6.size(); i++) {
                    System.out.println(objects6.get(i).getAttribute("src"));
                    for (int k = 0; k < sections.size(); k++) {
                        if (i == k) {
                            Action dragAndDrop = builder.clickAndHold(objects6.get(i))
                                    .moveToElement(sections.get(k))
                                    .release(sections.get(k))
                                    .build();
                            dragAndDrop.perform();
                            break;
                        }
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
                List<WebElement> objects7 = math114Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/things/parrot.svg']"));

                for (int i = 0; i < objects7.size(); i++) {
                    System.out.println(objects7.get(i).getAttribute("src"));
                    for (int k = 0; k < sections.size(); k++) {
                        if (i == k) {
                            Action dragAndDrop = builder.clickAndHold(objects7.get(i))
                                    .moveToElement(sections.get(k))
                                    .release(sections.get(k))
                                    .build();
                            dragAndDrop.perform();
                            break;
                        }
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
            default: break;
        }

    }
}
