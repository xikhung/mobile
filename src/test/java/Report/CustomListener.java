package Report;

import Auxiliar.TestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.LogStatus;


public class CustomListener extends TestBase implements ITestListener {
    private static final Logger LOGGER = LoggerFactory.getLogger("CUSTOM_LOGS");

    private static String getTestMethodName(ITestResult iTestResult){
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("onTestStart method" + getTestMethodName(result) + " start");
    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("onTestSuccess method " + getTestMethodName(result) + " succeed");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("onTestFailure method " + getTestMethodName(result) + " failed");
        ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed");
    }
    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("onTestSkipped method " + getTestMethodName(result) + " skipped");
        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        System.out.println("onTestFailedButWithinSuccessPercentage " + getTestMethodName(result));
    }
    @Override
    public void onStart(ITestContext context){
        System.out.println("onStart Method " + context.getName());
        context.setAttribute("AppiumDriver", getDriver());
    }
    @Override
    public void onFinish(ITestContext context){
        System.out.println("I am in onFinish method " + context.getName());
        ExtentTestManager.endTest();
        ExtentManager.getReporter().flush();
    }
}
