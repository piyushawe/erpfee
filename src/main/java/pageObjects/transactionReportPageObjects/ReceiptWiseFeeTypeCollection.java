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

    private void getBankNameElements() throws IOException {
        element= readFile.getElement(f1, "bankname");
        clear= readFile.getElement(f1, "banknameclear");
        values= readFile.getElement(f1, "banknamevalueslist");
        close= readFile.getElement(f1, "banknameclose");
        message= readFile.getElement(f1, "banknamemessage");
    }

    public void validateBankName() throws IOException {
        getBankNameElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(file, "bankname"));
    }

    public void selectBankName() throws IOException {
        getBankNameElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectNewOldStudent(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "newoldstudent"), index);
    }

    public void selectStudentStatus(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "studentstatus"), index);
    }

    public void clickShowRemark() throws IOException {
        ehandler.click(readFile.getElement(f1, "showremark"));
    }

    public void selectStudentWise() throws IOException {
        ehandler.click(readFile.getElement(f1, "studentwise"));
    }

    public void selectHeadWise() throws IOException {
        ehandler.click(readFile.getElement(f1, "headwise"));
    }

    public void selectDateWise() throws IOException {
        ehandler.click(readFile.getElement(f1, "datewise"));
    }
}
