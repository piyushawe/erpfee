package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class MidYearStudentDetails extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Mid Year Student Details')]")private WebElement link;
    @FindBy(id="Mid Year Student Details")private WebElement frame;

    public MidYearStudentDetails(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openMidYearStudentDetails() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }
}
