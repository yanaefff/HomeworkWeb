
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MenuTest extends AbstractTest {

    @Test
    @DisplayName("Тест меню")
    @Description("Тест проверяет открытие контента через меню")
    void login() throws InterruptedException {
        MenuPage menu = new MenuPage(getWebDriver());
        Thread.sleep(5000);
        menu.clickMenu();
        Thread.sleep(5000);
        menu.getBeading().click();
        Assertions.assertTrue(menu.getPagecontent().isDisplayed());
        menu.clickMenu();
        menu.getDecoration().click();
        Assertions.assertTrue(menu.getPagecontent().isDisplayed());
        menu.clickMenu();
        menu.getEmbellish().click();
        Assertions.assertTrue(menu.getPagecontent().isDisplayed());
        menu.clickMenu();
        menu.getKnitting().click();
        Assertions.assertTrue(menu.getPagecontent().isDisplayed());
        menu.clickMenu();
        menu.getOfficeSuppliers().click();
        Assertions.assertTrue(menu.getPagecontent().isDisplayed());
        menu.clickMenu();
        menu.getPaint().click();
        Assertions.assertTrue(menu.getPagecontent().isDisplayed());
        menu.clickMenu();
        menu.getSewing().click();
        Assertions.assertTrue(menu.getPagecontent().isDisplayed());

    }


}
