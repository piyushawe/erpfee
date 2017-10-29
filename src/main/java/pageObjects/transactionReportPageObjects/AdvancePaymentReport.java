package pageObjects.transactionReportPageObjects;

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
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\AdvancePaymentReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
        //System.out.println(this.getClass().getSimpleName());
    }

    public void openAdvancePaymentReport() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }

    public void validateInstallment() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(file, "Installment"), readFile.getElement(f1, "installmentmessage"));
    }

    public void validateTillDate() throws IOException {
        verify.verifyValidationOnMultiSelect(readFile.getElement(f1, "tilldate"), clr, readFile.getElement(f1, "tilldatemessage"), readFile.readProperty(file, "tilldate"));
    }
}