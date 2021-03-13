package pom;

import cucumber.api.java.gl.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;


    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public void click (By elemento) throws Exception {
        try {
            driver.findElement(elemento).click();
        }catch (Exception e){
            throw new Exception("No se pudo realizar clic sobre el elemento "+ elemento);
        }

    }

    public boolean isDisplayed(By elemento) throws Exception{

        try {

            return driver.findElement(elemento).isDisplayed();

        } catch (Exception e){
            throw new Exception("No se encontro el elemento "+ elemento);
        }
    }

    public String getText (By elemento) throws Exception{
        try {
            return driver.findElement(elemento).getText();
        }catch (Exception e){
        throw new Exception("No se pudo obtener el texto del elemento  "+ elemento);
    }
}

    public String getTitle() throws Exception{

        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo de la pagina");
        }
    }

    public String getUrl() throws Exception{

        try {
            return driver.getCurrentUrl();
        }catch (Exception e){
            throw new Exception("No se pudo obtener la URL de la pagina");
        }
    }




}
