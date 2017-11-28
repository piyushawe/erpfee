package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class VerifyValidationsUtility {
    EventHandlingUtility ehandler= new EventHandlingUtility();

    public void validateBlankField(WebElement we, String expected, WebElement msgid){
       if(we.getAttribute("value").equals(""))
          Assert.assertEquals(expected, msgid.getText());
       System.out.println(msgid.getText());
    }

    public void verifyValidationMessage(String expected, WebElement msgid){
       Assert.assertEquals(expected, msgid.getText());
       System.out.println(msgid.getText());
    }

    public void verifyCancel(WebElement we){
       Assert.assertEquals("", we.getAttribute("value"));
       System.out.println("Page Refreshed");
    }

    public void verifyValidationOnMultiSelect(WebElement element, WebElement clear, WebElement close, WebElement msgid, String exp){
       ehandler.click(element);
       ehandler.click(clear);
       ehandler.click(close);
       Assert.assertTrue(msgid.isDisplayed());
       verifyValidationMessage(exp, msgid);
    }

    public void verifyValidationOnMultiSelect(WebElement element, WebElement clear,  WebElement msgid, String exp) {
        ehandler.click(element);
        //Thread.sleep(5000);
        ehandler.click(clear);
        //Thread.sleep(2000);
        //ehandler.click(close);
        Assert.assertTrue(msgid.isDisplayed());
        verifyValidationMessage(exp, msgid);
    }
    void verifyMessageImage(WebElement imgicon,String url, String img){
        Assert.assertEquals(url+img, imgicon.getAttribute("src"));
        System.out.println(img);
    }
}