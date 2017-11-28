package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import supportclasses.GenericBaseClass;
import webdriver.DriverMethods;

import java.io.File;
import java.io.IOException;

public abstract class GenericReports extends GenericBaseClass {

   @FindBy(id = "ContentPlaceHolder1_txtDateFrom_TextBox") protected WebElement fromdate;
   @FindBy(id = "ContentPlaceHolder1_txtdateTo_TextBox") private WebElement todate;
   @FindBy(id = "ContentPlaceHolder1_chkReceiptNoRange") private WebElement receiptnorange;
   @FindBy(id = "ContentPlaceHolder1_txtFrom_TextBox") private WebElement receiptfrom;
   @FindBy(id = "ContentPlaceHolder1_txtTo_TextBox") private WebElement receiptto;
   @FindBy(xpath = "//input[@value='Show']") private WebElement show;
   @FindBy(className = "datepick-clear") protected WebElement clr;
   @FindBy(className = "datepick-close") private WebElement cls;

   protected WebElement element;
   protected WebElement clear;
   protected WebElement values;
   protected WebElement close;
   protected WebElement message;
   protected File f1;
   protected String path= "F:\\erpfee\\configuration\\";

   private void getClassElements() throws IOException {
      element= readFile.getElement(f1, "class");
      clear= readFile.getElement(f1, "classclear");
      values= readFile.getElement(f1, "classvalueslist");
      close= readFile.getElement(f1, "classclose");
      message= readFile.getElement(f1, "classmessage");
   }

   private void getEntryModeElements() throws IOException {
      element= readFile.getElement(f1, "entrymode");
      clear= readFile.getElement(f1, "entrymodeclear");
      values= readFile.getElement(f1, "entrymodevalueslist");
      close= readFile.getElement(f1, "entrymodeclose");
      message= readFile.getElement(f1, "entrymodemessage");
   }

   private void getPayModeElements() throws IOException {
      element= readFile.getElement(f1, "paymode");
      clear= readFile.getElement(f1, "paymodeclear");
      values= readFile.getElement(f1, "paymodevalueslist");
      close= readFile.getElement(f1, "paymodeclose");
      message= readFile.getElement(f1, "paymodemessage");
   }

   private void getHeadElements() throws IOException {
      element= readFile.getElement(f1, "head");
      clear= readFile.getElement(f1, "headclear");
      values= readFile.getElement(f1, "headvalueslist");
      close= readFile.getElement(f1, "headclose");
      message= readFile.getElement(f1, "headmessage");
   }

   private void getInstallmentElements() throws IOException {
      element= readFile.getElement(f1, "installment");
      clear= readFile.getElement(f1, "installmentclear");
      values= readFile.getElement(f1, "installmentvalueslist");
      close= readFile.getElement(f1, "installmentclose");
      message= readFile.getElement(f1, "installmentmessage");
   }

   public void validateClass() throws IOException {
      getClassElements();
      verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "cls"));
   }

   public void validateEntryMode() throws IOException {
      getEntryModeElements();
      verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "entrymode"));
   }

   public void validatePayMode() throws IOException {
      getPayModeElements();
      verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "paymode"));
   }

   public void validateHead() throws IOException {
      getHeadElements();
      verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "head"));
   }

   public void validateInstallment() throws IOException {
      getInstallmentElements();
      verify.verifyValidationOnMultiSelect(element, clear, close, message, readFile.readProperty(fileUI, "installment"));
   }

   public void selectSchool(int index) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "school"), index);
   }

   public void selectWing(int index) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "wing"), index);
   }

   public void selectClass() throws IOException {
      getClassElements();
      ehandler.selectValue(element, clear, values, close);
   }

   public void selectClass(int index) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "class"), 1);
   }

   public void selectBoard(int index) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "board"), 1);
   }

   public void selectSection(int index) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "section"), 1);
   }

   public void selectInstallment() throws IOException {
      getInstallmentElements();
      ehandler.selectValue(element, clear, values, close);
   }

   public void selectInstallment(int index) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "installment"), index);
   }

   public void selectInstallment(String inst) throws IOException, InterruptedException {
      ehandler.selectByVisibleText(readFile.getElement(f1, "installment"), inst);
   }

   public void selectEntryMode() throws IOException, InterruptedException {
      getEntryModeElements();
      ehandler.selectValue(element, clear, values, close);
   }

   public void selectPayMode() throws IOException {
      getPayModeElements();
      ehandler.selectValue(element, clear, values, close);
   }

   public void selectHead() throws IOException {
      getHeadElements();
      ehandler.selectValue(element, clear, values, close);
   }

   public void selectFeeType(int index) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "feetype"), index);
   }

   public void selectUser(int index) throws IOException, InterruptedException {
      ehandler.selectByIndex(readFile.getElement(f1, "user"), index);
   }

   public void selectFromDate(String mm, String yy, String dd) throws IOException, InterruptedException {
      ehandler.selectDate(fromdate, mm, yy, dd);
   }

   public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
      ehandler.selectDate(todate, mm, yy, dd);
   }

   public void validateDateFrom() throws IOException{
      verify.verifyValidationOnMultiSelect(fromdate, clr, readFile.getElement(f1, "datefrommessage"), readFile.readProperty(fileUI, "datefrom"));
   }

   public void validateToDate() throws IOException {
      verify.verifyValidationOnMultiSelect(todate, clr, readFile.getElement(f1, "datetomessage"), readFile.readProperty(fileUI, "dateto"));
   }

   public void validateTillDate() throws IOException {
      verify.verifyValidationOnMultiSelect(todate, clr, readFile.getElement(f1, "tilldatemessage"), readFile.readProperty(fileUI, "tilldate"));
   }

   public void clickReceiptRange(){
      new DriverMethods().waitUntil(receiptnorange, 1000);
      ehandler.click(receiptnorange);
   }

   public void clickButton(String value) throws IOException {
      ehandler.clickRadioButton(readFile.getElements(f1, "radiobuttongroup"), value);
   }

   public void clickSettlementDate() throws IOException {
      ehandler.click(readFile.getElement(f1, "settlementdate"));
   }

   public void clickChequeClearanceDate() throws IOException {
      ehandler.click(readFile.getElement(f1, "chequeclearancedate"));
   }

   public void clickDateRange() throws IOException {
      ehandler.click(readFile.getElement(f1, "daterange"));
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
      verify.verifyValidationMessage(readFile.readProperty(fileUI, "receiptnomessage"), readFile.getElement(fileUI, "receiptfrom"));
   }

   public void validateReceiptToMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(fileUI, "receiptnomessage"), readFile.getElement(fileUI, "receiptto"));
   }

   public void validateReceiptFromLength() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(fileUI, "receiptnolengthmessage"), readFile.getElement(fileUI, "receiptfromlength"));
   }

   public void validateReceiptToLength() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(fileUI, "receiptnolengthmessage"), readFile.getElement(fileUI, "receipttolength"));
   }

   public void validateDateAlertMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(fileUI, "datemessage"), readFile.getElement(fileUI, "popupmessage"));
   }

   public void validateBlankReceiptFromAlertMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(fileUI, "receiptfromblankmessage"), readFile.getElement(fileUI, "popupmessage"));
   }

   public void validateBlankReceiptToAlertMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(fileUI, "receipttoblankmessage"), readFile.getElement(fileUI, "popupmessage"));
   }

   public void validateInvalidReceiptRangeAlertMessage() throws IOException {
      verify.verifyValidationMessage(readFile.readProperty(fileUI, "invalidreceiptrangemessage"), readFile.getElement(fileUI, "popupmessage"));
   }

   public void clickShow(){
      ehandler.click(show);
   }

}