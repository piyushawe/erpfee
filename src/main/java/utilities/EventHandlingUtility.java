package utilities;

import automationFramework.supportMethods.ReadFile;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import webDriver.DriverMethods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static webDriver.AppDriver.driver;

public class EventHandlingUtility {
    File file= new File("F:\\erpfee\\configuration\\UIMap.properties");
    ReadFile readFile= new ReadFile();
    DriverMethods dm= new DriverMethods();
    String value="";

    public void openFrame(WebElement menu, WebElement link, WebElement frame){
      moveToElement(menu);
      //moveToElement(link);
      clickMenuItem(link);
      //System.out.println("Size: "+driver.findElements(By.tagName("iframe")).size());
      switchToFrame(frame);
    }

    public void moveToElement(WebElement menuItem){
      new Actions(driver).moveToElement(menuItem).build().perform();
    }

    public void clickMenuItem(WebElement link){
        new Actions(driver).moveToElement(link).click().perform();
    }

    public void switchToFrame(WebElement frame){
      driver.switchTo().frame(frame);
    }

    public void click(WebElement element){
      element.click();
    }

    public void enterText(WebElement textfield, String text){
      textfield.sendKeys(text);
    }

    public void pressEnter(WebElement textfield){
        textfield.sendKeys(Keys.ENTER);
    }

    public void enterText(WebElement textfield, int n) {
      for (int i=0; i<n; i++) {
          textfield.sendKeys("a");
          value= value+"a";
      }
    }

    public void verifyString(){
      Assert.assertTrue(driver.getPageSource().contains(value));
         System.out.println("Value Saved");
    }

//select first record in table
    public void selectRecord(WebElement table, WebElement select){
     List<WebElement> cells=table.findElements(By.tagName("td"));
     if (cells.size()>1){
         for (WebElement cell:cells) {
             select.click();
             break;
         }
     }else
         System.out.println("No Record Found");
    }

//click particular cell of table
    public void selectValueFromTable(WebElement table, String value) throws IOException {
      List<WebElement> cells=readFile.getElements(file, "cell");
      for(WebElement cell: cells) {
          if (cell.getText().equals(value)){
            //System.out.println("cell value"+cell.getText());
            cell.click();
            break;
          }
      }
    }

    public void selectByVisibleText(WebElement element, String text){
      new Select(element).selectByVisibleText(text);
    }

    public void selectByIndex(WebElement element, int index){
      new Select(element).selectByIndex(index);
    }

    public void selectDate(WebElement date, String mm, String yy, String dd) throws IOException {
      click(date);
      dm.waitUntil((readFile.getElement(file,"monthpicker")),20);
      readFile.getElement(file,"monthpicker");
      dm.waitUntil(driver.findElement(By.className(readFile.readProperty(file, "monthpicker"))),200);
      selectByVisibleText(readFile.getElement(file,"monthpicker"), mm);
      dm.waitUntil(readFile.getElement(file,"yearpicker"),20);
      selectByVisibleText(readFile.getElement(file,"yearpicker"), yy);
      dm.waitUntil(readFile.getElement(file,"daypicker"),200);
      selectValueFromTable(readFile.getElement(file,"daypicker"), dd);
    }
}
