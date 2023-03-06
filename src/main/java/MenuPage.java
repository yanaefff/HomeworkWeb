import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuPage extends AbstractPage {

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "header__burger")
    private WebElement menu;

    @FindBy(xpath = "//a[.='Вышивание']/parent::li")
    private WebElement embellish;

    public WebElement getEmbellishPackage() {
        return embellishPackage;
    }



    @FindBy(xpath = "//a[contains(@class, 'widgets__link')]/span[.='Наборы для вышивания']")
    private WebElement embellishPackage;

    @FindBy(xpath = "//a[.='Товары для художников']")
    private WebElement paint;

    @FindBy(xpath = "//a[.='Декорирование']")
    private WebElement decoration;

    @FindBy(xpath = "//a[.='Канцелярские товары']")
    private WebElement officeSuppliers;

    @FindBy(xpath = "//a[.='Бисероплетение']")
    private WebElement beading;

    @FindBy(xpath = "//a[.='Вязание']")
    private WebElement knitting;

    @FindBy(xpath = "//a[.='Шитье']")
    private WebElement sewing;



    @FindBy(className = "page-content")
    private WebElement pagecontent;



    public WebElement getEmbellish() {
        return embellish;
    }

    public WebElement getPaint() {
        return paint;
    }

    public WebElement getDecoration() {
        return decoration;
    }

    public WebElement getOfficeSuppliers() {
        return officeSuppliers;
    }

    public WebElement getBeading() {
        return beading;
    }

    public WebElement getKnitting() {
        return knitting;
    }

    public WebElement getSewing() {
        return sewing;
    }

    public WebElement getPagecontent() {
        return pagecontent;
    }

    public MenuPage clickMenu(){
        this.menu.click();
        return this;
    }




}
