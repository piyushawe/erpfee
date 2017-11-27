package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class DailyFeeCollectionAccountWise extends GenericReports {
    @FindBy(linkText = "Daily Fee Collection Account Wise")private WebElement link;
    @FindBy(id = "Daily Fee Collection Account Wise")private WebElement frame;

    public DailyFeeCollectionAccountWise(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\DailyFeeCollectionAccountWise.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openDailyFeeCollectionDateWise() throws IOException {
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
    }

    private void getBankNameElements() throws IOException {
        element= readFile.getElement(f1, "bankname");
        clear= readFile.getElement(f1, "banknameclear");
        values= readFile.getElement(f1, "banknamevalueslist");
        close= readFile.getElement(f1, "banknameclose");
        message= readFile.getElement(f1, "banknamemessage");
    }

    private void getChequeDetailsElements() throws IOException {
        element= readFile.getElement(f1, "chequedetails");
        clear= readFile.getElement(f1, "chequedetailsclear");
        values= readFile.getElement(f1, "chequedetailsvalueslist");
        close= readFile.getElement(f1, "chequedetailsclose");
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
}