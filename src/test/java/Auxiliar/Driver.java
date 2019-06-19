package Auxiliar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static AppiumServiceBuilder serverBuilder;
    private static AppiumDriver driver;
    private static AppiumDriverLocalService server;


    private Driver(){}

    public static AppiumDriverLocalService getServer(){
        serverBuilder = new AppiumServiceBuilder();
        serverBuilder.usingAnyFreePort();
        serverBuilder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
        server = AppiumDriverLocalService.buildService(serverBuilder);
        return server;
    }

    public static AppiumDriver getLocalAndroidDriver(String deviceName, String udid, String appPackage, String appActivity){
        DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("deviceName",deviceName);
            capabilities.setCapability("udid",udid);
            capabilities.setCapability("appPackage",appPackage);
            capabilities.setCapability("appActivity",appActivity);
            capabilities.setCapability("autoGrantPermissions", true);
            capabilities.setCapability("noReset",true);
            capabilities.setCapability("automationName","UiAutomator2");
        driver = new AppiumDriver(server.getUrl(),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
