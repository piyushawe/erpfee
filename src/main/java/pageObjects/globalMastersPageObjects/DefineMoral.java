package pageObjects.globalMastersPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineMoral extends BaseClass {

  @FindBy(linkText = "Define Moral")private WebElement link;
  @FindBy(id = "Define Moral")private WebElement frame;

  public DefineMoral(WebDriver d) throws IOException {
     f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefineMoral.properties");
     PageFactory.initElements(d, this);
     readFile.readProperty(f1, "page");
  }

  public void openDefineMoral() throws IOException {
     ehandler.openFrame(readFile.getElement(file, "globalmastersmenu"), link, frame);
  }

  public void enterMoralName(String mname) throws IOException {
     ehandler.enterText(readFile.getElement(f1, "moralname"), mname);
  }

  public void enterMoralName(int n) throws IOException {
     ehandler.enterText(readFile.getElement(f1, "moralname"), n);
  }

  public void validateBlank() throws IOException {
    verify.validateBlankField(readFile.getElement(f1, "moralname"),readFile.readProperty(f1, "blankvalidationmessage"), readFile.getElement(f1, "blankvalidation"));
  }

  public void verifyCancel() throws IOException {
     verify.verifyCancel(readFile.getElement(f1, "moralname"));
  }
}

