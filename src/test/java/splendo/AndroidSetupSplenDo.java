package splendo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetupSplenDo {

    protected static AndroidDriver driver;

    protected static void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("app");
        File app = new File(appDir, "splendo.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName", "192.168.56.101:5555");
        capabilities.setCapability("appActivity", "com.splendapps.splendo.MainActivity");
        capabilities.setCapability("appPackage", "com.splendapps.splendo");
        capabilities.setCapability("app", app.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
