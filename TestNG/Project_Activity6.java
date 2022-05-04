
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Project_Activity6 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("http://alchemy.hguy.co/crm");
    }

    @Test
    public void Login() {

        //Get the Username sending the value
        WebElement Username = driver.findElement(By.id("user_name"));
        Username.sendKeys("admin");

        //Get the Password sending the value
        WebElement pword = driver.findElement(By.id("username_password"));
        pword.sendKeys("pa$$w0rd\n");

        //identifying Login Button and clicking
        WebElement loginbutton = driver.findElement(By.id("bigbutton"));
        loginbutton.click();

        //Finding the color of the Activities is displaying
        WebElement cssLocator = driver.findElement(By.cssSelector("div#toolbar"));
         boolean y = driver.findElement(By.name("Activities")).isDisplayed();
       System.out.println("The Activities element is selected: " + y);

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }

}
