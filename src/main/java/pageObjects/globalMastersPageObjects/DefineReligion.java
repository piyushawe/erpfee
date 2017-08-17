package pageObjects.globalMastersPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineReligion extends BaseClass {
    @FindBy(linkText = "Define Religion") private WebElement link;
    @FindBy(id = "Define Religion") private WebElement frame;

    public DefineReligion(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefineReligion.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1,"page");
    }

    public void openDefineReligion() throws IOException {
        ehandler.openFrame(readFile.getElement(file,"globalmastersmenu"), link, frame);
    }

    public void enterReligionName(String pname) throws IOException {
        ehandler.enterText(readFile.getElement(f1,"religionname"), pname);
    }

    public void enterReligionName(int n) throws IOException {
        ehandler.enterText(readFile.getElement(f1,"religionname"), n);
    }

    public void validateBlank() throws IOException {
        verify.validateBlankField(readFile.getElement(f1,"religionname"),readFile.readProperty(f1,"blankvalidationmessage"), readFile.getElement(f1,"blankvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement(f1,"religionname"));
    }
}
