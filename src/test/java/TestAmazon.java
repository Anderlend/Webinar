import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestAmazon {

    @Test
    public void checkJava(){
        System.out.println("Sup");
        System.setProperty("webdriver.chrome.diver", "C:\\Users\\Andrii\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
         /*driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        driver.quit();*/
    }
}
