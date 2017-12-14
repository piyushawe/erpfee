package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class MonthlyConsolidatedReport extends GenericReports {
    @FindBy(linkText = "Monthly Consolidated Report")WebElement link;
    @FindBy(id = "Monthly Consolidated Report")WebElement frame;

    public MonthlyConsolidatedReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openMonthlyConsolidatedReport() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    private void getMonthElements() throws IOException {
        element= readFile.getElement("month");
        clear= readFile.getElement("monthclear");
        values= readFile.getElement("monthvalueslist");
        close= readFile.getElement("monthclose");
        message= readFile.getElement("monthmessage");
    }

    private void getBankNameElements() throws IOException {
        element= readFile.getElement("bankname");
        clear= readFile.getElement("banknameclear");
        values= readFile.getElement("banknamevalueslist");
        close= readFile.getElement("banknameclose");
        message= readFile.getElement("banknamemessage");
    }

    private void getChequeBankElements() throws IOException {
        element= readFile.getElement("chequebank");
        clear= readFile.getElement("chequebankclear");
        values= readFile.getElement("chequebankvalueslist");
        close= readFile.getElement("chequebankclose");
        message= readFile.getElement("chequebankmessage");
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

    @Override
    public void clickButton(String value) throws IOException {
        ehandler.clickRadioButton(readFile.getElements("radiobuttongroup"), value);
    }

    public void clickCollectionBase(String value) throws IOException {
        ehandler.clickRadioButton(readFile.getElements("radiobuttongroup"), value);
    }
}