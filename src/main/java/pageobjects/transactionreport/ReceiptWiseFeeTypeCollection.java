package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ReceiptWiseFeeTypeCollection extends GenericReports {
    @FindBy(linkText = "Receipt wise Fee Type Collection")WebElement link;
    @FindBy(id = "Receipt wise Fee Type  Collection")WebElement frame;

    public ReceiptWiseFeeTypeCollection(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openReceiptWiseFeeTypeCollection() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
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

    public void selectNewOldStudent(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("newoldstudent"), index);
    }

    public void selectStudentStatus(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("studentstatus"), index);
    }

    public void clickShowRemark() throws IOException {
        ehandler.click(readFile.getElement("showremark"));
    }

    public void selectStudentWise() throws IOException {
        ehandler.click(readFile.getElement("studentwise"));
    }

    public void selectHeadWise() throws IOException {
        ehandler.click(readFile.getElement("headwise"));
    }

    public void selectDateWise() throws IOException {
        ehandler.click(readFile.getElement("datewise"));
    }
}
