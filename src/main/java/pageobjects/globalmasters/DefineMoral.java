package pageobjects.globalmasters;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.IOException;

public class DefineMoral extends BaseClass {

  @FindBy(linkText = "Define Moral")private WebElement link;
  @FindBy(id = "Define Moral")private WebElement frame;

  public DefineMoral(WebDriver d) throws IOException {
      page = this.getClass().getSimpleName();
      pack = gm.getPackage(this.getClass().getPackage().getName());
      file = gm.getFilePath(page, pack);
      PageFactory.initElements(d, this);
  }

  public void openDefineMoral() throws IOException {
     ehandler.openFrame(new UIMap().getGlobalMastersMenu(), link, frame);
  }

  public void enterMoralName(String mname) throws IOException {
     ehandler.enterText(readFile.getElement("moralname"), mname);
  }

  public void enterMoralName(int n) throws IOException {
     ehandler.enterText(readFile.getElement("moralname"), n);
  }

  public void validateBlank() throws IOException {
    verify.validateBlankField(readFile.getElement("moralname"),readFile.readProperty(file, "blankvalidationmessage"), readFile.getElement("blankvalidation"));
  }

  public void verifyCancel() throws IOException {
     verify.verifyCancel(readFile.getElement("moralname"));
  }
}