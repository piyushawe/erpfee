package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ReconcileInstallmentClassWise extends GenericReports {
    @FindBy(linkText = "Reconcile Installment Class Wise")WebElement link;
    @FindBy(id = "Reconcile Installment Class Wise")WebElement frame;

    public ReconcileInstallmentClassWise(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openReconcileInstallmentClassWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getReconcileReportsSubMenu(), link, frame);
    }
}