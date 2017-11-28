package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class ClassWiseMarkList extends GenericReports {
    @FindBy(linkText = "Class Wise Mark List")private WebElement link;
    @FindBy(id="Class Wise Mark List")private WebElement frame;

    public ClassWiseMarkList(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\reports\\ClassWiseMarkList.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openClassWiseMarkList() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "reportsmenu"), link, frame);
    }

    public void selectOrderBy(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "orderby"), index);
    }
}
