package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class AnnualStudentLedger1 extends GenericReports {
    @FindBy(linkText = "Annual Student Ledger 1")private WebElement link;
    @FindBy(id = "Annual Student Ledger 1")private WebElement frame;

    public AnnualStudentLedger1(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openAnnualStudentLedger1() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getFeeLedgerReportsSubmenu(), link, frame);
    }

    public void searchStudent() throws IOException, InterruptedException {
        ehandler.enterText(readFile.getElement("student"), "a");
        Thread.sleep(500);
        ehandler.pressDownArrow(readFile.getElement("student"));
        ehandler.pressEnter(readFile.getElement("student"));
        ehandler.pressEnter(readFile.getElement("student"));
    }
}