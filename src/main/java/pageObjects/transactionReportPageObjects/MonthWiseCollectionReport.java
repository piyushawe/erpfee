package pageObjects.transactionReportPageObjects;

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

    public MonthWiseCollectionReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\MonthWiseCollectionReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openMonthWiseCollectionReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
    }

    public void selectInstallment(String inst) throws IOException {
        ehandler.selectByVisibleText(readFile.getElement(f1, "installment"), inst);
    }

    public void validateInstallment() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(file, "installment"), readFile.getElement(f1, "installmentmessage"));
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
}
