package seleniumgludecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_buscardor {

    private WebDriver driver = Hooks.getDriver() ;

    @Given("^El usuario se debe encontrar en el Home principal de imalittletester$")
    public void el_usuario_se_debe_encontrar_en_el_Home_principal_de_imalittletester() throws Throwable {

        String titleHomepage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(titleHomepage,driver.getTitle());


    }

    @When("^Situarse en la caja de busqueda Serch$")
    public void situarse_en_la_caja_de_busqueda_Serch() throws Throwable {


        WebElement boxsearchLocator = driver.findElement(By.className("search-field"));

    }

    @And("^Ingresar la palabra Selenium$")
    public void ingresar_la_palabra_Selenium() throws Throwable {

        WebElement boxsearchLocator = driver.findElement(By.className("search-field"));
        boxsearchLocator.sendKeys("Selenium");

    }

    @And("^Ejecutar la busqueda presionando la tecla Enter$")
    public void ejecutar_la_busqueda_presionando_la_tecla_Enter() throws Throwable {

        WebElement boxsearchLocator = driver.findElement(By.className("search-field"));
        boxsearchLocator.submit();


    }

    @Then("^Se debe visualizar los resultados de la busqueda$")
    public void se_debe_visualizar_los_resultados_de_la_busqueda() throws Throwable {

        String url = driver.getCurrentUrl();

        Assert.assertEquals("https://imalittletester.com/?s=Selenium",url);



    }





}
