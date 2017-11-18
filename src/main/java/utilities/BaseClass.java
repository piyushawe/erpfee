package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import supportclasses.GenericBaseClass;

import java.io.File;
import java.io.IOException;

public abstract class BaseClass extends GenericBaseClass implements GenericObjects {

    @FindBy(xpath = "//input[@value='Save']") private WebElement save;
    @FindBy(xpath = "//input[@value='View']") private WebElement view;
    @FindBy(xpath = "//input[@value='Modify']") private WebElement modify;
    @FindBy(xpath = "//input[@value='Delete']") private WebElement delete;
    @FindBy(xpath = "//input[@value='Cancel']") private WebElement cancel;
    @FindAll({@FindBy(id = "example"), @FindBy(id = "example1")}) private WebElement table;
    protected File f1;

    public void clickSave(){
        ehandler.click(save);
    }

    public void clickView() throws IOException {
        ehandler.click(view);
    }

    public void selectRecord() throws IOException {
        ehandler.selectRecord(table, readFile.getElement(file, "select"));
    }

    public void clickModify() throws IOException {
        ehandler.click(modify);
    }

    public void clickYes() throws IOException {
        ehandler.click(readFile.getElement(file,"yes"));
    }

    public void clickNo() throws IOException {
        ehandler.click(readFile.getElement(file,"no"));
    }

    public void clickDelete() throws IOException {
        ehandler.click(delete);
    }

    public void clickCancel(){
        ehandler.click(cancel);
    }

    protected String getMessage() throws IOException {
        return readFile.readProperty(file, "message");
    }

    public void verifyModifyMessage() throws IOException {
        dmethods.switchToParentWindow();
        verify.verifyValidationMessage(readFile.readProperty(f1, "modifymessage"),readFile.getElement(file, "servermessage"));
    }

    public void verifyDuplicateValue() throws IOException {
        dmethods.switchToParentWindow();
        verify.verifyValidationMessage(readFile.readProperty(f1, "duplicatevaluemessage"), readFile.getElement(file, "servermessage"));
    }

    public void verifySaveMessage() throws IOException {
        dmethods.switchToParentWindow();
        verify.verifyValidationMessage(readFile.readProperty(f1, "savemessage"),readFile.getElement(file, "servermessage"));
    }

    public void verifyDeleteMessage() throws IOException {
        dmethods.switchToParentWindow();
        verify.verifyValidationMessage(readFile.readProperty(f1, "deletemessage"), readFile.getElement(file, "servermessage"));
    }

    public void validateNumericValue() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(f1,"numbervalidationmessage"), readFile.getElement(f1,"numbervalidation"));
    }

    public void validateLength() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(f1,"characterlengthvalidationmessage"), readFile.getElement(f1,"lengthvalidation"));
    }

    public void verifySuccessMessageImage() throws IOException {
        verify.verifyMessageImage(readFile.getElement(file, "messageimage"), readFile.readProperty(file, "url"), readFile.readProperty(file, "successimage"));
    }

    public void verifyWarningMessageImage() throws IOException {
        verify.verifyMessageImage(readFile.getElement(file, "messageimage"), readFile.readProperty(file, "url"), readFile.readProperty(file, "warningimage"));
    }

    public void verifyErrorMessageImage() throws IOException {
        verify.verifyMessageImage(readFile.getElement(file, "messageimage"), readFile.readProperty(file, "url"), readFile.readProperty(file, "errorimage"));
    }
}
