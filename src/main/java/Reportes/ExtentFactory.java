package Reportes;
import com.aventstack.extentreports.ExtentReports;

/**
 * Author: Diego Marulanda B. Date:13/11/23 -15:20 Project_Name:marulanda_diego_parcial_testing
 */
public class ExtentFactory {
  public static ExtentReports getInstance() {
    ExtentReports extent = new ExtentReports();
    extent.setSystemInfo("Environment", "PROD");
    extent.setSystemInfo("OS", "Windows");
    extent.setSystemInfo("Browser", "Chrome");
    return extent;
  }

}
