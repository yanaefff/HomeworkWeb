
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FavoriteTest extends AbstractTest {

    @Test
    @DisplayName("Тест Избранное")
    @Description("Тест добавляет товар и удаляет товар из избранного и проверяет счетчик избранного")
    void addWishList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getWebDriver());
        FavoritePage favoritePage = new FavoritePage(getWebDriver());
        MenuPage menu = new MenuPage(getWebDriver());

        Thread.sleep(5000);
        loginPage.toProfile();
        loginPage.loginIn("yayka@yandex.ru", "j43-fnm-vNs-ZAQ");
        Thread.sleep(3000);
        favoritePage.getWishlist().click();
        Assertions.assertEquals("https://leonardo.ru/profile/wishlist/", getWebDriver().getCurrentUrl());

        menu.clickMenu();
        menu.getEmbellish().click();
        menu.getEmbellishPackage().click();
        favoritePage.getHeart().click();
        Thread.sleep(3000);
        favoritePage.getWishlist().click();
        Thread.sleep(3000);
        Assertions.assertEquals("1", String.valueOf(favoritePage.getGoods().size()));
        Assertions.assertEquals("1", favoritePage.getFavCount().getText());
        favoritePage.getHeart().click();
        getWebDriver().navigate().refresh();
        Assertions.assertEquals("0", String.valueOf(favoritePage.getGoods().size()));
        Assertions.assertEquals("0", String.valueOf(favoritePage.getGoods().size()));
    }


}
