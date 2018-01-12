package pageobjects.globalmasters;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.IOException;

public class DefinePromotionMaster extends BaseClass {
    @FindBy(linkText = "Define Promotion Master")private WebElement link;
    @FindBy(id = "Define Promotion Master ")private WebElement frame;

    public DefinePromotionMaster(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDefinePromotionMaster() throws IOException {
        ehandler.openFrame(new UIMap().getGlobalMastersMenu(), link, frame);
    }

    public void enterPromotionName(String pname) throws IOException {
        ehandler.enterText(readFile.getElement("promotionname"), pname);
    }

    public void enterPromotionNameNTimes(int n) throws IOException {
        ehandler.enterText(readFile.getElement("promotionname"), n);
    }

    public void validateBlank() throws IOException {
        verify.validateBlankField(readFile.getElement("promotionname"),readFile.readProperty(file, "blankvalidationmessage"), readFile.getElement("blankvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement("promotionname"));
    }
}
