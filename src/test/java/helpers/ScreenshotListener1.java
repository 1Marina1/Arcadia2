package helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ScreenshotListener1 implements ITestListener {

    public void onTestFailure(ITestResult result) {
        File screenshot = ((TakesScreenshot)WebDriverContainer1.getDriver()).getScreenshotAs(OutputType.FILE);
        String fileName = result.getName() + "screenshot.png";
        File destFile = new File("/Users/HP/Desktop/Screenshots/" + fileName);

        try {
            FileUtils.copyFile(screenshot, destFile);
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }
}
