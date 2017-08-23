package pageObjects.transactionReportPageObjects;

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
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
    }

    public void validateMonth() throws IOException {
        WebElement month= readFile.getElement(f1, "month");
        clear= readFile.getElement(f1, "monthclear");
        close= readFile.getElement(f1, "monthclose");
        message= readFile.getElement(f1, "monthmessage");
        System.out.println(message);
        verify.verifyValidationOnMultiSelect(month, clear, close, message, readFile.readProperty(file, "month"));
    }
}
