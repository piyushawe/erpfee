package pageobjects.globalmasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineWing extends BaseClass {
    @FindBy(linkText = "Define Wing")private WebElement link;
    @FindBy(id = "Define Wing")private WebElement frame;

    public DefineWing(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefineWing.properties");
        PageFactory.initElements(d, this);
        readFile.readProperty(f1, "page");
    }

    public void openDefineWing() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "globalmastersmenu"), link, frame);
    }

    public void enterWingName(String mname) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "wingname"), mname);
    }

    public void enterWingName(int n) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "wingname"), n);
    }

    public void validateBlank() throws IOException {
        verify.validateBlankField(readFile.getElement(f1, "wingname"),readFile.readProperty(f1, "blankvalidationmessage"), readFile.getElement(f1, "blankvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement(f1, "wingname"));
    }
}
