package pageobjects.globalmasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefinePromotionMaster extends BaseClass {
    @FindBy(linkText = "Define Promotion Master")private WebElement link;
    @FindBy(id = "Define Promotion Master ")private WebElement frame;

    public DefinePromotionMaster(WebDriver d) throws IOException {
        f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefinePromotionMaster.properties");
        PageFactory.initElements(d, this);
        readFile.readProperty(f1, "page");
    }

    public void openDefinePromotionMaster() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "globalmastersmenu"), link, frame);
    }

    public void enterPromotionName(String pname) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "promotionname"), pname);
    }

    public void enterPromotionNameNTimes(int n) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "promotionname"), n);
    }

    public void validateBlank() throws IOException {
        verify.validateBlankField(readFile.getElement(f1, "promotionname"),readFile.readProperty(f1, "blankvalidationmessage"), readFile.getElement(f1, "blankvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement(f1, "promotionname"));
    }
}
