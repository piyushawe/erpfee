package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class EstimatedCollectionReport extends GenericReports {
    @FindBy(linkText = "Estimated Collection Report")private WebElement link;
    @FindBy(id= "Estimated Collection Report")private WebElement frame;

    public EstimatedCollectionReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\EstimatedCollectionReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openEstimatedCollectionReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
    }

    public void selectReportType(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "reporttype"), index);
    }

    public void validateTillDate() throws IOException {
        verify.verifyValidationOnMultiSelect(readFile.getElement(f1, "tilldate"), clr, readFile.getElement(f1, "tilldatemessage"), readFile.readProperty(file, "tilldate"));
    }
}
