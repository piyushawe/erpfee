package pageobjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class ReconcileInstallmentClassWise extends GenericReports {
    @FindBy(linkText = "Reconcile Installment Class Wise")WebElement link;
    @FindBy(id = "Reconcile Installment Class Wise")WebElement frame;

    public ReconcileInstallmentClassWise(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\ReconcileInstallmentClassWise.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openReconcileInstallmentClassWise() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }
}
