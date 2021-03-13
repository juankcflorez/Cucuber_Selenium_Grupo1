package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ComicsPage extends BasePage {


    private String titlepage = "Category: comics";
    By pageTitleLocator = By.className("page-title");


    public ComicsPage(WebDriver driver){

        super(driver);
    }

    public By getPageTitleLocator() {
        return pageTitleLocator;
    }

    public String getTitlepage() {
        return titlepage;
    }



}
