package POMs.OrientalTest;

// Autor: Vladimir Munrayos - Fecha: 25 de junio de 2019

import Auxiliar.GeneralMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
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

    @AndroidFindBy( id = "tbxUsername" )
    AndroidElement usernameField;

    @AndroidFindBy( id = "tbxPassword" )
    AndroidElement passwordField;

    @AndroidFindBy( id = "imageShowPassword")
    AndroidElement showPasswordButton;

    @AndroidFindBy( id = "flxSwitch")
    AndroidElement switchbutton;

    @AndroidFindBy( id = "btnLogIn")
    AndroidElement btnLogin;

    @AndroidFindBy( id = "lblEnroll")
    AndroidElement enrollLink;

    @AndroidFindBy( id = "imgHeader")
    AndroidElement imgHeader;


}
