package pageobjects.reportsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class MidYearStudentDetails extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Mid Year Student Details')]")private WebElement link;
    @FindBy(id="Mid Year Student Details")private WebElement frame;

    public MidYearStudentDetails(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\reports\\MidYearStudentDetails.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openMidYearStudentDetails() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "reportsmenu"), link, frame);
    }
}
