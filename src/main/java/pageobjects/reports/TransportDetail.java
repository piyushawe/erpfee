package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class TransportDetail extends GenericReports {
    @FindBy(linkText = "Transport Detail")private WebElement link;
    @FindBy(id="Transport Detail")private WebElement frame;

    public TransportDetail(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openTransportDetail() throws IOException {
        ehandler.moveToElement(readFile.getElement(fileUI, "reportsmenu"));
        ehandler.openFrame(readFile.getElement(fileUI, "transportreportsubmenu"), link, frame);
    }

    public void selectRoute(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "route"), index);
    }

    public void selectStop(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "stop"), index);
    }

    public void selectvehicle(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "vehicle"), index);
    }

    public void selectvendor(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "vendor"), index);
    }
}
