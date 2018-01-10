package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class NationalityWiseStudentStrength extends GenericReports {
    @FindBy(linkText = "Nationality Wise Student Strength")
    private WebElement link;
    @FindBy(id = "Nationality Wise Student Strength")
    private WebElement frame;

    public NationalityWiseStudentStrength(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openNationalityWiseStudentStrength() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void clickSectionWise() throws IOException {
        if (!readFile.getElement("sectionwise").isSelected())
            ehandler.click(readFile.getElement("sectionwise"));
    }

    public void clickGraphicalView() throws IOException {
        ehandler.click(readFile.getElement("graphicalview"));
    }
}