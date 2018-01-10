package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DailyFeeCollectionListWithHeadFineFilter extends GenericReports {

    @FindBy(linkText = "Daily Fee Collection List With Head Fine Filter")
    private WebElement link;
    @FindBy(id = "Daily Fee Collection  List With Head Fine Filter")
    private WebElement frame;

    public DailyFeeCollectionListWithHeadFineFilter(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDailyFeeCollectionListWithHeadFineFilter() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    private void getFeeTypeElements() throws IOException {
        element = readFile.getElement("feetype");
        clear = readFile.getElement("feetypeclear");
        values = readFile.getElement("feetypevalueslist");
        close = readFile.getElement("feetypeclose");
    }

    private void getHeadFineElements() throws IOException {
        element = readFile.getElement("headfine");
        clear = readFile.getElement("headfineclear");
        values = readFile.getElement("headfinevalueslist");
        close = readFile.getElement("headfineclose");
    }

    private void getStatusElements() throws IOException {
        element = readFile.getElement("status");
        clear = readFile.getElement("statusclear");
        values = readFile.getElement("statusvalueslist");
        close = readFile.getElement("statusclose");
    }

    public void validateFeeType() throws IOException {
        getFeeTypeElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "month"));
    }

    public void selectHeadFine() throws IOException {
        getHeadFineElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectShowCollection(int collection) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("collection"), collection);
    }

    public void selectFeeType() throws IOException {
        getFeeTypeElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectStatus() throws IOException {
        getStatusElements();
        ehandler.selectValue(element, clear, values, close);
    }
}