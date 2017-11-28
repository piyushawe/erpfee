package pageobjects.globalmasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineCaste extends BaseClass {
    @FindBy(xpath = "//*[contains(text(),'Define Caste')]")
    private WebElement link;
    @FindBy(id = "Define Caste")
    private WebElement frame;

    public DefineCaste(WebDriver d) throws IOException {
        f1 = new File("F:\\erpfee\\configuration\\globalMasters\\DefineCaste.properties");
        PageFactory.initElements(d, this);
        //page = readFile.readProperty(f1, "page");
        page = this.getClass().getName();
        System.out.println(page);
}

    public void openDefineCaste() throws IOException {
        //System.out.println(link.isDisplayed());
        ehandler.openFrame(readFile.getElement(fileUI, "globalmastersmenu"), link, frame);
    }

    public void enterCasteName(String cname) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "castename"), cname);
    }

    public void enterCasteName(int n) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "castename"), n);
    }

    public void validateBlank() throws IOException {
        verify.validateBlankField(readFile.getElement(f1, "castename"), readFile.readProperty(f1, "blankvalidationmessage"), readFile.getElement(f1, "blankvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement(f1, "castename"));
    }
}