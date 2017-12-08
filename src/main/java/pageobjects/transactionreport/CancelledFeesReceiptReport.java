package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
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
        ehandler.openFrame(readFile.getElement(fileUI, "transactionreportmenu"), link, frame);
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement(f1, "todate"), mm, yy, dd);
    }
}
