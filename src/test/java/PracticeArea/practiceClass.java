package PracticeArea;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class practiceClass {

        @Managed
        WebDriver driver;

        @Test
        public void baseTest(){
//            System.setProperty("webdriver.chrome.driver","E:\\Learning\\Selenium WebDriver\\Installations\\chromedriver.exe");
//            WebDriver driver = new ChromeDriver();
            driver.get("https://ceasers.pythonanywhere.com/");
            driver.quit();
        }




    }
