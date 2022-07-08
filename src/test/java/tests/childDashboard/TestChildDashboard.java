package tests.childDashboard;

import helpers.LogInOutBaseChild;
import helpers.WebDriverContainer1;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChildDashboard;
import pages.parentPages.ParentDashboard;

public class TestChildDashboard extends LogInOutBaseChild {
    public TestChildDashboard() {
    }

    @Test
    public void goToParentsAccount() {
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        childDashboard.getGoToParentDashboardButton().click();
        childDashboard.getParentPassword().sendKeys("zmxncbv12344321");
        childDashboard.getSubmitPasswordToParent().click();
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        String dashboardTitle = parentDashboard.getDashboardTitle().getText();
        Assert.assertEquals(dashboardTitle, "Dashboard");
    }
}
