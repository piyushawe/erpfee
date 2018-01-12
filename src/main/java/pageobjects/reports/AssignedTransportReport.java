package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class AssignedTransportReport extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Assigned Transport Report')]")
    WebElement link;
    @FindBy(id = "Assigned Transport Report")
    WebElement frame;

    public AssignedTransportReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openAssignedTransportReport() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getTransportReportSubMenu(), link, frame);
    }

    private void getMonthElements() throws IOException {
        element = readFile.getElement("month");
        clear = readFile.getElement("monthclear");
        values = readFile.getElement("monthvalueslist");
        close = readFile.getElement("monthclose");
    }

    public void selectMonth() throws IOException {
        getMonthElements();
        ehandler.selectValue();
    }

    public void searchStudent() throws IOException, InterruptedException {
        ehandler.enterText(readFile.getElement("student"), "a");
        Thread.sleep(500);
        ehandler.pressDownArrow(readFile.getElement("student"));
        ehandler.pressEnter(readFile.getElement("student"));
    }
}