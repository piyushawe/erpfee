package pageobjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class FeeHeadWiseCollectionClassRange extends GenericReports {
    @FindBy(linkText = "Fee Head Wise Collection Class Range")private WebElement link;
    @FindBy(id = "Fee Head Wise Collection Class Range")private WebElement frame;

    public FeeHeadWiseCollectionClassRange(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\transactionReport\\FeeHeadWiseCollectionClassRange.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openFeeHeadWiseCollectionClassRange() throws IOException {
        ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
        ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
    }
}
