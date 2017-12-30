package pageobjects.globalmasters;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.IOException;

public class TermMaster extends BaseClass{

  @FindBy(linkText = "Term Master")private WebElement link;
  @FindBy(id = "Term Master")private WebElement frame;

  public TermMaster(WebDriver d) {
      page = this.getClass().getSimpleName();
      pack = gm.getPackage(this.getClass().getPackage().getName());
      file = gm.getFilePath(page, pack);
      PageFactory.initElements(d, this);
  }

  public void openTermMaster() throws IOException {
     ehandler.openFrame(new UIMap().getGlobalMastersMenu(), link, frame);
  }

  public void enterTermName(String mname) throws IOException {
     ehandler.enterText(readFile.getElement("termname"), mname);
  }

  public void enterTermName(int n) throws IOException {
     ehandler.enterText(readFile.getElement("termname"), n);
  }

  public void validateBlank() throws IOException {
     verify.validateBlankField(readFile.getElement("termname"),readFile.readProperty(file, "blankvalidationmessage"), readFile.getElement("blankvalidation"));
  }

  public void verifyCancel() throws IOException {
     verify.verifyCancel(readFile.getElement("termname"));
  }
}
