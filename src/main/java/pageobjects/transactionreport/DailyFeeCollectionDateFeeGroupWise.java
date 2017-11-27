package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class DailyFeeCollectionDateFeeGroupWise extends GenericReports {
  @FindBy(linkText = "Daily Fee Collection Date/Fee Group Wise")private WebElement link;
  @FindBy(id = "Daily Fee Collection Date/Fee Group Wise ")private WebElement frame;

  public DailyFeeCollectionDateFeeGroupWise(WebDriver d) throws IOException {
     f1= new File("F:\\erpfee\\configuration\\transactionReport\\DailyFeeCollectionDateFeeGroupWise.properties");
     PageFactory.initElements(d, this);
     page= readFile.readProperty(f1, "page");
  }

  public void openDailyFeeCollectionDateFeeGroupWise() throws IOException {
     ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
     ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
  }

  private void getFeeGroupElements() throws IOException {
      element= readFile.getElement(f1, "feegroup");
      clear= readFile.getElement(f1, "feegroupclear");
      values= readFile.getElement(f1, "feegroupvalueslist");
      close= readFile.getElement(f1, "feegroupclose");
      message= readFile.getElement(f1, "feegroupmessage");
  }

  public void validateFeeGroup() throws IOException {
     getFeeGroupElements();
     verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(file, "feegroup"));
  }

  public void selectFeeGroup() throws IOException {
     getFeeGroupElements();
     ehandler.selectValue(element, clear, values, close);
  }
}