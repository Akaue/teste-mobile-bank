package core.setup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class GlobalVariables {


  public static AndroidDriver<MobileElement>  desiredcapabilities() throws MalformedURLException {

    String URL = "http://localhost:4723/wd";
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

    desiredCapabilities.setCapability("platformName", "");
    desiredCapabilities.setCapability("deviceName", "");
    desiredCapabilities.setCapability("automationName", "");
    desiredCapabilities.setCapability(MobileCapabilityType.APP, "");


    AppiumDriver driver = new AndroidDriver(new URL(URL), desiredCapabilities);


    return (AndroidDriver<MobileElement>) driver;

  }


}
