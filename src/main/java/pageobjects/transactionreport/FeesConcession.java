package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class FeesConcession extends GenericReports {
    @FindBy(linkText = "Fees Concession")
    WebElement link;
    @FindBy(id = "Fees Concession")
    WebElement frame;

    public FeesConcession(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openFeesConcession() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getConcessionReportsSubMenu(), link, frame);
    }

    public void getConcessionElements() throws IOException {
        element = readFile.getElement("concession");
        clear = readFile.getElement("concessionclear");
        values = readFile.getElement("concessionvalueslist");
        close = readFile.getElement("concessionclose");
    }

    public void validateConcession() throws IOException {
        getConcessionElements();
        verify.verifyValidationOnMultiSelect(readFile.readProperty(fileUI, "concession"));
    }

    public void selectConcession() throws IOException {
        getConcessionElements();
        ehandler.selectValue();
    }

    @Override
    public void validateTillDate() throws IOException {
        verify.verifyValidationOnMultiSelect(readFile.getElement("tilldate"), clr, readFile.getElement("tilldatemessage"), readFile.readProperty(fileUI, "tilldate"));
    }

    @Override
    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("tilldate"), mm, yy, dd);
    }

    public void clickPaidConcession() throws IOException {
        ehandler.click(readFile.getElement("paidconcession"));
    }

    public void clickEntryTime() throws IOException {
        ehandler.click(readFile.getElement("entrytime"));
    }

    public void clickAssigned() throws IOException {
        ehandler.click(readFile.getElement("assigned"));
    }
}