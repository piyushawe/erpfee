package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ClassWiseSibling extends GenericReports {
    @FindBy(linkText = "Class Wise Sibling")private WebElement link;
    @FindBy(id="Class Wise Sibling")private WebElement frame;

    public ClassWiseSibling(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openClassWiseSibling() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }
}
