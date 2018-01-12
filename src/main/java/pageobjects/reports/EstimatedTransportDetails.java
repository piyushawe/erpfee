package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class EstimatedTransportDetails extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Estimated Transport Details')]")
    WebElement link;
    @FindBy(id = "Estimated Transport Details")
    WebElement frame;

    public EstimatedTransportDetails(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openEstimatedTransportDetails() throws IOException {
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