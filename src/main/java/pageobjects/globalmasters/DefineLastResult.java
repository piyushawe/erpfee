package pageobjects.globalmasters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.File;
import java.io.IOException;

public class DefineLastResult extends BaseClass {
   @FindBy(linkText = "Define Last Result")private WebElement link;
   @FindBy(id = "Define Last Result")private WebElement frame;

   public DefineLastResult(WebDriver d) throws IOException {
      f1= new File("F:\\erpfee\\configuration\\globalMasters\\DefineLastResult.properties");
      PageFactory.initElements(d, this);
      readFile.readProperty(f1, "page");
   }

   public void openDefineLastResult() throws IOException {
      ehandler.openFrame(readFile.getElement(file, "globalmastersmenu"), link, frame);
   }

   public void enterLastResultName(String mname) throws IOException {
      ehandler.enterText(readFile.getElement(f1, "lastresultname"), mname);
   }

   public void enterLastResultName(int n) throws IOException {
      ehandler.enterText(readFile.getElement(f1, "lastresultname"), n);
   }

   public void validateBlank() throws IOException {
      verify.validateBlankField(readFile.getElement(f1, "lastresultname"),readFile.readProperty(f1, "blankvalidationmessage"), readFile.getElement(f1, "blankvalidation"));
   }

   public void verifyCancel() throws IOException {
      verify.verifyCancel(readFile.getElement(f1, "lastresultname"));
   }
}
