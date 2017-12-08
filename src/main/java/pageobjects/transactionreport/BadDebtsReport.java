package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class BadDebtsReport extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Bad Debts Report')]")WebElement link;
    @FindBy(id = "Bad Debts Report")WebElement frame;

    public BadDebtsReport(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openBadDebtsReport() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "transactionreportmenu"), link, frame);
    }
}
