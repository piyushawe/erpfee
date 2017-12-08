package automationFramework.supportMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import supportclasses.GenericBaseClass;

import java.io.IOException;

public class UIMap extends GenericBaseClass {

    public UIMap(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        file = gm.getFilePath(page);
        PageFactory.initElements(d, this);
    }

    public WebElement username = readFile.getElement("username");

}
