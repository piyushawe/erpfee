package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class AmountWithoutStructureReport extends GenericReports {
    @FindBy(linkText = "Amount without Structure report")WebElement link;
    @FindBy(id = "Amount without Structure report")WebElement frame;

    public AmountWithoutStructureReport(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openAmountWithoutStructureReport() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getAmountWithoutStructureReportsSubMenu(), link, frame);
    }

    public void selectYear(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("year"), index);
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("todate"), mm, yy, dd);
    }

    public void clickCancelledFee() throws IOException {
        ehandler.click(readFile.getElement("cancelledfee"));
    }
}