package pageObjects.globalMastersPageObjects;

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
     f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefineLanguage.properties");
     PageFactory.initElements(d, this);
     page= readFile.readProperty(f1,"page");
  }

  public void openDefineLanguage() throws IOException {
     ehandler.openFrame(readFile.getElement(file,"globalmastersmenu"), link, frame);
  }

  public void enterLanguageName(String pname) throws IOException {
     ehandler.enterText(readFile.getElement(f1,"languagename"), pname);
  }

  public void enterLanguageName(int n) throws IOException {
     ehandler.enterText(readFile.getElement(f1,"languagename"), n);
  }

  public void validateBlank() throws IOException {
     verify.validateBlankField(readFile.getElement(f1,"languagename"),readFile.readProperty(f1,"blankvalidationmessage"), readFile.getElement(f1,"blankvalidation"));
  }

  public void verifyCancel() throws IOException {
     verify.verifyCancel(readFile.getElement(f1,"languagename"));
  }
}
