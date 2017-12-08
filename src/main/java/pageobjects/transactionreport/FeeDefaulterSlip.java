package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class FeeDefaulterSlip extends GenericReports {
    @FindBy(linkText = "Fees Defaulter Slip")WebElement link;
    @FindBy(id = "Fees Defaulter Slip")WebElement frame;

    public FeeDefaulterSlip(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openFeeDefaulterSlip() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "feedefaultersubmenu"), link, frame);
    }

    public void clickWithFine() throws IOException {
        ehandler.click(readFile.getElement(f1, "withfine"));
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement(f1, "tilldate"), mm, yy, dd);
    }
}
