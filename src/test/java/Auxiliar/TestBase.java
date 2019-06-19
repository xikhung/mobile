package Auxiliar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(Report.CustomListener.class)
public class TestBase extends GeneralMethods {
    private AppiumDriver driver;
    private AppiumDriverLocalService server;
    private String remoteDevice;

    protected AppiumDriver getDriver(){
        return driver;
    }

    protected AppiumDriverLocalService getServer(){
        return server;
    }

    @BeforeMethod
    public void configDriver(Object[] parameters){
        //String platformName = (String) parameters[0];
        String deviceName = (String) parameters[1];
        String udid = (String) parameters[2];
        String appPackage = (String) parameters [3];
        String appActivity = (String) parameters [4];
        server = Driver.getServer();
        server.start();
        driver = Driver.getLocalAndroidDriver(deviceName,udid,appPackage,appActivity);
    }

    @AfterMethod
    public void closeDriverAndServer(){
        closeDriver(getDriver());
        closeServer(getServer());
    }

}
