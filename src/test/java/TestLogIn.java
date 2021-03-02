import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;

public class TestLogIn {
    @Test

    public void testLogInFuncionality() {
        String email = "john@gmail.com";
        String password = "testt";


        System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        try{
            HomePage homePage = new HomePage(driver);

            LogInPage logInPage = homePage.clickSignInLink();

            Thread.sleep(3000);
            logInPage.typeEmail(email);
            logInPage.typePassword(password);

            Thread.sleep(3000);

            logInPage.clickSubmitButton();

            Thread.sleep(5000);

            String actualHeader = driver.findElement(By.id("slider_row"));

            assert actualHeader.equals(expectedHeader);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
