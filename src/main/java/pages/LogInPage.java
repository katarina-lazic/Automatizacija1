package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement clickSubmit;


    public LogInPage(WebDriver driver) {
        super(driver);
    }


    public LogInPage typeEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public LogInPage typePassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }


    public LogInPage clickSubmitButton() {
        clickSubmit.click();
        return new LogInPage(driver);

    }


}
