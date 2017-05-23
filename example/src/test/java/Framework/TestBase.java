package Framework;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    // Before the Test Suite runs, start the App
    @BeforeSuite
    public void setUpAppium() throws MalformedURLException {

        // Define the URL for the Appium server
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        URL url = new URL(URL_STRING);

        // Create an empty DesiredCapabilities object (leave blank for Device Farm)
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // The following settings are for local runs (comment out for Amazon Device Farm)
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", "path_to_apk");

        // Initialize the driver
        App.driver = new AndroidDriver<MobileElement>(url, capabilities);

        // Use a higher value if your mobile elements take time to show up
        App.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    // After the Test Suite runs, quit the App
    @AfterSuite
    public void tearDownAppium() {
        App.driver.quit();
    }

    // Before each Test, reset the App
    @BeforeTest
    public void restartApp() {
        App.driver.resetApp();
    }
}
