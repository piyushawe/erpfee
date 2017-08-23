package pageObjects.transactionReportPageObjects;

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

  public void validateFeeType() throws IOException {
      WebElement ftype= readFile.getElement(f1, "feetype");
      clear= readFile.getElement(f1, "feetypeclear");
      close= readFile.getElement(f1, "feetypeclose");
      message= readFile.getElement(f1, "feetypemessage");
      verify.verifyValidationOnMultiSelect(ftype, clear, close, message, readFile.readProperty(file, "feetype"));
  }
}
