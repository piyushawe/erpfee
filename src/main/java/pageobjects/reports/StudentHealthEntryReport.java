package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class StudentHealthEntryReport extends GenericReports {
    @FindBy(linkText = "Student Health Entry Report")private WebElement link;
    @FindBy(id="Student Health Entry Report")private WebElement frame;

    public StudentHealthEntryReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\reports\\StudentHealthEntryReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openStudentHealthEntryReport() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "reportsmenu"), link, frame);
    }
}
