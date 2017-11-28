package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class StudentRegisterDateWiseReport extends GenericReports {
    @FindBy(linkText = "Student Register Date Wise Report")private WebElement link;
    @FindBy(id="Student Register Date Wise Report")private WebElement frame;

    public StudentRegisterDateWiseReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\reports\\StudentRegisterDateWiseReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openStudentRegisterDateWiseReport() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "reportsmenu"), link, frame);
    }

    public void selectFromDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement(f1, "fromdate"), mm, yy, dd);
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement(f1, "todate"), mm, yy, dd);
    }
}
