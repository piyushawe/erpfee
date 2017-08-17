package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static webDriver.AppDriver.driver;

public class GenericUtility extends GenericBaseClass implements GenericObjects{

  public void takeScreenshot() throws IOException {
    String school= readFile.readProperty(file, "schoolname");
    String timestamp= getTimeStamp();
    File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(f, new File("F:/erpfee/src/main/resources/screenshots/"+ school+"/"+page+"/"+page+scenario+timestamp+".png"));
  }

  String getTimeStamp(){
    return new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
  }

}
