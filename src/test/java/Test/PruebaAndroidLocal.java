package Test;

import Auxiliar.TestBase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PruebaAndroidLocal extends TestBase {
    @Parameters({"platformName","deviceName","UDID","appPackage","appActivity"})
    @Test(description = "Prueba local de driver")
    public void openApp(String platformName, String deviceName, String udid, String appPackage, String appActivity){
        System.out.println("Prueba local de driver");
        Reporter.log("Prueba local de driver");
        Assert.assertTrue(true);
    }
}
