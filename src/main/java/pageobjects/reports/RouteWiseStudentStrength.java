package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class RouteWiseStudentStrength extends GenericReports {
    @FindBy(linkText = "Route Wise Student Strength")
    private WebElement link;
    @FindBy(id = "Route Wise Student Strength")
    private WebElement frame;

    public RouteWiseStudentStrength(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openRouteWiseStudentStrength() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getStudentStrengthSubMenu(), link, frame);
    }

    private void getMonthElements() throws IOException {
        element = readFile.getElement("month");
        clear = readFile.getElement("monthclear");
        values = readFile.getElement("monthvalueslist");
        close = readFile.getElement("monthclose");
    }

    public void selectMonth() throws IOException {
        getMonthElements();
        ehandler.selectValue(element, clear, values, close);
    }

    private void getRouteElements() throws IOException {
        element = readFile.getElement("route");
        clear = readFile.getElement("routeclear");
        values = readFile.getElement("routevalueslist");
        close = readFile.getElement("routeclose");
    }

    public void selectRoute() throws IOException {
        getRouteElements();
        ehandler.selectValue(element, clear, values, close);
    }

    private void getBusStopElements() throws IOException {
        element = readFile.getElement("busstop");
        clear = readFile.getElement("busstopclear");
        values = readFile.getElement("busstopvalueslist");
        close = readFile.getElement("busstopclose");
    }

    public void selectBusStop() throws IOException {
        getBusStopElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void clickStudentWise() throws IOException {
        ehandler.click(readFile.getElement("studentwise"));
    }

    public void clickRouteWise() throws IOException {
        ehandler.click(readFile.getElement("routewise"));
    }

    public void clickWithContactNo() throws IOException {
        ehandler.click(readFile.getElement("withcontactno"));
    }
}