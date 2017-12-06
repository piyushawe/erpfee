package pageobjects.transactionreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DailyFeeCollectionDateWise extends GenericReports{
  @FindBy(linkText = "Daily Fee Collection Date Wise")private WebElement link;
  @FindBy(id = "Daily Fee Collection Date Wise")private WebElement frame;

  public DailyFeeCollectionDateWise(WebDriver d) {
      page =  this.getClass().getSimpleName();
      pack = gm.getPackage(this.getClass().getPackage().getName());
      file = gm.getFilePath(page, pack);
      PageFactory.initElements(d, this);
  }

  public void openDailyFeeCollectionDateWise() throws IOException {
      ehandler.moveToElement(readFile.getElement(fileUI, "transactionreportmenu"));
      ehandler.openFrame(readFile.getElement(fileUI, "collectionsubmenu"), link, frame);
  }

  private void getBankNameElements() throws IOException {
      element= readFile.getElement("bankname");
      clear= readFile.getElement("banknameclear");
      values= readFile.getElement("banknamevalueslist");
      close= readFile.getElement("banknameclose");
      message= readFile.getElement("banknamemessage");
  }

  private void getChequeDetails() throws IOException {
      element= readFile.getElement("chequedetails");
      clear= readFile.getElement("chequedetailsclear");
      values= readFile.getElement("chequedetailsvalueslist");
      close= readFile.getElement("chequedetailsclose");
  }

  private void getOtherDetails() throws IOException {
      element= readFile.getElement("otherdetails");
      clear= readFile.getElement("otherdetailsclear");
      values= readFile.getElement("otherdetailsvalueslist");
      close= readFile.getElement("otherdetailsclose");
  }

  public void validateBankName() throws IOException {
      getBankNameElements();
      verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "bankname"));
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