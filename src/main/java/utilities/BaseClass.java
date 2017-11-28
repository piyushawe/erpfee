package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import supportclasses.GenericBaseClass;

import java.io.File;
import java.io.IOException;

public abstract class BaseClass extends GenericBaseClass {

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
        ehandler.selectRecord(table, readFile.getElement(fileUI, "select"));
    }

    public void clickModify() throws IOException {
        ehandler.click(modify);
    }

    public void clickYes() throws IOException {
        ehandler.click(readFile.getElement(fileUI,"yes"));
    }

    public void clickNo() throws IOException {
        ehandler.click(readFile.getElement(fileUI,"no"));
    }

    public void clickDelete() throws IOException {
        ehandler.click(delete);
    }

    public void clickCancel(){
        ehandler.click(cancel);
    }

    protected String getMessage() throws IOException {
        return readFile.readProperty(fileUI, "message");
    }

    public void verifyModifyMessage() throws IOException {
        dm.switchToParentWindow();
        verify.verifyValidationMessage(readFile.readProperty(f1, "modifymessage"),readFile.getElement(fileUI, "servermessage"));
    }

    public void verifyDuplicateValue() throws IOException {
        dm.switchToParentWindow();
        verify.verifyValidationMessage(readFile.readProperty(f1, "duplicatevaluemessage"), readFile.getElement(fileUI, "servermessage"));
    }

    public void verifySaveMessage() throws IOException {
        dm.switchToParentWindow();
        verify.verifyValidationMessage(readFile.readProperty(f1, "savemessage"),readFile.getElement(fileUI, "servermessage"));
    }

    public void verifyDeleteMessage() throws IOException {
        dm.switchToParentWindow();
        verify.verifyValidationMessage(readFile.readProperty(f1, "deletemessage"), readFile.getElement(fileUI, "servermessage"));
    }

    public void validateNumericValue() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(f1,"numbervalidationmessage"), readFile.getElement(f1,"numbervalidation"));
    }

    public void validateLength() throws IOException {
        verify.verifyValidationMessage(readFile.readProperty(f1,"characterlengthvalidationmessage"), readFile.getElement(f1,"lengthvalidation"));
    }

    public void verifySuccessMessageImage() throws IOException {
        verify.verifyMessageImage(readFile.getElement(fileUI, "messageimage"), readFile.readProperty(fileUI, "url"), readFile.readProperty(fileUI, "successimage"));
    }

    public void verifyWarningMessageImage() throws IOException {
        verify.verifyMessageImage(readFile.getElement(fileUI, "messageimage"), readFile.readProperty(fileUI, "url"), readFile.readProperty(fileUI, "warningimage"));
    }

    public void verifyErrorMessageImage() throws IOException {
        verify.verifyMessageImage(readFile.getElement(fileUI, "messageimage"), readFile.readProperty(fileUI, "url"), readFile.readProperty(fileUI, "errorimage"));
    }
}
