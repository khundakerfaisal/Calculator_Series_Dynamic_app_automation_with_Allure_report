package TestRunner;

import config.Setup;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.calculatorScreen;

public class calculatorTestRunner extends Setup{
    @Test(priority = 1,description = "Verify successful mathematical operation")
    public void doCalculate(){
        calculatorScreen calculatorScreen=new calculatorScreen(driver);
        int actualResult = Integer.parseInt(calculatorScreen.calculateSeries("100/10*5-10+60"));
        int expectedResult = 100;
        Assert.assertEquals(actualResult,expectedResult);

    }
}
