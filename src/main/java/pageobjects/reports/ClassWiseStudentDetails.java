package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class ClassWiseStudentDetails extends GenericReports {
    @FindBy(linkText = "Class Wise Student Details")private WebElement link;
    @FindBy(id="Class Wise Student Details")private WebElement frame;

    public ClassWiseStudentDetails(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\reports\\ClassWiseStudentDetails.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openClassWiseStudentDetails() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "reportsmenu"), link, frame);
    }

    public void selectDayScholarBoarding() throws IOException {
        ehandler.click(readFile.getElement(f1, "dayscholarboarding"));
    }

    public void selectShowRollNo() throws IOException {
        ehandler.click(readFile.getElement(f1, "rollno"));
    }
}