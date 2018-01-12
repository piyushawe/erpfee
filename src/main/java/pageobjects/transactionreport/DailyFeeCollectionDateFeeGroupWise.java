package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DailyFeeCollectionDateFeeGroupWise extends GenericReports {
    @FindBy(linkText = "Daily Fee Collection Date/Fee Group Wise")
    private WebElement link;
    @FindBy(id = "Daily Fee Collection Date/Fee Group Wise ")
    private WebElement frame;

    public DailyFeeCollectionDateFeeGroupWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDailyFeeCollectionDateFeeGroupWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    private void getFeeGroupElements() throws IOException {
        element = readFile.getElement("feegroup");
        clear = readFile.getElement("feegroupclear");
        values = readFile.getElement("feegroupvalueslist");
        close = readFile.getElement("feegroupclose");
        message = readFile.getElement("feegroupmessage");
    }

    public void validateFeeGroup() throws IOException {
        getFeeGroupElements();
        verify.verifyValidationOnMultiSelect(readFile.readProperty(fileUI, "feegroup"));
    }

    public void selectFeeGroup() throws IOException {
        getFeeGroupElements();
        ehandler.selectValue();
    }
}