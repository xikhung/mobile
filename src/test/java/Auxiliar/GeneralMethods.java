package Auxiliar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.time.Duration;

public class GeneralMethods {

    protected boolean isAndroid(AppiumDriver driver){
        return driver instanceof AndroidDriver;
    }


    protected void waitMS(int milliseconds){
        try{
            wait(milliseconds);
        }catch(InterruptedException error){
            error.printStackTrace();
        }
    }

    protected void singleTap(AppiumDriver driver, MobileElement element){
        new TouchAction(driver)
                .tap(TapOptions.tapOptions().withElement(ElementOption.element(element)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(250))).perform();
    }

    protected void closeDriver(AppiumDriver driver){
        driver.closeApp();
        driver.quit();
    }

    protected void closeServer(AppiumDriverLocalService server){
        server.stop();
    }

}
