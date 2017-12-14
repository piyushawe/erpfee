package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class CancelledFeesReceiptReport extends GenericReports {
    @FindBy(linkText = "Cancelled Fees Receipt Report")WebElement link;
    @FindBy(id = "Cancelled Fees Receipt Report")WebElement frame;

    public CancelledFeesReceiptReport(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openCancelledFeesReceiptReport() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCancelledReceiptReportsSubmenu(), link, frame);
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("todate"), mm, yy, dd);
    }
}