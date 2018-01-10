package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DateWiseAdmissionReport extends GenericReports {
    @FindBy(linkText = "Date Wise Admission Report")
    private WebElement link;
    @FindBy(id = "Date Wise Admission Report")
    private WebElement frame;

    public DateWiseAdmissionReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDateWiseAdmissionReport() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    private void getOtherDetailsElements() throws IOException {
        element = readFile.getElement("otherdetails");
        clear = readFile.getElement("otherdetailsclear");
        values = readFile.getElement("otherdetailsvalueslist");
        close = readFile.getElement("otherdetailsclose");
    }

    @Override
    public void selectFromDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("fromdate"), mm, yy, dd);
    }

    public void selectOtherDetails() throws IOException {
        getOtherDetailsElements();
        ehandler.selectValue(element, clear, values, close);
    }
}