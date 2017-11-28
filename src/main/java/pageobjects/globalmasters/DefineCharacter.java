package pageobjects.globalmasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineCharacter extends BaseClass {
  @FindBy(linkText = "Define Character") private WebElement link;
  @FindBy(id = "Define Character") private WebElement frame;

  public DefineCharacter(WebDriver d) throws IOException {
     f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefineCharacter.properties");
     PageFactory.initElements(d, this);
     page= readFile.readProperty(f1,"page");
  }

  public void openDefineCharacter() throws IOException {
     ehandler.openFrame(readFile.getElement(fileUI,"globalmastersmenu"), link, frame);
  }

  public void enterCharacterName(String pname) throws IOException {
     ehandler.enterText(readFile.getElement(f1,"charactername"), pname);
  }

  public void enterCharacterName(int n) throws IOException {
     ehandler.enterText(readFile.getElement(f1,"charactername"), n);
  }

  public void validateBlank() throws IOException {
     verify.validateBlankField(readFile.getElement(f1,"charactername"),readFile.readProperty(f1,"blankvalidationmessage"), readFile.getElement(f1,"blankvalidation"));
  }

  public void verifyCancel() throws IOException {
     verify.verifyCancel(readFile.getElement(f1,"charactername"));
  }
}
