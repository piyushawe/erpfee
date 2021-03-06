package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class YearlyCollectionReport extends GenericReports {
    @FindBy(linkText = "Yearly Collection Report")
    private WebElement link;
    @FindBy(id = "Yearly Collection Report")
    private WebElement frame;

    public YearlyCollectionReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openYearlyCollectionReport() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    public void selectSession(String sess) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("session"), sess);
    }

    public void selectSession(int sess) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("session"), sess);
    }

    public void validateSession() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(file, "sessionmessage"), readFile.getElement("sessionmsg"));
    }

    private void getBankNameElements() throws IOException {
        element = readFile.getElement("bankname");
        clear = readFile.getElement("banknameclear");
        values = readFile.getElement("banknamevalueslist");
        close = readFile.getElement("banknameclose");
        message = readFile.getElement("banknamemessage");
    }

    public void validateBankName() throws IOException {
        getBankNameElements();
        verify.verifyValidationOnMultiSelect(readFile.readProperty(fileUI, "bankname"));
    }

    public void selectBankName() throws IOException {
        getBankNameElements();
        ehandler.selectValue();
    }

    public void clickMonthWiseCollection() throws IOException {
        ehandler.click(readFile.getElement("monthwisecollection"));
    }
}