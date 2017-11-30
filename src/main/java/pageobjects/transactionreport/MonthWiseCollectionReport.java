package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class MonthWiseCollectionReport extends GenericReports {
    @FindBy(linkText = "Month Wise Collection Report")
    WebElement link;
    @FindBy(id = "Month Wise Collection Report")
    WebElement frame;

    public MonthWiseCollectionReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openMonthWiseCollectionReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "collectionsubmenu"), link, frame);
    }

    @Override
    public void validateInstallment() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(fileUI, "Installment"), readFile.getElement(f1, "installmentmessage"));
    }

    private void getMonthElements() throws IOException {
        element = readFile.getElement("month");
        clear = readFile.getElement("monthclear");
        values = readFile.getElement("monthvalueslist");
        close = readFile.getElement("monthclose");
        message = readFile.getElement("monthmessage");
    }

    private void getBankNameElements() throws IOException {
        element = readFile.getElement("bankname");
        clear = readFile.getElement("banknameclear");
        values = readFile.getElement("banknamevalueslist");
        close = readFile.getElement("banknameclose");
        message = readFile.getElement("banknamemessage");
    }

    public void validateMonth() throws IOException {
        getMonthElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "month"));
    }

    public void selectMonth() throws IOException {
        getMonthElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void validateBankName() throws IOException {
        getBankNameElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "bankname"));
    }

    public void selectBankName() throws IOException {
        getBankNameElements();
        ehandler.selectValue(element, clear, values, close);
    }
}