package pageobjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class MonthWiseCollectionReport extends GenericReports {
    @FindBy(linkText = "Month Wise Collection Report")WebElement link;
    @FindBy(id = "Month Wise Collection Report")WebElement frame;
    private WebElement element;

    public MonthWiseCollectionReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\MonthWiseCollectionReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openMonthWiseCollectionReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
    }

    public void validateInstallment() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(file, "Installment"), readFile.getElement(f1, "installmentmessage"));
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
    public void validateMonth() throws IOException {
        getMonthElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(file, "month"));
    }

    public void selectMonth() throws IOException {
        getMonthElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void validateBankName() throws IOException {
        getBankNameElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(file, "bankname"));
    }

    public void selectBankName() throws IOException {
        getBankNameElements();
        ehandler.selectValue(element, clear, values, close);
    }
}
