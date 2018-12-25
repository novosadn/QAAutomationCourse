package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = setUp();
        test(driver);

    }

    private static AndroidDriver<AndroidElement> setUp() throws MalformedURLException {
        File file = new File("app");
        File apk = new File(file, "AppConnectTester.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AppiumTest");
        capabilities.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());

        return new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

    }
    private static void test(AndroidDriver driver) {
        driver.findElementByXPath("//*[@text = '1Acc']").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"email_trust_all_certificates\").instance(0))").click();

        AndroidElement element = (AndroidElement) driver.findElementByXPath("//*[@text = 'email_exchange_username']/following-sibling::android.widget.EditText");
        element.clear();
        element.setValue("mbtester01@midev.onmicrosoft.com");
        driver.hideKeyboard();

        driver.findElementByXPath("//*[@text = 'Save+Send']").click();

    }

}
