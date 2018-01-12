package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class PaidTransport extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Paid Transport')]")
    WebElement link;
    @FindBy(id = "Paid Transport")
    WebElement frame;

    public PaidTransport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openPaidTransport() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getTransportReportSubMenu(), link, frame);
    }

    public void selectRoute(int route) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("route"), route);
    }

    public void selectVehicle(int vehicle) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("vehicle"), vehicle);
    }
}