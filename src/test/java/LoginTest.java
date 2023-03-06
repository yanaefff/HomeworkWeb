
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest extends AbstractTest {

    @Test
    @DisplayName("Тест логин")
    @Description("Тест проверяет вход в учетную запись")
    void login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getWebDriver());
        Thread.sleep(5000);
        loginPage.toProfile();
        loginPage.loginIn("yayka@yandex.ru", "j43-fnm-vNs-ZAQ");
        new WebDriverWait(getWebDriver(), 5).until(ExpectedConditions.visibilityOf(LoginPage.getResult()));
        Thread.sleep(5000);
        loginPage.toProfile();
        Assertions.assertTrue(LoginPage.getMyProfile().isDisplayed());
    }


}
