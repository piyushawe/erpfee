package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class StaffWardListReport extends GenericReports {
    @FindBy(linkText = "Staff Ward List Report")private WebElement link;
    @FindBy(id="Staff Ward List Report")private WebElement frame;

    public StaffWardListReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\reports\\StaffWardListReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openStaffWardListReport() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "reportsmenu"), link, frame);
    }

    public void selectStaffType(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "stafftype"), index);
    }

    public void selectStaffName(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "staffname"), index);
    }
}
