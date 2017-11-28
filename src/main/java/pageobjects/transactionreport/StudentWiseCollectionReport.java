package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class StudentWiseCollectionReport extends GenericReports {
    @FindBy(linkText = "Student Wise Collection Report")private WebElement link;
    @FindBy(id = "Student Wise Collection Report")private WebElement frame;

    public StudentWiseCollectionReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\StudentWiseCollectionReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openStudentWiseCollectionReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "collectionsubmenu"), link, frame);
    }

    public void clickHeadWise() throws IOException {
        ehandler.click(readFile.getElement(f1, "headwise"));
    }
}
