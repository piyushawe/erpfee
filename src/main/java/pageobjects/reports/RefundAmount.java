package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class RefundAmount extends GenericReports {
    @FindBy(linkText = "Refund Amount")private WebElement link;
    @FindBy(id="Refund Amount")private WebElement frame;

    public RefundAmount(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openRefundAmount() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "reportsmenu"), link, frame);
    }

    public void selectFromDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement(f1, "fromdate"), mm, yy, dd);
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement(f1, "todate"), mm, yy, dd);
    }

    public void selectYear(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "year"), index);
    }
}
