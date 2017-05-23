package Tests;

import Framework.App;
import Framework.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void test001() {
        App.HomePage().elementName.click();
        Assert.assertFalse(App.HomePage().elementName.isDisplayed());
    }

}
