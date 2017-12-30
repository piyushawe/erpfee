package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class StaffWardListReport extends GenericReports {
    @FindBy(linkText = "Staff Ward List Report")private WebElement link;
    @FindBy(id="Staff Ward List Report")private WebElement frame;

    public StaffWardListReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openStaffWardListReport() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void selectStaffType(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("stafftype"), index);
    }

    public void selectStaffName(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("staffname"), index);
    }
}