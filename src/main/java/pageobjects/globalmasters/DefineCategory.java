package pageobjects.globalmasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineCategory extends BaseClass {
    @FindBy(linkText = "Define Category") private WebElement link;
    @FindBy(id = "Define Category") private WebElement frame;

    public DefineCategory(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefineCategory.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1,"page");
    }

    public void openDefineCategory() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI,"globalmastersmenu"), link, frame);
    }

    public void enterCategoryName(String pname) throws IOException {
        ehandler.enterText(readFile.getElement(f1,"categoryname"), pname);
    }

    public void enterCategoryName(int n) throws IOException {
        ehandler.enterText(readFile.getElement(f1,"categoryname"), n);
    }

    public void validateBlank() throws IOException {
        verify.validateBlankField(readFile.getElement(f1,"categoryname"),readFile.readProperty(f1,"blankvalidationmessage"), readFile.getElement(f1,"blankvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement(f1,"categoryname"));
    }
}
