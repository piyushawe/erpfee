package pageObjects.transactionReportPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class DailyFeeCollectionDateWiseWithRemark extends GenericReports {

  @FindBy(linkText = "Daily Fee Collection Date Wise With Remark")WebElement link;
  @FindBy(id = "Daily Fee Collection Date Wise With Remark")WebElement frame;

  public DailyFeeCollectionDateWiseWithRemark(WebDriver d) throws IOException {
     f1= new File("F:\\erpfee\\configuration\\transactionReport\\DailyFeeCollectionDateWiseWithRemark.properties");
     PageFactory.initElements(d, this);
     page= readFile.readProperty(f1,"page");
  }

  public void openDailyFeeCollectionDateWiseWithRemark() throws IOException {
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

  private void getChequeDetailsElements() throws IOException {
      element= readFile.getElement(f1, "chequedetails");
      clear= readFile.getElement(f1, "chequedetailsclear");
      values= readFile.getElement(f1, "chequedetailsvalueslist");
      close= readFile.getElement(f1, "chequedetailsclose");
  }

  private void getOtherDetailsElements() throws IOException {
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
      getChequeDetailsElements();
      ehandler.selectValue(element, clear, values, close);
  }

  public void selectOtherDetails() throws IOException {
      getOtherDetailsElements();
      ehandler.selectValue(element, clear, values, close);
  }

  public void selectNewOld(int newold) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "newold"), newold);
  }

  public void selectStudentStatus(int status) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "studentstatus"), status);
  }
}
