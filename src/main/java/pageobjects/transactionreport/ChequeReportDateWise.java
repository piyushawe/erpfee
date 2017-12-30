package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ChequeReportDateWise extends GenericReports {
    @FindBy(linkText = "Cheque Report Date Wise")WebElement link;
    @FindBy(id = "Cheque Report Date Wise")WebElement frame;

    public ChequeReportDateWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openChequeReportDateWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getChequeReportsSubmenu(), link, frame);
    }

    private void getChequeBankElements() throws IOException {
        element= readFile.getElement("chequebank");
        clear= readFile.getElement("chequebankclear");
        values= readFile.getElement("chequebankvalueslist");
        close= readFile.getElement("chequebankclose");
        message= readFile.getElement("chequebankmessage");
    }

    public void validateChequeBank() throws IOException {
        getChequeBankElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "chequebank"));
    }

    public void selectChequeBank() throws IOException {
        getChequeBankElements();
        ehandler.selectValue(element, clear, values, close);
    }
}
