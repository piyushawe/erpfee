package pageObjects.transactionReportPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

import static webDriver.AppDriver.driver;

public class DailyFeeCollection extends GenericReports{
  @FindBy(linkText = "Daily Fee Collection")WebElement link;
  @FindBy(id = "Daily Fee Collection")WebElement frame;

  public DailyFeeCollection(WebDriver d) throws IOException {
     f1= new File("F:\\erpfee\\configuration\\transactionReport\\DailyFeeCollection.properties");
     PageFactory.initElements(d, this);
     readFile.readProperty(f1, "page");
  }
  public void openDailyFeeCollection() throws IOException {
     ehandler.moveToElement(readFile.getElement(file, "transactionreportmenu"));
     ehandler.openFrame(readFile.getElement(file, "collectionsubmenu"), link, frame);
  }

  public void validateClass() throws IOException {
     WebElement cls= driver.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div/div/div[3]/div/div/button"));
     WebElement clear= driver.findElement(By.xpath("/html/body/div[7]/div/ul/li[2]/a"));
     WebElement msgid= driver.findElement(By.id("ContentPlaceHolder1_Req_ddlFeeHeadToshown"));
    // verify.verifyValidation(cls, clear, msgid, readFile.readProperty(file, "cls"));
  }
}
