package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class TransportReportClassWise extends GenericReports {
    @FindBy(linkText = "Transport Report Class Wise")
    private WebElement link;
    @FindBy(id = "Transport Report Class Wise")
    private WebElement frame;

    public TransportReportClassWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openTransportReportClassWise() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getTransportReportSubMenu(), link, frame);
    }

    public void enterStopFare(String fare) throws IOException {
        ehandler.enterText(readFile.getElement("stopfare"), fare);
    }

    public void selectRoute(int route) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("route"), route);
    }

    public void selectBusStop(int bstop) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("busstop"), bstop);
    }
}