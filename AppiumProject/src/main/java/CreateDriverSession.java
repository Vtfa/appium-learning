import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.URL;
import java.time.Duration;



public class CreateDriverSession {
//    public static void main(String[] args) throws MalformedURLException {
//        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
//                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
//
//        UiAutomator2Options options = new UiAutomator2Options().
//                setDeviceName("Pixel_7").
//                setAvd("Pixel_7_Appium").
//                setAvdLaunchTimeout(Duration.ofMinutes(10)).
//                setAutomationName("UiAutomator2").
//                setNewCommandTimeout(Duration.ofMinutes(5)).
//                setApp(appUrl);
//
//        URL url = new URL("http://172.18.160.1:4723/");
//        AppiumDriver driver = new AndroidDriver(url, options);
//
//        System.out.println("Session id: " + driver.getSessionId());
//    }

    public static AppiumDriver initializeDriver (String platformName) throws Exception {

        switch (platformName) {
            case "Android":
                String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
                URL url = new URL("http://172.18.160.1:4723/");

                UiAutomator2Options options = new UiAutomator2Options().
                        setDeviceName("Pixel_7").
                        setAvd("Pixel_7_Appium").
                        setAvdLaunchTimeout(Duration.ofMinutes(10)).
                        setAutomationName("UiAutomator2").
                        setNewCommandTimeout(Duration.ofMinutes(10)).
                        setApp(appUrl);

                //AppiumDriver driver = new AndroidDriver(url, options);
            return new AndroidDriver(url, options);
            case "iOS":
                //TODO
            default:
                throw new Exception("Invalid plataform");
        }
    }
}
