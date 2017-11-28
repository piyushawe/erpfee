package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class DailyFeeCollection extends GenericReports{
  @FindBy(linkText = "Daily Fee Collection")WebElement link;
  @FindBy(id = "Daily Fee Collection")WebElement frame;

  public DailyFeeCollection(WebDriver d) {
     page =  this.getClass().getSimpleName();
     pack = gm.getPackage(this.getClass().getPackage().getName());
     file = gm.getFilePath(page, pack);
     //f1= new File(path+"\\transactionreport\\"+page+".properties");
     PageFactory.initElements(d, this);
      System.out.println(page);
  }

  public void openDailyFeeCollection() throws IOException {
     ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
     ehandler.openFrame(readFile.getElement(fileUI, "collectionsubmenu"), link, frame);
  }

  private void getFeeTypeElements() throws IOException {
      element= readFile.getElement("feetype");
      clear= readFile.getElement("feetypeclear");
      values= readFile.getElement("feetypevalueslist");
      close= readFile.getElement("feetypeclose");
      message= readFile.getElement("feetypemessage");
  }

  public void validateFeeType() throws IOException {
      getFeeTypeElements();
      verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "feetype"));
  }

  public void selectFeeType() throws IOException {
      getFeeTypeElements();
      ehandler.selectValue(element, clear, values, close);
  }

  @Override
  public void clickSettlementDate() throws IOException {
      ehandler.click(readFile.getElement("settlementdate"));
  }

  @Override
  public void clickChequeClearanceDate() throws IOException {
      ehandler.click(readFile.getElement("chequeclearancedate"));
  }
}