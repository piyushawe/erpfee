package pageobjects.transactionReportPageObjects;

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

  public DailyFeeCollection(WebDriver d) throws IOException {
     f1= new File("F:\\erpfee\\configuration\\transactionReport\\DailyFeeCollection.properties");
     PageFactory.initElements(d, this);
     page= readFile.readProperty(f1, "page");
  }

  public void openDailyFeeCollection() throws IOException {
     ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
     ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
  }

  private void getFeeTypeElements() throws IOException {
      element= readFile.getElement(f1, "feetype");
      clear= readFile.getElement(f1, "feetypeclear");
      values= readFile.getElement(f1, "feetypevalueslist");
      close= readFile.getElement(f1, "feetypeclose");
      message= readFile.getElement(f1, "feetypemessage");
  }

  public void validateFeeType() throws IOException {
      getFeeTypeElements();
      verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(file, "feetype"));
  }

  public void selectFeeType() throws IOException {
      getFeeTypeElements();
      ehandler.selectValue(element, clear, values, close);
  }

  public void clickSettlementdate() throws IOException {
      ehandler.click(readFile.getElement(f1, "settlementdate"));
  }

  public void clickChequeClearancedate() throws IOException {
      ehandler.click(readFile.getElement(f1, "chequeclearancedate"));
  }
}
