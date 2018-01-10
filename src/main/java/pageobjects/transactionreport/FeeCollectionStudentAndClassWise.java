package pageobjects.transactionreport;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class FeeCollectionStudentAndClassWise extends GenericReports {
    @FindBy(linkText = "Fee Collection Student and Class Wise")private WebElement link;
    @FindBy(id = "Fee Collection Student and Class Wise")private WebElement frame;

    public FeeCollectionStudentAndClassWise(WebDriver d) {
        page =  this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openFeeCollectionStudentAndClassWise() throws IOException {
        ehandler.moveToElement(new UIMap().getTransactionReportMenu());
        ehandler.openFrame(new UIMap().getCollectionsSubMenu(), link, frame);
    }

    public void selectOrderBy(int order) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("orderby"), order);
    }
}
