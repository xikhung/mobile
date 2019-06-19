package POMs.WordPress;

import Auxiliar.GeneralMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class Login extends GeneralMethods {
    private AppiumDriver driver;
    private Boolean isAndroid;

    public Login(AppiumDriver driver){
        isAndroid = isAndroid(driver);
        this.driver = driver;
    }

    @FindBy(id = "org.wordpress.android:id/login_button")
    private AndroidElement loginButton;

    public void tapLogIn(){

    }
}
