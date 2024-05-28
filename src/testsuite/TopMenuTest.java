package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    @Before
    public void setUp() {
        setBaseUrl();
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("//a[@href = '/computers']")).click();
// verify the text 'Computers'on the page
        WebElement computersHeader = driver.findElement(By.linkText("Computers"));
        String headerText = computersHeader.getText();
        Assert.assertEquals("The Computers page header is not as expected", "Computers", headerText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//a[@href = '/electronics'  ]")).click();
        //Verify the text 'Electronics' on the page
        WebElement electronicsHeader = driver.findElement(By.linkText("Electronics"));
        String headerText = electronicsHeader.getText();
        Assert.assertEquals("The Electronics page header is not as expected", "Electronics", headerText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on the 'Apparel ' tab
        driver.findElement(By.xpath("//a[@href = '/apparel'  ]")).click();
        // Verify the text Apparel on the page
        WebElement apparelHeader = driver.findElement(By.linkText("Apparel"));
        String headerText = apparelHeader.getText();
        Assert.assertEquals("The Apparel page header is not as expected", "Apparel", headerText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//a[@href = '/digital-downloads'  ]")).click();
        //Verify the text ‘Digital downloads’
        WebElement digitalDownloads = driver.findElement(By.linkText("Digital downloads"));
        String headerText = digitalDownloads.getText();
        Assert.assertEquals("The Digital Downloads page header is not as expected", "Digital downloads", headerText);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//a[@href = '/books'  ]")).click();
        //Verify the text ‘Books’
        WebElement books = driver.findElement(By.linkText("Books"));
        String headerText = books.getText();
        Assert.assertEquals("The Books page header is not as expected", "Books", headerText);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//a[@href = '/jewelry'  ]")).click();
        //Verify the text ‘Jewelry’
        WebElement jewelry = driver.findElement(By.linkText("Jewelry"));
        String headerText = jewelry.getText();
        Assert.assertEquals("The Jewelry page header is not as expected","Jewelry",headerText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//a[@href = '/gift-cards'  ]")).click();
        //Verify the text ‘Gift Cards’
        WebElement giftCards = driver.findElement(By.linkText("Gift Cards"));
        String headerText = giftCards.getText();
        Assert.assertEquals("The Gift Cards page is not as expected","Gift Cards",headerText);
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
