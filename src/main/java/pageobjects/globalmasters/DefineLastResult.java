package pageobjects.globalmasters;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.io.IOException;

public class DefineLastResult extends BaseClass {
   @FindBy(linkText = "Define Last Result")private WebElement link;
   @FindBy(id = "Define Last Result")private WebElement frame;

   public DefineLastResult(WebDriver d) {
      page = this.getClass().getSimpleName();
      pack = gm.getPackage(this.getClass().getPackage().getName());
      file = gm.getFilePath(page, pack);
      PageFactory.initElements(d, this);
   }

   public void openDefineLastResult() throws IOException {
      ehandler.openFrame(new UIMap().getGlobalMastersMenu(), link, frame);
   }

   public void enterLastResultName(String mname) throws IOException {
      ehandler.enterText(readFile.getElement("lastresultname"), mname);
   }

   public void enterLastResultName(int n) throws IOException {
      ehandler.enterText(readFile.getElement("lastresultname"), n);
   }

   public void validateBlank() throws IOException {
      verify.validateBlankField(readFile.getElement("lastresultname"),readFile.readProperty(file, "blankvalidationmessage"), readFile.getElement("blankvalidation"));
   }

   public void verifyCancel() throws IOException {
      verify.verifyCancel(readFile.getElement("lastresultname"));
   }
}