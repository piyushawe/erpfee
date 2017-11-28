package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class MonthlyConsolidatedReport extends GenericReports {
    @FindBy(linkText = "Monthly Consolidated Report")WebElement link;
    @FindBy(id = "Monthly Consolidated Report")WebElement frame;

    public MonthlyConsolidatedReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\MonthlyConsolidatedReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openMonthlyConsolidatedReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "collectionsubmenu"), link, frame);
    }

    private void getMonthElements() throws IOException {
        element= readFile.getElement(f1, "month");
        clear= readFile.getElement(f1, "monthclear");
        values= readFile.getElement(f1, "monthvalueslist");
        close= readFile.getElement(f1, "monthclose");
        message= readFile.getElement(f1, "monthmessage");
    }

    private void getBankNameElements() throws IOException {
        element= readFile.getElement(f1, "bankname");
        clear= readFile.getElement(f1, "banknameclear");
        values= readFile.getElement(f1, "banknamevalueslist");
        close= readFile.getElement(f1, "banknameclose");
        message= readFile.getElement(f1, "banknamemessage");
    }

    private void getChequeBankElements() throws IOException {
        element= readFile.getElement(f1, "chequebank");
        clear= readFile.getElement(f1, "chequebankclear");
        values= readFile.getElement(f1, "chequebankvalueslist");
        close= readFile.getElement(f1, "chequebankclose");
        message= readFile.getElement(f1, "chequebankmessage");
    }

    public void validateMonth() throws IOException {
        getMonthElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "month"));
    }

    public void validateBankName() throws IOException {
        getBankNameElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "bankname"));
    }

    public void validateChequeBank() throws IOException {
        getChequeBankElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "chequebank"));
    }

    public void selectMonth() throws IOException {
        getMonthElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectBankName() throws IOException {
        getBankNameElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectChequebank() throws IOException {
        getChequeBankElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void getCollectionList() throws IOException {
        ehandler.getList(readFile.getElements("radiobuttongroup"));
    }

    public void clickButton(String value) throws IOException {
        ehandler.clickRadioButton(readFile.getElements("radiobuttongroup"), value);
    }

    public void clickCollectionBase(String value) throws IOException {
        ehandler.clickRadioButton(readFile.getElements("radiobuttongroup"), value);
    }
}
