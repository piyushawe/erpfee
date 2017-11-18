package pageobjects.globalMastersPageObjects;

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
        f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefineSection.properties");
        PageFactory.initElements(d, this);
        page= readFile.readProperty(f1,"page");
    }

    public void openDefineSection() throws IOException {

        ehandler.openFrame(readFile.getElement(file,"globalmastersmenu"), link, frame);
    }

    public void enterSectionName(String section) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "sectionname"), section);
    }

    public void enterOrderNo(String orderno) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "orderno"), orderno);
    }

    public void enterSectionName(int section) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "sectionname"), section);
    }

    public void enterOrderNo(int orderno) throws IOException {
        ehandler.enterText(readFile.getElement(f1, "orderno"), orderno);
    }

    public void validateBlankOnSectionName() throws IOException {
        verify.validateBlankField(readFile.getElement(f1, "sectionname"), readFile.readProperty(f1, "sectionnameblankvalidationmessage"), readFile.getElement(f1, "sectionnameblankvalidation"));
    }

    public void validateBlankOnOrderNo() throws IOException {
        verify.validateBlankField(readFile.getElement(f1, "orderno"), readFile.readProperty(f1, "ordernoblankvalidationmessage"), readFile.getElement(f1, "ordernoblankvalidation"));
    }

    public void validateLengthOnSectionName() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(f1,"sectionnamelengthvalidationmessage"), readFile.getElement(f1,"sectionnamelengthvalidation"));
    }

    public void validateLengthOnOrderNo() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(f1,"ordernolengthvalidationmessage"), readFile.getElement(f1,"ordernolengthvalidation"));
    }

    @Override
    public void validateNumericValue() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(f1,"ordernonumericvalidationmessage"), readFile.getElement(f1,"ordernonumericvalidation"));
    }

    public void verifyCancel() throws IOException {
        verify.verifyCancel(readFile.getElement(f1,"sectionname"));
        verify.verifyCancel(readFile.getElement(f1,"orderno"));
    }
}
