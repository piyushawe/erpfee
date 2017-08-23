package pageObjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class DailyFeeCollectionDateWise extends GenericReports{
  @FindBy(linkText = "Daily Fee Collection Date Wise")private WebElement link;
  @FindBy(id = "Daily Fee Collection Date Wise")private WebElement frame;

  public DailyFeeCollectionDateWise(WebDriver d) throws IOException {
      f1= new File("F:\\erpfee\\configuration\\transactionReport\\DailyFeeCollectionDateWise.properties");
      PageFactory.initElements(d, this);
      page= readFile.readProperty(f1, "page");
  }

  public void openDailyFeeCollectionDateWise() throws IOException {
      ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
      ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
  }

  public void validateBankName() throws IOException {
      WebElement ftype= readFile.getElement(f1, "bankname");
      clear= readFile.getElement(f1, "banknameclear");
      close= readFile.getElement(f1, "banknameclose");
      message= readFile.getElement(f1, "banknamemessage");
      verify.verifyValidationOnMultiSelect(ftype, clear, close, message, readFile.readProperty(file, "bankname"));
  }
}
