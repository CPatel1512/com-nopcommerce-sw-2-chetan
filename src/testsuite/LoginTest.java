package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        setBaseUrl();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Find the login link element and click on login link element
        driver.findElement(By.className("ico-login")).click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1[text() = 'Welcome, Please Sign In!']"));
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals("Redirect to login page", expectedText, actualText);}

        @Test
                public void userShouldLoginSuccessfullyWithValidCredentials() {
            //Find the Login Link and Click on login link element
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            //find email input field from login page and enter email
            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("Prime123@gmail.com");
            //find password field from login page and enter password
            driver.findElement(By.id("Password")).sendKeys("Prime123");
            //find the login button element and click login
            driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
            String expextedlogOutText = "Log Out";
            // WebElement logOutTextDisplay = driver.findElement(By.xpath("//a[@class = 'ico-logout']"));
            //String actualLogOutText = logOutTextDisplay.getText();
            //Assert.assertEquals("Redirect to logout page", expextedlogOutText, actualLogOutText);
        }


@Test

            public void verifyErrorMessageWithInvalidCredentials() {
                //Find the Login Link and Click on login link element
                 driver.findElement(By.linkText("Log in")).click();
                //Find the Email Field Element and Type the Email address to email field
                driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");
                // Find the password field and Type the password into password field
                driver.findElement(By.name("Password")).sendKeys("Prime123");
                // Find Login btn Element and click
                driver.findElement(By.xpath("//button[text() = 'Log in']")).click();

                String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                        "No customer account found";
                String actualErrorMessage = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText();
                Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
            }

        }







