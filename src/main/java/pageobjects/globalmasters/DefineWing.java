package pageobjects.globalmasters;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.IOException;

public class DefineWing extends BaseClass {
    @FindBy(linkText = "Define Wing")private WebElement link;
    @FindBy(id = "Define Wing")private WebElement frame;

    public DefineWing(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDefineWing() throws IOException {
        ehandler.openFrame(new UIMap().getGlobalMastersMenu(), link, frame);
    }

    public void enterWingName(String mname) throws IOException {
        ehandler.enterText(readFile.getElement("wingname"), mname);
    }

    public void enterWingName(int n) throws IOException {
        ehandler.enterText(readFile.getElement("wingname"), n);
    }

    public void validateBlank() throws IOException {
        verify.validateBlankField(readFile.getElement("wingname"),readFile.readProperty(file, "blankvalidationmessage"), readFile.getElement("blankvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement("wingname"));
    }
}
