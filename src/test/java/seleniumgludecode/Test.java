package seleniumgludecode;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends TestBase {


    // Primer Scenario

    @Given("^el usuario se debe encontrar en el principal Home de imalittletester$")
    public void el_usuario_se_debe_encontrar_en_el_principal_Home_de_imalittletester() throws Throwable {

       Assert.assertTrue(homePage.homePageIsDisplayed());



    }

    @When("^realice clic sobre el botón The little teste comics$")
    public void realice_clic_sobre_el_botón_The_little_teste_comics() throws Throwable {


       homePage.clickOnButtonComics();


    }

    @Then("^se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {

       WebElement pageTitleLocator = driver.findElement(comicsPage.getPageTitleLocator());

        Assert.assertTrue("No se redirecciono correctamente a la pagina Comics",pageTitleLocator.isDisplayed());
        Assert.assertEquals(comicsPage.getTitlepage(),pageTitleLocator.getText());



    }


    // Segundo Scenario



}
