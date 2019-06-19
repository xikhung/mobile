package Test;

import Auxiliar.TestBase;
import POMs.WordPress.Login;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Report.ExtentTestManager;


public class PruebaAndroidLocal extends TestBase {

    @Parameters({"platformName","deviceName","UDID","appPackage","appActivity"})
    @Test(description = "Prueba local de driver")
    public void openApp(String platformName, String deviceName, String udid, String appPackage, String appActivity){
        ExtentTestManager.startTest("OpenApp", "Prueba local de driver");
        Login androidLogin = new Login(getDriver());
        androidLogin.tapLogIn();
    }
}
