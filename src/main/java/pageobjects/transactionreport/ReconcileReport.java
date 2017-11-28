package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class ReconcileReport extends GenericReports {
    @FindBy(linkText = "Reconcile Report")WebElement link;
    @FindBy(id = "Reconcile Report")WebElement frame;

    public ReconcileReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\ReconcileReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openReconcileReport() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "transactionreportmenu"), link, frame);
    }

    public void clickFormat1() throws IOException {
        ehandler.click(readFile.getElement(f1, "format1"));
    }
}
