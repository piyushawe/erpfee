package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class AdvancePaymentReport extends GenericReports {
    @FindBy(linkText = "Advance Payment Report") private WebElement link;
    @FindBy(id = "Advance Payment Report") private WebElement frame;

    public AdvancePaymentReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openAdvancePaymentReport() throws IOException {
        ehandler.openFrame(new UIMap().getTransactionReportMenu(), link, frame);
    }

    @Override
    public void validateInstallment() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(fileUI, "Installment"), readFile.getElement("installmentmessage"));
    }

    @Override
    public void validateTillDate() throws IOException {
        verify.verifyValidationOnMultiSelect(readFile.getElement("tilldate"), clr, readFile.getElement("tilldatemessage"), readFile.readProperty(fileUI, "tilldate"));
    }
}