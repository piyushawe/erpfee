package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class CategoryGenderWiseStudentStrength extends GenericReports {
    @FindBy(linkText = "Category / Gender Wise Student Strength")
    private WebElement link;
    @FindBy(id = "Category / Gender Wise Student Strength")
    private WebElement frame;

    public CategoryGenderWiseStudentStrength(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openCategoryGenderWiseStudentStrength() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getStudentStrengthSubMenu(), link, frame);
    }

    public void clickDateRange() throws IOException {
        ehandler.click(readFile.getElement("daterange"));
    }

    public void clickSectionWise() throws IOException {
        ehandler.click(readFile.getElement("sectionwise"));
    }
}