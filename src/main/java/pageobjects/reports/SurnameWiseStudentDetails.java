package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class SurnameWiseStudentDetails extends GenericReports {
    @FindBy(linkText = "Surname Wise Student Details")
    private WebElement link;
    @FindBy(id = "Surname Wise Student Details")
    private WebElement frame;

    public SurnameWiseStudentDetails(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openSurnameWiseStudentDetails() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    private void getStudentDetailsElements() throws IOException {
        element = readFile.getElement("studentdetails");
        clear = readFile.getElement("studentdetailsclear");
        values = readFile.getElement("studentdetailsvalueslist");
        close = readFile.getElement("studentdetailsclose");
    }

    public void selectStudentDetails() throws IOException {
        getStudentDetailsElements();
        ehandler.selectValue(element, clear, values, close);
    }
}
