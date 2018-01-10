package pageobjects.reports;

import automationFramework.supportMethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class CategoryWiseStudentReport extends GenericReports {
    @FindBy(linkText = "Category Wise Student Report")private WebElement link;
    @FindBy(id="Category Wise Student Report")private WebElement frame;

    public CategoryWiseStudentReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openCategoryWiseStudentReport() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void selectCategory(int category) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("category"), category);
    }

    public void selectProfession(int profession) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("fatherprofession"), profession);
    }
}
