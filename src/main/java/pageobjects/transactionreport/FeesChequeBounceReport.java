package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class FeesChequeBounceReport extends GenericReports {
    @FindBy(linkText = "Fees Cheque Bounce Report")WebElement link;
    @FindBy(id = "Fees Cheque Bounce Report")WebElement frame;

    public FeesChequeBounceReport(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openFeesChequeBounceReport() throws IOException {
        ehandler.openFrame(new UIMap().getTransactionReportMenu(), link, frame);
    }

    public void selectBankName(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("bankname"), index);
    }

    public void selectReportFilter(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("reportfilter"), index);
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("todate"), mm, yy, dd);
    }

    public void clickHeadWise() throws IOException {
        ehandler.click(readFile.getElement("headwise"));
    }
}
