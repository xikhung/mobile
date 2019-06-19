package Report;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter(){
        if (extent == null){
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir+"/target/ExtentReports/ExtentReportResult.html", true);
        }
        return extent;
    }

}
