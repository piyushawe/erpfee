package pageobjects.transactionReportPageObjects;

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

  private void getBankNameElements() throws IOException {
      element= readFile.getElement(f1, "bankname");
      clear= readFile.getElement(f1, "banknameclear");
      values= readFile.getElement(f1, "banknamevalueslist");
      close= readFile.getElement(f1, "banknameclose");
      message= readFile.getElement(f1, "banknamemessage");
  }

  private void getChequeDetails() throws IOException {
      element= readFile.getElement(f1, "chequedetails");
      clear= readFile.getElement(f1, "chequedetailsclear");
      values= readFile.getElement(f1, "chequedetailsvalueslist");
      close= readFile.getElement(f1, "chequedetailsclose");
  }

  private void getOtherDetails() throws IOException {
      element= readFile.getElement(f1, "otherdetails");
      clear= readFile.getElement(f1, "otherdetailsclear");
      values= readFile.getElement(f1, "otherdetailsvalueslist");
      close= readFile.getElement(f1, "otherdetailsclose");
  }

  public void validateBankName() throws IOException {
      getBankNameElements();
      verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(file, "bankname"));
  }

  public void selectBankName() throws IOException {
      getBankNameElements();
      ehandler.selectValue(element, clear, values, close);
  }

  public void selectChequeDetails() throws IOException {
      getChequeDetails();
      ehandler.selectValue(element, clear, values, close);
  }

  public void selectOtherDetails() throws IOException {
      getOtherDetails();
      ehandler.selectValue(element, clear, values, close);
  }
}
