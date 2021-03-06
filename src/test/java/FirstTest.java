import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test

    public void test() {

        String expectedHeader = "Automation Practice Website";
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        String actualHeader = driver.findElement(By.xpath("//h1")).getText();

        assert  actualHeader.equals(expectedHeader);
        driver.quit();
    }

}
