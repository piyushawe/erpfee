package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DailyFeeCollectionAccountWise extends GenericReports {
    @FindBy(linkText = "Daily Fee Collection Account Wise")
    private WebElement link;
    @FindBy(id = "Daily Fee Collection Account Wise")
    private WebElement frame;

    public DailyFeeCollectionAccountWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDailyFeeCollectionAccountWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    private void getBankNameElements() throws IOException {
        element = readFile.getElement("bankname");
        clear = readFile.getElement("banknameclear");
        values = readFile.getElement("banknamevalueslist");
        close = readFile.getElement("banknameclose");
        message = readFile.getElement("banknamemessage");
    }

    private void getChequeDetailsElements() throws IOException {
        element = readFile.getElement("chequedetails");
        clear = readFile.getElement("chequedetailsclear");
        values = readFile.getElement("chequedetailsvalueslist");
        close = readFile.getElement("chequedetailsclose");
    }

    public void validateBankName() throws IOException {
        getBankNameElements();
        verify.verifyValidationOnMultiSelect(readFile.readProperty(fileUI, "bankname"));
    }

    public void selectBankName() throws IOException {
        getBankNameElements();
        ehandler.selectValue();
    }

    public void selectChequeDetails() throws IOException {
        getChequeDetailsElements();
        ehandler.selectValue();
    }
}