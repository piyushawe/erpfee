package pageObjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class AnnualStudentLedger3 extends GenericReports {
    @FindBy(linkText = "Annual Student Ledger 3")private WebElement link;
    @FindBy(id = "Annual Student Ledger 3")private WebElement frame;

    public AnnualStudentLedger3(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\AnnualStudentLedger3.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openAnnualStudentLedger3() throws IOException {
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "ledgerreportssubmenu"), link, frame);
    }

}
