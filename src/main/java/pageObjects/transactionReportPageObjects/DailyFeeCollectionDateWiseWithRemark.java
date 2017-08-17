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

  public void validateClass() throws IOException {
      WebElement cls= readFile.getElement(f1, "class");
      clear= readFile.getElement(f1, "classclear");
      close= readFile.getElement(f1, "classclose");
      message= readFile.getElement(f1, "classmessage");
      verify.verifyValidationOnMultiSelect(cls, clear, close, message, readFile.readProperty(file, "cls"));
  }

  public void validateEntryMode() throws IOException {
      WebElement emode= readFile.getElement(f1, "entrymode");
      clear= readFile.getElement(f1, "entrymodeclear");
      close= readFile.getElement(f1, "entrymodeclose");
      message= readFile.getElement(f1, "entrymodemessage");
      verify.verifyValidationOnMultiSelect(emode, clear, close, message, readFile.readProperty(file, "entrymode"));
  }

  public void validatePayMode() throws IOException {
      WebElement pmode= readFile.getElement(f1, "paymode");
      clear= readFile.getElement(f1, "paymodeclear");
      close= readFile.getElement(f1, "paymodeclose");
      message= readFile.getElement(f1, "paymodemessage");
      verify.verifyValidationOnMultiSelect(pmode, clear, close, message, readFile.readProperty(file, "paymode"));
  }

  public void validateBankName() throws IOException {
      WebElement bname= readFile.getElement(f1, "bankname");
      clear= readFile.getElement(f1, "banknameclear");
      close= readFile.getElement(f1, "banknameclose");
      message= readFile.getElement(f1, "banknamemessage");
      verify.verifyValidationOnMultiSelect(bname, clear, close, message, readFile.readProperty(file, "bankname"));
  }

  public void validateHead() throws IOException {
      WebElement head= readFile.getElement(f1, "head");
      clear= readFile.getElement(f1, "headclear");
      close= readFile.getElement(f1, "headclose");
      message= readFile.getElement(f1, "headmessage");
      verify.verifyValidationOnMultiSelect(head, clear, close, message, readFile.readProperty(file, "head"));
  }
}
