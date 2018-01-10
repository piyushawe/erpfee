package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class FeesConcessionInstallHeadWise extends GenericReports {
    @FindBy(linkText = "Fees Concession Install/Head Wise")WebElement link;
    @FindBy(id = "Fees Concession Install/Head Wise")WebElement frame;

    public FeesConcessionInstallHeadWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openFeesConcessionInstallHeadWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getConcessionReportsSubMenu(), link, frame);
    }

    private void getConcessionTypeElements() throws IOException {
        element= readFile.getElement("concessiontypes");
        clear= readFile.getElement("concessiontypesclear");
        values= readFile.getElement("concessiontypesvalueslist");
        close= readFile.getElement("concessiontypesclose");
    }

    private void getConcessionElements() throws IOException {
        element= readFile.getElement("concession");
        clear= readFile.getElement("concessionclear");
        values= readFile.getElement("concessionvalueslist");
        close= readFile.getElement("concessionclose");
        message= readFile.getElement("concessionmessage");
    }

    public void selectConcessionType() throws IOException {
        getConcessionTypeElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectConcession() throws IOException {
        getConcessionElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void clickHeadButton(String value) throws IOException {
        ehandler.clickRadioButton(readFile.getElements("headbuttongroup"), value);
    }

    public void selectStudentStatus(int status) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("studentstatus"), status);
    }

    public void clickPaidConcession() throws IOException {
        ehandler.click(readFile.getElement("paidconcession"));
    }

    public void clickEntryTime() throws IOException {
        ehandler.click(readFile.getElement("entrytime"));
    }

    public void clickAssigned() throws IOException {
        ehandler.click(readFile.getElement("assigned"));
    }

    public void clickEntryTimeConcessionDateWise() throws IOException {
        ehandler.click(readFile.getElement("entrytimeconcessiondatewise"));
    }
}