package assignment01day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class=\"navLeftFooter nav-sprite-v1\"]/div/div/div[3]/ul/li/a")).click();
    }
}
