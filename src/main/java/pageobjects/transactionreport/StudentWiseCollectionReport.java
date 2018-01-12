package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class StudentWiseCollectionReport extends GenericReports {
    @FindBy(linkText = "Student Wise Collection Report")private WebElement link;
    @FindBy(id = "Student Wise Collection Report")private WebElement frame;

    public StudentWiseCollectionReport(WebDriver d) {
        page =  this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openStudentWiseCollectionReport() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    public void clickHeadWise() throws IOException {
        ehandler.click(readFile.getElement("headwise"));
    }
}