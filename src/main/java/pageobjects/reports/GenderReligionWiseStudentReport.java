package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class GenderReligionWiseStudentReport extends GenericReports {
    @FindBy(linkText = "Gender/Religion Wise Student Report")
    private WebElement link;
    @FindBy(id = "Gender/Religion Wise Student Report")
    private WebElement frame;

    public GenderReligionWiseStudentReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openGenderReligionWiseStudentReport() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void selectReligion(int religion) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("religion"), religion);
    }

    public void selectGender(int gender) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("gender"), gender);
    }
}