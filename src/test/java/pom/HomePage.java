package pom;

import cucumber.api.java.gl.E;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

        String titleHomepage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        By titleComicsLocator = By.id("menu-item-2008");


    public HomePage(WebDriver driver){
        super (driver);
    }



    public boolean homePageIsDisplayed() throws Exception{
        return this.getTitle().equals(titleHomepage);
    }

    public void clickOnButtonComics () throws Exception{
        this.click(titleComicsLocator);

    }

}
