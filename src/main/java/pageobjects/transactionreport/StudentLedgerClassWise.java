package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class StudentLedgerClassWise extends GenericReports {
    @FindBy(linkText = "Student Ledger Class Wise")
    WebElement link;
    @FindBy(id = "Student Ledger Class Wise")
    WebElement frame;

    public StudentLedgerClassWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openStudentLedgerClassWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getFeeLedgerReportsSubmenu(), link, frame);
    }

    public void selectStudentStatus(int status) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("studentstatus"), status);
    }

    public void clickFullYearPaidFees() throws IOException {
        ehandler.click(readFile.getElement("fullyearpaidfees"));
    }

    public void clickWithFine() throws IOException {
        ehandler.click(readFile.getElement("withfine"));
    }

    @Override
    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("tilldate"), mm, yy, dd);
    }
}