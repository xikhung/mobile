package POMs.TestApp;

import Auxiliar.GeneralMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Login extends GeneralMethods {
    private AppiumDriver<MobileElement> driver;
    private Boolean isAndroid;

    public Login(AppiumDriver driver){
        isAndroid = isAndroid(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "name")
    private AndroidElement userNameAndroid;
    @AndroidFindBy(id = "login")
    private AndroidElement userLoginAndroid;

    public void typeName(String name){
        userNameAndroid.sendKeys(name);
    }
}
