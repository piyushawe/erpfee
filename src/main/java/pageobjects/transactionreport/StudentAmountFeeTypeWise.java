package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class StudentAmountFeeTypeWise extends GenericReports {
    @FindBy(linkText = "Student Amount Fee Type Wise")
    WebElement link;
    @FindBy(id = "Student Amount Fee Type Wise")
    WebElement frame;

    public StudentAmountFeeTypeWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openStudentAmountFeeTypeWise() throws IOException {
        ehandler.openFrame(new UIMap().getTransactionReportMenu(), link, frame);
    }

    private void getConcession() throws IOException {
        element = readFile.getElement("concession");
        clear = readFile.getElement("concessionclear");
        values = readFile.getElement("concessionvalueslist");
        close = readFile.getElement("concessionclose");
    }

    public void selectConcession() throws IOException {
        getConcession();
        ehandler.selectValue(element, clear, values, close);
    }
}