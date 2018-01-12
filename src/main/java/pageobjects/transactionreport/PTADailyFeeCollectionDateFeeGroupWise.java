package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class PTADailyFeeCollectionDateFeeGroupWise extends GenericReports {
    @FindBy(linkText = "PTA Daily Fee Collection Date/Fee Group Wise")private WebElement link;
    @FindBy(id = "PTA Daily Fee Collection Date/Fee Group Wise ")private WebElement frame;

    public PTADailyFeeCollectionDateFeeGroupWise(WebDriver d) {
        page =  this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openPTADailyFeeCollectionDateFeeGroupWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    private void getFeeGroupElements() throws IOException {
        element= readFile.getElement("group");
        clear= readFile.getElement("groupclear");
        values= readFile.getElement("groupvalueslist");
        close= readFile.getElement("groupclose");
        message= readFile.getElement("groupmessage");
    }

    public void validateFeeGroup() throws IOException {
        getFeeGroupElements();
        verify.verifyValidationOnMultiSelect(readFile.readProperty(fileUI, "month"));
    }

    public void selectFeeGroup() throws IOException {
        getFeeGroupElements();
        ehandler.selectValue();
    }
}