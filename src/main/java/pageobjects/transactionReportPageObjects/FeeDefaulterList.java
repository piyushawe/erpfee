package pageobjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class FeeDefaulterList extends GenericReports {
    @FindBy(linkText = "Fees Defaulter List")WebElement link;
    @FindBy(id = "Fees Defaulter List")WebElement frame;

    public FeeDefaulterList(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\FeeDefaulterList.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openFeeDefaulterList() throws IOException {
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "feedefaultersubmenu"), link, frame);
    }

    public void selectClass(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "class1"), index);
    }

    public void clickWithFine() throws IOException {
        ehandler.click(readFile.getElement(f1, "withfine"));
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement(f1, "tilldate"), mm, yy, dd);
    }

    public void selectRange(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "selectrange"), index);
    }

    public void clickHeaderWithClassGroup() throws IOException {
        ehandler.click(readFile.getElement(f1, "headerwithclassgroup"));
    }

    public void enterRangeValue(String value) throws IOException {
        ehandler.clearValue(readFile.getElement(f1, "rangevalue"));
        ehandler.enterText(readFile.getElement(f1, "rangevalue"), value);
    }

    public void clickButtonhead(String value) throws IOException {
        ehandler.clickRadioButton(readFile.getElements(f1, "radiobuttongrouphead"), value);
    }
}
