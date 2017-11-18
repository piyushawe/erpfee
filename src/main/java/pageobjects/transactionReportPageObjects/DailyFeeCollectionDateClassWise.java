package pageobjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class DailyFeeCollectionDateClassWise extends GenericReports {
    @FindBy(linkText = "Daily Fee Collection Date/Class Wise")WebElement link;
    @FindBy(id = "Daily Fee Collection Date/Class Wise")WebElement frame;

    public DailyFeeCollectionDateClassWise(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\DailyFeeCollectionDateClassWise.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openDailyFeeCollectionDateClassWise() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }
}
