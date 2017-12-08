package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class UnpaidStudentReport extends GenericReports {
    @FindBy(linkText = "Unpaid Student Report")WebElement link;
    @FindBy(id = "Unpaid Student Report")WebElement frame;

    public UnpaidStudentReport(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openUnpaidStudentReport() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "feedefaultersubmenu"), link, frame);
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

    public void enterRangeValue(String value) throws IOException {
        ehandler.clearValue(readFile.getElement(f1, "rangevalue"));
        ehandler.enterText(readFile.getElement(f1, "rangevalue"), value);
    }

    public void clickButtonhead(String value) throws IOException {
        ehandler.clickRadioButton(readFile.getElements("radiobuttongroup1"), value);
    }
}
