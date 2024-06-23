import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class AndroidFindElements {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

        //gets the animation element text using different locator strategies
        WebElement myElementAccid = driver.findElement(AppiumBy.accessibilityId("Animation"));
        System.out.println(myElementAccid.getText());

        WebElement myElementId = driver.findElements(AppiumBy.id("android:id/text1")).get(2);
        System.out.println(myElementId.getText());

        WebElement myElementClassName = driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
        System.out.println(myElementClassName.getText());

        WebElement myElementXpath = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
        System.out.println(myElementXpath.getText());
        assert(myElementXpath.getText().equals("teste"));
    }
}
