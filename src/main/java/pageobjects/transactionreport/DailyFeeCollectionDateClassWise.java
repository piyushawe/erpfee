package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DailyFeeCollectionDateClassWise extends GenericReports {
    @FindBy(linkText = "Daily Fee Collection Date/Class Wise")WebElement link;
    @FindBy(id = "Daily Fee Collection Date/Class Wise")WebElement frame;

    public DailyFeeCollectionDateClassWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDailyFeeCollectionDateClassWise() throws IOException {
        ehandler.openFrame(new UIMap().getTransactionReportMenu(), link, frame);
    }
}