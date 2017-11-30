package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class TotalCollectionReport extends GenericReports {
    @FindBy(linkText = "Total Collection Report")
    private WebElement link;
    @FindBy(id = "Total Collection Report")
    private WebElement frame;

    public TotalCollectionReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openTotalCollectionReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "collectionsubmenu"), link, frame);
    }
}
