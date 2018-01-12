package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ReconcileReport extends GenericReports {
    @FindBy(linkText = "Reconcile Report")WebElement link;
    @FindBy(id = "Reconcile Report")WebElement frame;

    public ReconcileReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openReconcileReport() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getReconcileReportsSubMenu(), link, frame);
    }

    public void clickFormat1() throws IOException {
        ehandler.click(readFile.getElement("format1"));
    }

    public void clickFormat2() throws IOException {
        ehandler.click(readFile.getElement("format2"));
    }

    public void clickFormat3() throws IOException {
        ehandler.click(readFile.getElement("format3"));
    }
}