package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class OnlinePaymentStatusReport extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Online Payment Status Report')]")WebElement link;
    @FindBy(id = "Online Payment Status Report")WebElement frame;

    public OnlinePaymentStatusReport(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openOnlinePaymentStatusReport() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "transactionreportmenu"), link, frame);
    }
}
