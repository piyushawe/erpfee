package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class StudentHouseWiseReport extends GenericReports {
    @FindBy(linkText = "Student House Wise Report")
    private WebElement link;
    @FindBy(id = "Student House Wise Report")
    private WebElement frame;

    public StudentHouseWiseReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openStudentHouseWiseReport() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void clickSectionWise() throws IOException {
        ehandler.click(readFile.getElement("sectionwise"));
    }

    public void selectHouse(int house) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("house"), house);
    }

    public void selectRange(int range) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("range"), range);
    }

    public void selectFromAge(int age) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("fromage"), age);
    }
}