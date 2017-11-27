package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class FeesConcessionAndDues extends GenericReports {
    @FindBy(linkText = "Fees Concession And Dues")WebElement link;
    @FindBy(id = "Fees Concession And Dues")WebElement frame;

    public FeesConcessionAndDues(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\FeesConcessionAndDues.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openFeesConcessionAndDues() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }

    private void getFeeTypeElements() throws IOException {
        element= readFile.getElement(f1, "feetype");
        clear= readFile.getElement(f1, "feetypeclear");
        values= readFile.getElement(f1, "feetypevalueslist");
        close= readFile.getElement(f1, "feetypeclose");
        message= readFile.getElement(f1, "feetypemessage");
    }

    public void validateFeeType() throws IOException {
        getFeeTypeElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(file, "feetype"));
    }

    public void selectFeeType() throws IOException {
        getFeeTypeElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectShowBy(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "showby"), index);
    }
}
