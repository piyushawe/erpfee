package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class SelfTransportReport extends GenericReports {
    @FindBy(xpath = "//*[contains(text(), 'Self Transport Report')]")
    WebElement link;
    @FindBy(id = "Self Transport Report")
    WebElement frame;

    public SelfTransportReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openSelfTransportReport() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getTransportReportSubMenu(), link, frame);
    }

    public void selectTransport(int transport) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("transport"), transport);
    }

    private void getAdditionalFieldElements() throws IOException {
        element = readFile.getElement("additionalfield");
        clear = readFile.getElement("additionalfieldclear");
        values = readFile.getElement("additionalfieldvalueslist");
        close = readFile.getElement("additionalfieldclose");
    }

    public void selectAdditionalField() throws IOException {
        getAdditionalFieldElements();
        ehandler.selectValue();
    }
}