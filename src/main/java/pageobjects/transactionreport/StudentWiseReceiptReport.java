package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class StudentWiseReceiptReport extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Student Wise Receipt Report')]")
    WebElement link;
    @FindBy(id = "Student Wise Receipt Report")
    WebElement frame;

    public StudentWiseReceiptReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openStudentWiseReceiptReport() throws IOException {
        ehandler.openFrame(new UIMap().getTransactionReportMenu(), link, frame);
    }

    @Override
    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("todate"), mm, yy, dd);
    }

    public void searchStudent() throws IOException, InterruptedException {
        ehandler.enterText(readFile.getElement("student"), "a");
        Thread.sleep(500);
        ehandler.pressDownArrow(readFile.getElement("student"));
        ehandler.pressEnter(readFile.getElement("student"));
        ehandler.pressEnter(readFile.getElement("student"));
    }
}
