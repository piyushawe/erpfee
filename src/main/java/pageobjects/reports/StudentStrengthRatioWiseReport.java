package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class StudentStrengthRatioWiseReport extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Student Strength Ratio Wise Report')]")
    WebElement link;
    @FindBy(id = "Student Strength Ratio Wise Report")
    WebElement frame;

    public StudentStrengthRatioWiseReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openStudentStrengthRatioWiseReport() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getStudentStrengthSubMenu(), link, frame);
    }

    public void clickNewOldStudentStatus() throws IOException {
        ehandler.click(readFile.getElement("newoldstudentstatus"));
    }
}