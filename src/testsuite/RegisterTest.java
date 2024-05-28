package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    @Before
    public void setUp() {
        setBaseUrl();
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.xpath("//a[@href = '/register?returnUrl=%2F']")).click();
        //Verify the text ‘Register’
        WebElement registerHeader = driver.findElement(By.linkText("Register"));
        String headerText = registerHeader.getText();
        Assert.assertEquals("The Register page is not as expected", "Register", headerText);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {


//click on the ‘Register’ link
            driver.findElement(By.xpath(" //a[@class = 'ico-register'] ")).click();
            //Select gender radio button
            driver.findElement(By.id("gender-male")).click();
            //Enter First name
            // Enter Last name
            driver.findElement(By.id("FirstName")).sendKeys("Chetan");
            driver.findElement(By.id("LastName")).sendKeys("Patel");
            //Select Day Month and Year
            driver.findElement(By.name("DateOfBirthDay")).sendKeys("15");
            driver.findElement(By.name("DateOfBirthMonth")).sendKeys("12");
            driver.findElement(By.name("DateOfBirthYear")).sendKeys("1981");
            //Enter Email address
            // Enter Password
            driver.findElement(By.id("Email")).sendKeys("chetan123@gmail.com");
            driver.findElement(By.name("Password")).sendKeys("Chetan123");
            // Enter Confirm password
            driver.findElement(By.id("ConfirmPassword")).sendKeys("Chetan123");
            driver.findElement(By.name("register-button")).click();
            //Verify the text your registration completed
            String expectedText = "Your registration completed";
            WebElement registerHeaderTextElement = driver.findElement(By.xpath("//div[@class= 'result']"));
            String actualText = registerHeaderTextElement.getText();
            Assert.assertEquals("Not redirected to expected page",expectedText,actualText);
            Assert.assertEquals(expectedText,actualText);
        }
    }


