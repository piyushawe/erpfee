package pageobjects.globalmasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineSection extends BaseClass {
    @FindBy(xpath = "//*[contains(text(),'Define Section')]")private WebElement link;
    @FindBy(id = "Define Section")private WebElement frame;

    public DefineSection(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDefineSection() throws IOException {

        ehandler.openFrame(readFile.getElement(fileUI,"globalmastersmenu"), link, frame);
    }

    public void enterSectionName(String section) throws IOException {
        ehandler.enterText(readFile.getElement("sectionname"), section);
    }

    public void enterOrderNo(String orderno) throws IOException {
        ehandler.enterText(readFile.getElement("orderno"), orderno);
    }

    public void enterSectionName(int section) throws IOException {
        ehandler.enterText(readFile.getElement(file, "sectionname"), section);
    }

    public void enterOrderNo(int orderno) throws IOException {
        ehandler.enterText(readFile.getElement("orderno"), orderno);
    }

    public void validateBlankOnSectionName() throws IOException {
        verify.validateBlankField(readFile.getElement("sectionname"), readFile.readProperty(file, "sectionnameblankvalidationmessage"), readFile.getElement("sectionnameblankvalidation"));
    }

    public void validateBlankOnOrderNo() throws IOException {
        verify.validateBlankField(readFile.getElement("orderno"), readFile.readProperty(file, "ordernoblankvalidationmessage"), readFile.getElement("ordernoblankvalidation"));
    }

    public void validateLengthOnSectionName() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(file, "sectionnamelengthvalidationmessage"), readFile.getElement("sectionnamelengthvalidation"));
    }

    public void validateLengthOnOrderNo() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(file,"ordernolengthvalidationmessage"), readFile.getElement("ordernolengthvalidation"));
    }

    @Override
    public void validateNumericValue() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(file,"ordernonumericvalidationmessage"), readFile.getElement("ordernonumericvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement("sectionname"));
        verify.verifyCancel(readFile.getElement("orderno"));
    }
}