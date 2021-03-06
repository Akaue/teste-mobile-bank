package core.setup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class GlobalVariables {


  public static AndroidDriver<MobileElement>  createMobile() throws MalformedURLException {

    String URL = "http://localhost:4723/wd/hub";
    String pathAPP = "C:\\Users\\akaue\\Documents\\teste-mobile-bank\\src\\test\\support\\santander.apk";

    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("deviceName", "VirtualDevice");
    desiredCapabilities.setCapability("automationName", "uiautomator2");
    desiredCapabilities.setCapability(MobileCapabilityType.APP, pathAPP);


    AppiumDriver driver = new AndroidDriver(new URL(URL), desiredCapabilities);


    return (AndroidDriver<MobileElement>) driver;

  }


}
