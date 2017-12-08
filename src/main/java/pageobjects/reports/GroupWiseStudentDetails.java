package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.File;
import java.io.IOException;

public class GroupWiseStudentDetails extends GenericReports {
    @FindBy(linkText = "Group Wise Student Details")private WebElement link;
    @FindBy(id="Group Wise Student Details")private WebElement frame;

    public GroupWiseStudentDetails(WebDriver d) throws IOException {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openGroupWiseStudentDetails() throws IOException {
        ehandler.openFrame(readFile.getElement(fileUI, "reportsmenu"), link, frame);
    }

    public void selectGroup(int index) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement(f1, "group"), index);
    }
}
