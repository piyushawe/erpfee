package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class AdvancePaymentReport extends GenericReports {
    @FindBy(linkText = "Advance Payment Report") private WebElement link;
    @FindBy(id = "Advance Payment Report") private WebElement frame;

    public AdvancePaymentReport(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openAdvancePaymentReport() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "transactionreportmenu"), link, frame);
    }

    @Override
    public void validateInstallment() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(fileUI, "Installment"), readFile.getElement(f1, "installmentmessage"));
    }

    @Override
    public void validateTillDate() throws IOException {
        verify.verifyValidationOnMultiSelect(readFile.getElement(f1, "tilldate"), clr, readFile.getElement(f1, "tilldatemessage"), readFile.readProperty(fileUI, "tilldate"));
    }
}