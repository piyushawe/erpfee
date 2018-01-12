package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DailyFeeCollectionReceiptRange extends GenericReports {
    @FindBy(linkText = "Daily Fee Collection Receipt Range") private WebElement link;
    @FindBy(id = "Daily Fee Collection Receipt Range") private WebElement frame;

    public DailyFeeCollectionReceiptRange(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDailyFeeCollectionReceiptRange() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }
}