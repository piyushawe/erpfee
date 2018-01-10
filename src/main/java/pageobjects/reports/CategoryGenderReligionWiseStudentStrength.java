package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class CategoryGenderReligionWiseStudentStrength extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Category / Gender / Religion Wise Student Strength')]")
    WebElement link;
    @FindBy(id = "Category / Gender / Religion Wise Student Strength")
    WebElement frame;

    public CategoryGenderReligionWiseStudentStrength(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openCategoryGenderReligionWiseStudentStrength() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getStudentStrengthSubMenu(), link, frame);
    }
}