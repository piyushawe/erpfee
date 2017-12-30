package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class AmountWithoutStructureForStaff extends GenericReports {
    @FindBy(linkText = "Amount Without Structure for Staff")WebElement link;
    @FindBy(id = "Amount Without Structure for Staff")WebElement frame;

    public AmountWithoutStructureForStaff(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openAmountWithoutStructureForStaff() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getAmountWithoutStructureReportsSubMenu(), link, frame);
    }

    public void selectYear(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("year"), index);
    }

    public void selectStaffType(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("stafftype"), index);
    }

    public void selectDesignation(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("designation"), index);
    }

    public void selectDepartment(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("department"), index);
    }

    @Override
    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("todate"), mm, yy, dd);
    }

    public void clickCancelledFee() throws IOException {
        ehandler.click(readFile.getElement("cancelledfee"));
    }
}