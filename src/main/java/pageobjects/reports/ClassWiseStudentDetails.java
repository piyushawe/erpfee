package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ClassWiseStudentDetails extends GenericReports {
    @FindBy(linkText = "Class Wise Student Details")private WebElement link;
    @FindBy(id="Class Wise Student Details")private WebElement frame;

    public ClassWiseStudentDetails(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openClassWiseStudentDetails() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void selectDayScholarBoarding() throws IOException {
        ehandler.click(readFile.getElement("dayscholarboarding"));
    }

    public void selectShowRollNo() throws IOException {
        ehandler.click(readFile.getElement("rollno"));
    }
}