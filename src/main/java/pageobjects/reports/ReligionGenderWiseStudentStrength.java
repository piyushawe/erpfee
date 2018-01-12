package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ReligionGenderWiseStudentStrength extends GenericReports {
    @FindBy(linkText = "Religion / Gender Wise Student Strength")
    private WebElement link;
    @FindBy(id = "Religion / Gender Wise Student Strength")
    private WebElement frame;

    public ReligionGenderWiseStudentStrength(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openReligionGenderWiseStudentStrength() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getStudentStrengthSubMenu(), link, frame);
    }

    public void clickSectionWise() throws IOException {
        if (!readFile.getElement("sectionwise").isSelected())
        ehandler.click(readFile.getElement("sectionwise"));
    }
}