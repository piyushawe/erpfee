package webdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static webdriver.AppDriver.driver;

public class DriverMethods {

  public void maximizeWindow(){
     driver.manage().window().maximize();
  }

  public void getUrl(String url){
      driver.get(url);
  }

  public void switchToParentWindow(){
      driver.switchTo().defaultContent();
  }

  public void waitImplicitly(int time){
     driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
  }

  public void waitUntil(WebElement webelement, int time){
     WebDriverWait wait= new WebDriverWait(driver, time);
     wait.until(ExpectedConditions.visibilityOf(webelement));
  }
}
