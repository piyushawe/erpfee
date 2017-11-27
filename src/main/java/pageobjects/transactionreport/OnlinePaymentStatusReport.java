package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class OnlinePaymentStatusReport extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Online Payment Status Report')]")WebElement link;
    @FindBy(id = "Online Payment Status Report")WebElement frame;

    public OnlinePaymentStatusReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\OnlinePaymentStatusReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openOnlinePaymentStatusReport() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }
}
