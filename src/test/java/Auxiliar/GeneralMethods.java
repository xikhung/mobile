package Auxiliar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class GeneralMethods {

    protected boolean isAndroid(AppiumDriver driver){
        return driver instanceof AndroidDriver;
    }

    protected void waitms(int milliseconds){
        try{
            wait(milliseconds);
        }catch(InterruptedException error){
            error.printStackTrace();
        }
    }

    protected void closeDriver(AppiumDriver driver){
        driver.closeApp();
        driver.quit();
    }

    protected void closeServer(AppiumDriverLocalService server){
        server.stop();
    }

}
