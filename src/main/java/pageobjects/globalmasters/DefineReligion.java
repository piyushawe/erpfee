package pageobjects.globalmasters;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.IOException;

public class DefineReligion extends BaseClass {
    @FindBy(linkText = "Define Religion") private WebElement link;
    @FindBy(id = "Define Religion") private WebElement frame;

    public DefineReligion(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDefineReligion() throws IOException {
        ehandler.openFrame(new UIMap().getGlobalMastersMenu(), link, frame);
    }

    public void enterReligionName(String pname) throws IOException {
        ehandler.enterText(readFile.getElement("religionname"), pname);
    }

    public void enterReligionName(int n) throws IOException {
        ehandler.enterText(readFile.getElement("religionname"), n);
    }

    public void validateBlank() throws IOException {
        verify.validateBlankField(readFile.getElement("religionname"),readFile.readProperty(file, "blankvalidationmessage"), readFile.getElement("blankvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement("religionname"));
    }
}
