package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class OpeningDuesReport extends GenericReports {
    @FindBy(linkText = "Opening Dues Report")private WebElement link;
    @FindBy(id="Opening Dues Report")private WebElement frame;

    public OpeningDuesReport(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\reports\\OpeningDuesReport.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openOpeningDuesReport() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "reportsmenu"), link, frame);
    }
}
