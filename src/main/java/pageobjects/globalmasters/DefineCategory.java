package pageobjects.globalmasters;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.IOException;

public class DefineCategory extends BaseClass {
    @FindBy(linkText = "Define Category") private WebElement link;
    @FindBy(id = "Define Category") private WebElement frame;

    public DefineCategory(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDefineCategory() throws IOException {
        ehandler.openFrame(new UIMap().getGlobalMastersMenu(), link, frame);
    }

    public void enterCategoryName(String pname) throws IOException {
        ehandler.enterText(readFile.getElement("categoryname"), pname);
    }

    public void enterCategoryName(int n) throws IOException {
        ehandler.enterText(readFile.getElement("categoryname"), n);
    }

    public void validateBlank() throws IOException {
        verify.validateBlankField(readFile.getElement("categoryname"),readFile.readProperty(file,"blankvalidationmessage"), readFile.getElement("blankvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement("categoryname"));
    }
}