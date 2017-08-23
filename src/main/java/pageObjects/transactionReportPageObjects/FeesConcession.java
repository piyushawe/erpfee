package pageObjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class FeesConcession extends GenericReports {
    @FindBy(linkText = "Fees Concession")WebElement link;
    @FindBy(id = "Fees Concession")WebElement frame;

    public FeesConcession(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\FeesConcession.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openFeesConcession() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }

    public void validateConcession() throws IOException {
        WebElement ftype= readFile.getElement(f1, "concession");
        clear= readFile.getElement(f1, "concessionclear");
        close= readFile.getElement(f1, "concessionclose");
        message= readFile.getElement(f1, "concessionmessage");
        verify.verifyValidationOnMultiSelect(ftype, clear, close, message, readFile.readProperty(file, "concession"));
    }
}
