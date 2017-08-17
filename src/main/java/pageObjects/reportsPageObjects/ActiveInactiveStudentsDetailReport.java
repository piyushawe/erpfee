package pageObjects.reportsPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

import static webDriver.AppDriver.driver;

public class ActiveInactiveStudentsDetailReport extends GenericReports{

  @FindBy(linkText = "Active/Inactive Students Detail Report")private WebElement link;
  @FindBy(id="Active/Inactive Students Detail Report")private WebElement frame;
  @FindBy(id="ContentPlaceHolder1_ddlClass")private WebElement cls;
  @FindBy(id="ContentPlaceHolder1_ddlSection")private WebElement section;
  @FindBy(id="ContentPlaceHolder1_txtfromDate_TextBox")private WebElement fromdate;
  @FindBy(id="ContentPlaceHolder1_txttoDate_TextBox")private WebElement tilldate;
  @FindBy(name = "ctl00$ContentPlaceHolder1$rdbOption")private WebElement status;

  public ActiveInactiveStudentsDetailReport(WebDriver d){
      PageFactory.initElements(d, this);
      page= "ActiveInactiveStudentsDetailReport";
  }
  public void openActiveInactiveStudentsDetailReport() throws IOException {
      WebElement menu= driver.findElement(By.xpath(readFile.readProperty(file,"reportsmenu")));
      ehandler.openFrame(menu, link, frame);
  }

}
