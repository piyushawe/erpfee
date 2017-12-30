package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ChequeClearingStatusReport extends GenericReports {
    @FindBy(linkText = "Cheque Clearing Status Report")WebElement link;
    @FindBy(id = "Cheque Clearing Status Report")WebElement frame;

    public ChequeClearingStatusReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openChequeClearingStatusReport() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getChequeReportsSubmenu(), link, frame);
    }

    private void getChequeDetailsElements() throws IOException {
        element= readFile.getElement("chequedetails");
        clear= readFile.getElement("chequedetailsclear");
        values= readFile.getElement("chequedetailsvalueslist");
        close= readFile.getElement("chequedetailsclose");
    }

    private void getBankNameElements() throws IOException {
        element= readFile.getElement("bankname");
        clear= readFile.getElement("banknameclear");
        values= readFile.getElement("banknamevalueslist");
        close= readFile.getElement("banknameclose");
        message= readFile.getElement("banknamemessage");
    }

    public void validateBankName() throws IOException {
        getBankNameElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "bankname"));
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
        ehandler.selectByIndex(readFile.getElement("clearingstatus"), index);
    }
}