package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ClassSectionTransferReport extends GenericReports {
    @FindBy(linkText = "Class Section Transfer Report")private WebElement link;
    @FindBy(id="Class Section Transfer Report")private WebElement frame;

    public ClassSectionTransferReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openClassSectionTransferReport() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void selectOldAcademicYear(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("oldacademicyear"), index);
    }

    public void selectOldFinancialYear(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("oldfinancialyear"), index);
    }
}