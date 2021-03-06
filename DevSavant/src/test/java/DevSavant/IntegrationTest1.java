/*
package DevSavant;
package io.testproject.generated.tests.testprojects;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class was automatically generated by TestProject
 * Project: Test Projects
 * Test: Integration Test 1
 * Generated by: Eduardo Andres Urzuas (eduardoandresu.u@gmail.com)
 * Generated on Wed Sep 22 19:12:33 GMT 2021.
 */
/*
@DisplayName("Integration Test 1")
public class IntegrationTest1 implements ExceptionsReporter {
    public static WebDriver driver;

    @BeforeAll
    static void setup() throws Exception {
        driver = new RemoteWebDriver("AewvQ8RB-GRZPLR5FvGgYnVwr6MYc5st_nBmov_CWxg1", new ChromeOptions(), "Eduardo Andres Urzuas");
    }

    /**
     * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
     * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */

/*    @DisplayName("Integration Test 1")
    @ParameterizedTest
    @MethodSource("provideParameters")
    void execute(String ApplicationURL) throws Exception {
        // set timeout for driver actions (similar to step timeout)
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
        By by;
        boolean booleanResult;

        // 1. Navigate to '{{ApplicationURL}}'
        //    Navigates the specified URL (Auto-generated)
        GeneratedUtils.sleep(500);
        driver.navigate().to(ApplicationURL);

        // 2. Type 'Devsavant' in 'q'
        GeneratedUtils.sleep(500);
        by = By.cssSelector("[name='q']");
        driver.findElement(by).sendKeys("Devsavant");

        // 3. Click 'btnI'
        GeneratedUtils.sleep(500);
        by = By.xpath("//div[5]//input[2]");
        driver.findElement(by).click();

        // 4. Is 'VIDEO' visible?
        GeneratedUtils.sleep(500);
        by = By.xpath("//video");
        driver.findElement(by).isDisplayed();

        // 5. Click 'VIDEO'
        GeneratedUtils.sleep(500);
        by = By.xpath("//video");
        driver.findElement(by).click();

    }

    @Override
    public ReportingDriver getDriver() {
        return (ReportingDriver) driver;
    }

    @AfterAll
    static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private static Stream provideParameters() throws Exception {
        return Stream.of(Arguments.of("https://www.google.com/"));
    }
}
*/