package assignment01day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllFooter {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alibaba.com");
        Thread.sleep(2000);
        List<WebElement> footers = driver.findElements(By.xpath("//div[@class='ui-footer-sitemap util-clearfix']/div/dl/dd/a"));
        for(WebElement site : footers){
            System.out.println(site.getText());
        }

    }
}
