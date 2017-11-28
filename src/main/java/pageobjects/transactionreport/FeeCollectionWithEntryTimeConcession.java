package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class FeeCollectionWithEntryTimeConcession extends GenericReports {
    @FindBy(linkText = "Fee Collection with entry time concession")WebElement link;
    @FindBy(id = "Fee Collection with entry time concession")WebElement frame;

    public FeeCollectionWithEntryTimeConcession(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\FeeCollectionWithEntryTimeConcession.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openFeeCollectionWithEntryTimeConcession() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "collectionsubmenu"), link, frame);
    }

    public void validateCollectionDate() throws IOException{
        verify.verifyValidationOnMultiSelect(fromdate, clr, readFile.getElement(f1, "collectiondatemessage"), readFile.readProperty(fileUI, "collectiondate"));
    }
}
