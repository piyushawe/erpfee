package pageObjects.transactionReportPageObjects;

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
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\ChequeReportDateWise.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openChequeReportDateWise() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
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
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(file, "chequebank"));
    }

    public void selectChequeBank() throws IOException {
        getChequeBankElements();
        ehandler.selectValue(element, clear, values, close);
    }
}
