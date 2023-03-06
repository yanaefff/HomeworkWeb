import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class main {

    public static void main(String[] args) throws InterruptedException {
//        System.setProperty(
//                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
//        );
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://leonardo.ru");


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://leonardo.ru");


        WebElement profile = driver.findElement(By.className("profile-icon"));
        profile.click();
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        login.sendKeys("yayka@yandex.ru");
        WebElement password = driver.findElement(By.name("pass"));
        password.click();
        password.sendKeys("j43-fnm-vNs-ZAQ");
        WebElement getIn = driver.findElement(By.xpath("//*[@id=\"loginAuthForm\"]/button"));
        getIn.click();




        driver.quit();
    }


}
