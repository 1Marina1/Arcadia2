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
import pages.mathElements.math1Pages.Math118Page;

import java.time.Duration;
import java.util.List;

public class Math118 extends LogInOutBaseChild {

    @Test
    public void math118(){
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        Math118Page math118Page = PageFactory.initElements(WebDriverContainer1.getDriver(), Math118Page.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(15));
        PressAnswer pressAnswer = PageFactory.initElements(WebDriverContainer1.getDriver(), PressAnswer.class);
        Actions builder = new Actions(WebDriverContainer1.getDriver());

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getMathSubject()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(childDashboard.getFirstUnitFirstClass()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element1);

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(math118Page.getTask118()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element2);

        List<WebElement> sections = math118Page.getTaskSectionsDiv().findElements(By.cssSelector("section.dropzone"));

        String parameter = math118Page.getTaskParameter().getText();

        switch (parameter){
            case "gelben":
                List<WebElement> objects = math118Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cubes/5.svg']"));

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
            case "türkisen":
                List<WebElement> objects1 = math118Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cubes/3.svg']"));
                for (int i = 0; i < objects1.size(); i++) {
                    System.out.println(objects1.get(i).getAttribute("src"));
                    for (int k = 0; k < sections.size(); k++) {
                        if (i == k){
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
            case "lila":
                List<WebElement> objects2 = math118Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cubes/2.svg']"));

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
            case "pinken":
                List<WebElement> objects3 = math118Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cubes/1.svg']"));

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
            case "blauen":
                List<WebElement> objects4 = math118Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cubes/6.svg']"));

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
            case "grünen":
                List<WebElement> objects5 = math118Page.getTaskBody().findElements(By.cssSelector("img[src = '/assets/resources/cubes/4.svg']"));

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
            default: break;
        }
    }

}
