package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class DayWiseTotalCollection extends GenericReports {
    @FindBy(linkText = "Day Wise Total Collection")private WebElement link;
    @FindBy(id = "Day Wise Total Collection")private WebElement frame;

    public DayWiseTotalCollection(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\DayWiseTotalCollection.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openDailyFeeCollectionDateWise() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "collectionsubmenu"), link, frame);
    }

    public void getMonthElements() throws IOException {
        element= readFile.getElement(f1, "month");
        clear= readFile.getElement(f1, "monthclear");
        values= readFile.getElement(f1, "monthvalueslist");
        close= readFile.getElement(f1, "monthclose");
        message= readFile.getElement(f1, "monthmessage");
    }
    public void validateMonth() throws IOException {
        getMonthElements();
        verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "month"));
    }

    public void selectMonth() throws IOException {
        getMonthElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void validateTillDate() throws IOException {
        verify.verifyValidationOnMultiSelect(readFile.getElement(f1, "tilldate"), clr, readFile.getElement(f1, "tilldatemessage"), readFile.readProperty(fileUI, "tilldate"));
    }
}
