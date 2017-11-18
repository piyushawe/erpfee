package pageobjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class ChequeClearingStatusReport extends GenericReports {
    @FindBy(linkText = "Cheque Clearing Status Report")WebElement link;
    @FindBy(id = "Cheque Clearing Status Report")WebElement frame;

    public ChequeClearingStatusReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\ChequeClearingStatusReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openChequeClearingStatusReport() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }

    private void getChequeDetailsElements() throws IOException {
        element= readFile.getElement(f1, "chequedetails");
        clear= readFile.getElement(f1, "chequedetailsclear");
        values= readFile.getElement(f1, "chequedetailsvalueslist");
        close= readFile.getElement(f1, "chequedetailsclose");
    }

    private void getBankNameElements() throws IOException {
        element= readFile.getElement(f1, "bankname");
        clear= readFile.getElement(f1, "banknameclear");
        values= readFile.getElement(f1, "banknamevalueslist");
        close= readFile.getElement(f1, "banknameclose");
        message= readFile.getElement(f1, "banknamemessage");
    }

    public void validateBankName() throws IOException {
        getBankNameElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(file, "bankname"));
    }

    public void selectBankName() throws IOException {
        getBankNameElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectChequeDetails() throws IOException {
        getChequeDetailsElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectClearingStatus(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1,"clearingstatus"), index);
    }
}
