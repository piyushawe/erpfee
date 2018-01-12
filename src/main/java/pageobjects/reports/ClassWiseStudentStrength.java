package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ClassWiseStudentStrength extends GenericReports {
    @FindBy(linkText = "Class Wise Student Strength")
    private WebElement link;
    @FindBy(id = "Class Wise Student Strength")
    private WebElement frame;

    public ClassWiseStudentStrength(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openClassWiseStudentStrength() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getStudentStrengthSubMenu(), link, frame);
    }

    public void clickDateWise() throws IOException {
        ehandler.click(readFile.getElement("datewise"));
    }

    public void clickSectionWise() throws IOException {
        ehandler.click(readFile.getElement("sectionwise"));
    }

    public void clickNewStudents() throws IOException {
        ehandler.click(readFile.getElement("newstudents"));
    }
}