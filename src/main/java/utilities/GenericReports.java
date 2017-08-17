package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

public abstract class GenericReports extends GenericBaseClass implements GenericObjects {
   @FindBy(id = "ContentPlaceHolder1_ddlSchoolSubHead")private WebElement school;
   @FindBy(id = "ContentPlaceHolder1_ddlWings")private WebElement wing;
   @FindBy(id = "ContentPlaceHolder1_ddlboard")private WebElement board;
   @FindBy(id = "ContentPlaceHolder1_txtDateFrom_TextBox")private WebElement fromdate;
   @FindBy(id = "ContentPlaceHolder1_txtdateTo_TextBox")private WebElement todate;
   @FindBy(id = "ContentPlaceHolder1_chkReceiptNoRange")private WebElement receiptnorange;
   @FindBy(id = "ContentPlaceHolder1_txtFrom_TextBox")private WebElement receiptfrom;
   @FindBy(id = "ContentPlaceHolder1_txtTo_TextBox")private WebElement receiptto;
   @FindBy(id = "ContentPlaceHolder1_ddlUser")private WebElement user;
   @FindBy(xpath = "//input[@value='Show']")private WebElement show;
   @FindBy(className = "datepick-clear")private WebElement clr;
   @FindBy(className = "datepick-close")private WebElement cls;

   protected WebElement clear;
   protected WebElement close;
   protected WebElement message;
   protected File f1;

   public void selectFromDate(String mm, String yy, String dd) throws IOException {
      ehandler.selectDate(fromdate, mm, yy, dd);
   }

   public void selectToDate(String mm, String yy, String dd) throws IOException {
      ehandler.selectDate(todate, mm, yy, dd);
   }

   public void validateDateFrom() throws IOException {
      verify.verifyValidationOnMultiSelect(fromdate, clr, cls, readFile.getElement(f1, "datefrommessage"), readFile.readProperty(file, "datefrom"));
   }

   public void validateToDate() throws IOException {
      verify.verifyValidationOnMultiSelect(todate, clr, cls, readFile.getElement(f1, "datetomessage"), readFile.readProperty(file, "dateto"));
   }

   public void clickReceiptRange(){
      ehandler.click(receiptnorange);
   }

   public void enterReceiptFrom(String rfrom){
      ehandler.enterText(receiptfrom, rfrom);
   }

   public void enterReceiptFrom(int n){
      ehandler.enterText(receiptfrom, n);
   }

   public void enterReceiptTo(String rto){
      ehandler.enterText(receiptto, rto);
   }

   public void enterReceiptTo(int n){
      ehandler.enterText(receiptto, n);
   }

   public void pressEnterInReceiptFrom(){
      ehandler.pressEnter(receiptfrom);
   }

   public void pressEnterReceiptTo(){
      ehandler.pressEnter(receiptto);
   }
   public void validateReceiptFromMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(file, "receiptnomessage"), readFile.getElement(file, "receiptfrom"));
   }

   public void validateReceiptToMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(file, "receiptnomessage"), readFile.getElement(file, "receiptto"));
   }

   public void validateReceiptFromLength() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(file, "receiptnolengthmessage"), readFile.getElement(file, "receiptfromlength"));
   }

   public void validateReceiptToLength() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(file, "receiptnolengthmessage"), readFile.getElement(file, "receipttolength"));
   }

   public void validateDateAlertMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(file, "datemessage"), readFile.getElement(file, "popupmessage"));
   }

   public void validateBlankReceiptFromAlertMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(file, "receiptfromblankmessage"), readFile.getElement(file, "popupmessage"));
   }

   public void validateBlankReceiptToAlertMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(file, "receipttoblankmessage"), readFile.getElement(file, "popupmessage"));
   }

   public void validateInvalidReceiptRangeAlertMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(file, "invalidreceiptrangemessage"), readFile.getElement(file, "popupmessage"));
   }
   public void clickShow(){
      ehandler.click(show);
   }

}
