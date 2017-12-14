package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DayWiseTotalCollection extends GenericReports {
    @FindBy(linkText = "Day Wise Total Collection")private WebElement link;
    @FindBy(id = "Day Wise Total Collection")private WebElement frame;

    public DayWiseTotalCollection(WebDriver d) {
        page =  this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDayWiseTotalCollection() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    public void getMonthElements() throws IOException {
        element= readFile.getElement("month");
        clear= readFile.getElement("monthclear");
        values= readFile.getElement("monthvalueslist");
        close= readFile.getElement("monthclose");
        message= readFile.getElement("monthmessage");
    }
    public void validateMonth() throws IOException {
        getMonthElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "month"));
    }

    public void selectMonth() throws IOException {
        getMonthElements();
        ehandler.selectValue(element, clear, values, close);
    }

    @Override
    public void validateTillDate() throws IOException {
        verify.verifyValidationOnMultiSelect(readFile.getElement("tilldate"), clr, readFile.getElement("tilldatemessage"), readFile.readProperty(fileUI, "tilldate"));
    }
}