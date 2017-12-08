package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class ClassSectionTransferReport extends GenericReports {
    @FindBy(linkText = "Class Section Transfer Report")private WebElement link;
    @FindBy(id="Class Section Transfer Report")private WebElement frame;

    public ClassSectionTransferReport(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openClassSectionTransferReport() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "reportsmenu"), link, frame);
    }

    public void selectOldAcademicYear(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "oldacademicyear"), index);
    }

    public void selectOldFinancialYear(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "oldfinancialyear"), index);
    }
}
