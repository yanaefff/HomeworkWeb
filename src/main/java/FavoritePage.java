import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FavoritePage extends AbstractPage {

    public FavoritePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "wishlist-icon")
    private WebElement wishlist;

    public WebElement getFavCount() {
        return favCount;
    }

    @FindBy(className = "fav-count")
    private WebElement favCount;

    public WebElement getWishlist() {
        return wishlist;
    }

    public WebElement getEmptyWishlist() {
        return emptyWishlist;
    }

    @FindBy(id = "div_process")
    private WebElement emptyWishlist;

    public WebElement getHeart() {
        return heart;
    }


    @FindBy(xpath = "//*[contains(@class, \"heart-icon\")][1]")
    private WebElement heart;

    public List<WebElement> getGoods() {
        return goods;
    }

    @FindBy(className = "catalog-goods")
    private List<WebElement> goods;



}
