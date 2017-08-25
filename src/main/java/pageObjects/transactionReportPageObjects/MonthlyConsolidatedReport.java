package pageObjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class MonthlyConsolidatedReport extends GenericReports {
    @FindBy(linkText = "Monthly Consolidated Report")WebElement link;
    @FindBy(id = "Monthly Consolidated Report")WebElement frame;

    public MonthlyConsolidatedReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\MonthlyConsolidatedReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openMonthlyConsolidatedReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
    }

    public void validateMonth() throws IOException {
        WebElement month= readFile.getElement(f1, "month");
        clear= readFile.getElement(f1, "monthclear");
        close= readFile.getElement(f1, "monthclose");
        message= readFile.getElement(f1, "monthmessage");
        verify.verifyValidationOnMultiSelect(month, clear, close, message, readFile.readProperty(file, "month"));
    }

    public void validateBankName() throws IOException {
        WebElement bname= readFile.getElement(f1, "bankname");
        clear= readFile.getElement(f1, "banknameclear");
        close= readFile.getElement(f1, "banknameclose");
        message= readFile.getElement(f1, "banknamemessage");
        verify.verifyValidationOnMultiSelect(bname, clear, close, message, readFile.readProperty(file, "bankname"));
    }

    public void validateChequeBank() throws IOException {
        WebElement chqbank= readFile.getElement(f1, "chequebank");
        clear= readFile.getElement(f1, "chequebankclear");
        close= readFile.getElement(f1, "chequebankclose");
        message= readFile.getElement(f1, "chequebankmessage");
        verify.verifyValidationOnMultiSelect(chqbank, clear, close, message, readFile.readProperty(file, "chequebank"));
    }

    private void getCollectionList(){
        HashMap<String, Integer>radioList= new HashMap<String, Integer>();

    }

    public void clickCollectionBase(String value) throws IOException {
        ehandler.clickRadioButton(readFile.getElements(f1, "radiobuttongroup"), value);
    }
}
