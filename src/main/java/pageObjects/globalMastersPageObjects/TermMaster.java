package pageObjects.globalMastersPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class TermMaster extends BaseClass{

  @FindBy(linkText = "Term Master")private WebElement link;
  @FindBy(id = "Term Master")private WebElement frame;

  public TermMaster(WebDriver d) throws IOException {
     f1= new File("F:\\erpfee\\configuration\\globalMasters\\TermMaster.properties");
     PageFactory.initElements(d, this);
     readFile.readProperty(f1, "page");
  }

  public void openTermMaster() throws IOException {
     ehandler.openFrame(readFile.getElement(file, "globalmastersmenu"), link, frame);
  }

  public void enterTermName(String mname) throws IOException {
     ehandler.enterText(readFile.getElement(f1, "termname"), mname);
  }

  public void enterTermName(int n) throws IOException {
     ehandler.enterText(readFile.getElement(f1, "termname"), n);
  }

  public void validateBlank() throws IOException {
     verify.validateBlankField(readFile.getElement(f1, "termname"),readFile.readProperty(f1, "blankvalidationmessage"), readFile.getElement(f1, "blankvalidation"));
  }

  public void verifyCancel() throws IOException {
     verify.verifyCancel(readFile.getElement(f1, "termname"));
  }
}
