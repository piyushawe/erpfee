package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class FeeDefaulterInstallmentWise extends GenericReports {
    @FindBy(linkText = "Fee Defaulter Installment Wise")WebElement link;
    @FindBy(id = "Fee Defaulter Installment Wise")WebElement frame;

    public FeeDefaulterInstallmentWise(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openFeeDefaulterInstallmentWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getDefaulterReportsSubMenu(), link, frame);
    }

    public void selectRoute(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("route"), index);
    }

    public void selectVehicle(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("vehicle"), index);
    }

    public void clickWithFine() throws IOException {
        ehandler.click(readFile.getElement("withfine"));
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("tilldate"), mm, yy, dd);
    }
}
