package financiamentos.santander.Simulacao;

import core.setup.GlobalVariables;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class SimulacaoAction {

    public AndroidDriver driver;


    @Test
    public void setUp() throws MalformedURLException, InterruptedException {
        driver = GlobalVariables.createMobile();
    }



}
