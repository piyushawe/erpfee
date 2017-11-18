package utilities;

import automationFramework.supportMethods.ReadFile;
import webdriver.DriverMethods;

import java.io.File;

public interface GenericObjects {

  EventHandlingUtility ehandler= new EventHandlingUtility();
  File file= new File("F:\\erpfee\\configuration\\UIMap.properties");
  ReadFile readFile= new ReadFile();
  VerifyValidationsUtility verify= new VerifyValidationsUtility();
  DriverMethods dmethods= new DriverMethods();
}
