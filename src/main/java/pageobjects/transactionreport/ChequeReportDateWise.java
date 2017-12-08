package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class ChequeReportDateWise extends GenericReports {
    @FindBy(linkText = "Cheque Report Date Wise")WebElement link;
    @FindBy(id = "Cheque Report Date Wise")WebElement frame;

    public ChequeReportDateWise(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openChequeReportDateWise() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "transactionreportmenu"), link, frame);
    }

    private void getChequeBankElements() throws IOException {
        element= readFile.getElement(f1, "chequebank");
        clear= readFile.getElement(f1, "chequebankclear");
        values= readFile.getElement(f1, "chequebankvalueslist");
        close= readFile.getElement(f1, "chequebankclose");
        message= readFile.getElement(f1, "chequebankmessage");
    }

    public void validateChequeBank() throws IOException {
        getChequeBankElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "chequebank"));
    }

    public void selectChequeBank() throws IOException {
        getChequeBankElements();
        ehandler.selectValue(element, clear, values, close);
    }
}
