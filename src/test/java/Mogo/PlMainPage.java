package Mogo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is my first test for Mogo.pl
 */
public class PlMainPage {
    private String MAIN_PAGE_PL = "https://www.mogo.pl";

    @Test
    public void mogoPL() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kristine.ivanova/downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(MAIN_PAGE_PL);
        driver.quit();
    }
}