package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class FeesConcessionAndDues extends GenericReports {
    @FindBy(linkText = "Fees Concession And Dues")WebElement link;
    @FindBy(id = "Fees Concession And Dues")WebElement frame;

    public FeesConcessionAndDues(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openFeesConcessionAndDues() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getConcessionReportsSubMenu(), link, frame);
    }

    private void getFeeTypeElements() throws IOException {
        element= readFile.getElement("feetype");
        clear= readFile.getElement("feetypeclear");
        values= readFile.getElement("feetypevalueslist");
        close= readFile.getElement("feetypeclose");
        message= readFile.getElement("feetypemessage");
    }

    public void validateFeeType() throws IOException {
        getFeeTypeElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "feetype"));
    }

    public void selectFeeType() throws IOException {
        getFeeTypeElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectShowBy(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("showby"), index);
    }
}