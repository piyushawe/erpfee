package pageobjects.globalmasters;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.IOException;

public class DefineCharacter extends BaseClass {
  @FindBy(linkText = "Define Character") private WebElement link;
  @FindBy(id = "Define Character") private WebElement frame;

  public DefineCharacter(WebDriver d) {
      page = this.getClass().getSimpleName();
      pack = gm.getPackage(this.getClass().getPackage().getName());
      file = gm.getFilePath(page, pack);
      PageFactory.initElements(d, this);
  }

  public void openDefineCharacter() throws IOException {
     ehandler.openFrame(new UIMap().getGlobalMastersMenu(), link, frame);
  }

  public void enterCharacterName(String pname) throws IOException {
     ehandler.enterText(readFile.getElement("charactername"), pname);
  }

  public void enterCharacterName(int n) throws IOException {
     ehandler.enterText(readFile.getElement("charactername"), n);
  }

  public void validateBlank() throws IOException {
     verify.validateBlankField(readFile.getElement("charactername"),readFile.readProperty(file,"blankvalidationmessage"), readFile.getElement("blankvalidation"));
  }

  public void verifyCancel() throws IOException {
     verify.verifyCancel(readFile.getElement("charactername"));
  }
}