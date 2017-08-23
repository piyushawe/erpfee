package pageObjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class ReceiptWiseFeeTypeCollection extends GenericReports {
    @FindBy(linkText = "Receipt wise Fee Type Collection")WebElement link;
    @FindBy(id = "Receipt wise Fee Type  Collection")WebElement frame;

    public ReceiptWiseFeeTypeCollection(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\ReceiptWiseFeeTypeCollection.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openReceiptWiseFeeTypeCollection() throws IOException {
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
    }

    public void validateBankName() throws IOException {
        WebElement bname= readFile.getElement(f1, "bankname");
        clear= readFile.getElement(f1, "banknameclear");
        close= readFile.getElement(f1, "banknameclose");
        message= readFile.getElement(f1, "banknamemessage");
        verify.verifyValidationOnMultiSelect(bname, clear, close, message, readFile.readProperty(file, "bankname"));
    }
}
