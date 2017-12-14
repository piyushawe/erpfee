package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class StudentHealthEntryReport extends GenericReports {
    @FindBy(linkText = "Student Health Entry Report")private WebElement link;
    @FindBy(id="Student Health Entry Report")private WebElement frame;

    public StudentHealthEntryReport(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openStudentHealthEntryReport() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }
}
