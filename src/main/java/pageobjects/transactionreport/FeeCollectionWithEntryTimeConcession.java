package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class FeeCollectionWithEntryTimeConcession extends GenericReports {
    @FindBy(linkText = "Fee Collection With Entry Time Concession")WebElement link;
    @FindBy(id = "Fee Collection With Entry Time Concession")WebElement frame;

    public FeeCollectionWithEntryTimeConcession(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openFeeCollectionWithEntryTimeConcession() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    public void validateCollectionDate() throws IOException{
        verify.verifyValidationOnMultiSelect(fromdate, clr, readFile.getElement("collectiondatemessage"), readFile.readProperty(fileUI, "collectiondate"));
    }
}