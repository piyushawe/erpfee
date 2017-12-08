package pageobjects.globalmasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineMotherTongue extends BaseClass{

  @FindBy(linkText = "Define Mother Tongue")private WebElement link;
  @FindBy(id = "Define Mother Tongue")private WebElement frame;

  public DefineMotherTongue(WebDriver d) throws IOException {
      page = this.getClass().getSimpleName();
      pack = gm.getPackage(this.getClass().getPackage().getName());
      file = gm.getFilePath(page, pack);
      PageFactory.initElements(d, this);
  }

  public void openDefineMotherTongue() throws IOException {
     ehandler.openFrame(readFile.getElement(fileUI, "globalmastersmenu"), link, frame);
  }

  public void enterMotherTongue(String mtongue) throws IOException {
     ehandler.enterText(readFile.getElement("mothertongue"), mtongue);
  }

  public void enterMotherTongue(int n) throws IOException {
      ehandler.enterText(readFile.getElement("mothertongue"), n);
  }

  public void verifyCharactersSaved() throws IOException {
      ehandler.verifyString();
  }

  public void validateBlank() throws IOException {
      verify.validateBlankField(readFile.getElement("mothertongue"),readFile.readProperty(file, "blankvalidationmessage"), readFile.getElement("blankvalidation"));
  }

  public void verifyCancel() throws IOException {
      verify.verifyCancel(readFile.getElement("mothertongue"));
  }
}