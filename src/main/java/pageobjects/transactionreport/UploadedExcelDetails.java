package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class UploadedExcelDetails extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Uploaded Excel Details')]")
    WebElement link;
    @FindBy(id = "Uploaded Excel Details")
    WebElement frame;

    public UploadedExcelDetails(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openUploadedExcelDetails() throws IOException {
        ehandler.openFrame(new UIMap().getTransactionReportMenu(), link, frame);
    }

    public void selectFeeStatus(int status) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("feestatus"), status);
    }

    public void selectExcelName(int ename) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("excelname"), ename);
    }

    @Override
    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("tilldate"), mm, yy, dd);
    }
}