package pageobjects.reportsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class ClassWiseSibling extends GenericReports {
    @FindBy(linkText = "Class Wise Sibling")private WebElement link;
    @FindBy(id="Class Wise Sibling")private WebElement frame;

    public ClassWiseSibling(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\reports\\ClassWiseSibling.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1, "page");
    }

    public void openClassWiseSibling() throws IOException {
        ehandler.openFrame(readFile.getElement(file, "reportsmenu"), link, frame);
    }
}
