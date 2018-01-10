package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class TotalConcessionReportInstallHeadWise extends GenericReports {
    @FindBy(linkText = "Total Concession Report Install/Head Wise")WebElement link;
    @FindBy(id = "Total Concession Report Install/Head Wise")WebElement frame;

    public TotalConcessionReportInstallHeadWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openTotalConcessionReportInstallHeadWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getConcessionReportsSubMenu(), link, frame);
    }

    private void getConcessionElements() throws IOException {
        element= readFile.getElement("concession");
        clear= readFile.getElement("concessionclear");
        values= readFile.getElement("concessionvalueslist");
        close= readFile.getElement("concessionclose");
    }

    public void selectConcession() throws IOException {
        getConcessionElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectStudentStatus(int status) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("studentstatus"), status);
    }

    public void clickEntryTime() throws IOException {
        ehandler.click(readFile.getElement("entrytime"));
    }

    public void clickHeadWise() throws IOException {
        ehandler.click(readFile.getElement("headwise"));
    }

    @Override
    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("tilldate"), mm, yy, dd);
    }
}
