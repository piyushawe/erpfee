package pageobjects.globalmasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineLanguage extends BaseClass{
  @FindBy(linkText = "Define Language")private WebElement link;
  @FindBy(id = "Define Language")private WebElement frame;

  public DefineLanguage(WebDriver d) throws IOException {
      page = this.getClass().getSimpleName();
      pack = gm.getPackage(this.getClass().getPackage().getName());
      file = gm.getFilePath(page, pack);
      PageFactory.initElements(d, this);
  }

  public void openDefineLanguage() throws IOException {
     ehandler.openFrame(readFile.getElement(fileUI,"globalmastersmenu"), link, frame);
  }

  public void enterLanguageName(String pname) throws IOException {
     ehandler.enterText(readFile.getElement("languagename"), pname);
  }

  public void enterLanguageName(int n) throws IOException {
     ehandler.enterText(readFile.getElement("languagename"), n);
  }

  public void validateBlank() throws IOException {
     verify.validateBlankField(readFile.getElement("languagename"),readFile.readProperty(file,"blankvalidationmessage"), readFile.getElement("blankvalidation"));
  }

  public void verifyCancel() throws IOException {
     verify.verifyCancel(readFile.getElement("languagename"));
  }
}
