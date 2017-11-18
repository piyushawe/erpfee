package pageobjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class AnnualStuLedReport extends GenericReports {
    @FindBy(linkText = "Annual Stu Led Report")WebElement link;
    @FindBy(id = "Annual Stu Led Report")WebElement frame;

    public AnnualStuLedReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\AnnualStuLedReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openAnnualStuLedReport() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }
}
