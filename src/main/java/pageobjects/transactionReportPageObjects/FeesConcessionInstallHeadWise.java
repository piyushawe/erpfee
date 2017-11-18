package pageobjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class FeesConcessionInstallHeadWise extends GenericReports {
    @FindBy(linkText = "Fees Concession Install/Head Wise")WebElement link;
    @FindBy(id = "Fees Concession Install/Head Wise")WebElement frame;

    public FeesConcessionInstallHeadWise(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\FeesConcessionInstallHeadWise.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openFeesConcessionInstallHeadWise() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "transactionreportmenu"), link, frame);
    }

    private void getConcessionTypeElements() throws IOException {
        element= readFile.getElement(f1, "concessiontypes");
        clear= readFile.getElement(f1, "concessiontypesclear");
        values= readFile.getElement(f1, "concessiontypesvalueslist");
        close= readFile.getElement(f1, "concessiontypesclose");
    }

    private void getConcessionElements() throws IOException {
        element= readFile.getElement(f1, "concession");
        clear= readFile.getElement(f1, "concessionclear");
        values= readFile.getElement(f1, "concessionvalueslist");
        close= readFile.getElement(f1, "concessionclose");
        message= readFile.getElement(f1, "concessionmessage");
    }

    public void selectConcessionType() throws IOException {
        getConcessionTypeElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectConcession() throws IOException {
        getConcessionElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void clickPaidConcession() throws IOException {
        ehandler.click(readFile.getElement(f1, "paidconcession"));
    }

    public void clickEntryTime() throws IOException {
        ehandler.click(readFile.getElement(f1, "entrytime"));
    }

    public void clickAssigned() throws IOException {
        ehandler.click(readFile.getElement(f1, "assigned"));
    }

    public void clickEntryTimeConcessionDateWise() throws IOException {
        ehandler.click(readFile.getElement(f1, "entrytimeconcessiondatewise"));
    }
}
