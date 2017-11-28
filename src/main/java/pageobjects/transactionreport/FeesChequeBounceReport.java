package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class FeesChequeBounceReport extends GenericReports {
    @FindBy(linkText = "Fees Cheque Bounce Report")WebElement link;
    @FindBy(id = "Fees Cheque Bounce Report")WebElement frame;

    public FeesChequeBounceReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\FeesChequeBounceReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openFeesChequeBounceReport() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "transactionreportmenu"), link, frame);
    }

    public void selectBankName(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "bankname"), index);
    }

    public void selectReportFilter(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "reportfilter"), index);
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement(f1, "todate"), mm, yy, dd);
    }

    public void clickHeadWise() throws IOException {
        ehandler.click(readFile.getElement(f1, "headwise"));
    }
}
