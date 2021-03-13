package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
      features = "src/test/java/features",

        //features = "src/test/java/features/test.feature",
        //features = "src/test/java/features/test_buscador.feature",


        glue = {"seleniumgludecode"},
        plugin = {"json:Reportes/Test/cucumber_report.json"}

)

public class Testrunner {

    @AfterClass

    public static void finish(){

        try{
            System.out.println("Generando Reporte ");
            String [] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte Generado Satisfactoriamente");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }



}
