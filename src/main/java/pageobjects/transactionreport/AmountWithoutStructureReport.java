package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class AmountWithoutStructureReport extends GenericReports {
    @FindBy(linkText = "Amount without Structure report")WebElement link;
    @FindBy(id = "Amount without Structure report")WebElement frame;

    public AmountWithoutStructureReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\AmountWithoutStructureReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openAmountWithoutStructureReport() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }

    public void selectYear(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "year"), index);
    }
    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement(f1, "todate"), mm, yy, dd);
    }

    public void clickCancelledFee() throws IOException {
        ehandler.click(readFile.getElement(f1, "cancelledfee"));
    }
}
