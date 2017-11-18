package pageobjects.globalMastersPageObjects;

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
     f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefineMotherTongue.properties");
     PageFactory.initElements(d, this);
     page= readFile.readProperty(f1, "page");
  }

  public void openDefineMotherTongue() throws IOException {
     ehandler.openFrame(readFile.getElement(file, "globalmastersmenu"), link, frame);
  }

  public void enterMotherTongue(String mtongue) throws IOException {
     ehandler.enterText(readFile.getElement(f1,"mothertongue"), mtongue);
  }

  public void enterMotherTongue(int n) throws IOException {
      ehandler.enterText(readFile.getElement(f1,"mothertongue"), n);
  }

  public void verifyCharactersSaved(){
      ehandler.verifyString();
  }

  public void validateBlank() throws IOException {
      verify.validateBlankField(readFile.getElement(f1, "mothertongue"),readFile.readProperty(f1, "blankvalidationmessage"), readFile.getElement(f1, "blankvalidation"));
  }

  public void verifyCancel() throws IOException {
      verify.verifyCancel(readFile.getElement(f1, "mothertongue"));
  }
}
