package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class EstimatedCollectionReport extends GenericReports {
    @FindBy(linkText = "Estimated Collection Report")
    private WebElement link;
    @FindBy(id = "Estimated Collection Report")
    private WebElement frame;

    public EstimatedCollectionReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openEstimatedCollectionReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "collectionsubmenu"), link, frame);
    }

    public void selectReportType(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("reporttype"), index);
    }

    @Override
    public void validateTillDate() throws IOException {
        verify.verifyValidationOnMultiSelect(readFile.getElement("tilldate"), clr, readFile.getElement("tilldatemessage"), readFile.readProperty(fileUI, "tilldate"));
    }
}