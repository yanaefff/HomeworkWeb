import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage{


    @FindBy(className = "profile-icon")
    private WebElement profile;

    @FindBy(name = "login")
    private WebElement login;

    @FindBy(name = "pass")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"loginAuthForm\"]/button")
    private WebElement submit;

    @FindBy(xpath = "//h1[.='Мой профиль']")
    private static WebElement myProfile;

    @FindBy(className = "loginAuthFormResults")
    private static WebElement result;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage setLogin(String login){
        this.login.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password){
        this.password.click();
        this.password.sendKeys(password);
        return this;
    }

    public LoginPage toProfile(){
        this.profile.click();
        return this;
    }

    public static WebElement getMyProfile(){
       return myProfile;
    }

    public static WebElement getResult(){
        return result;
    }


    public void loginIn(String login, String password){

        Actions loginIn = new Actions(getDriver());
        loginIn
                .click(this.login)
                .sendKeys(this.login,login)
                .click(this.password)
                .sendKeys(this.password,password)
                .click(this.submit)
                .build()
                .perform();
    }
}
