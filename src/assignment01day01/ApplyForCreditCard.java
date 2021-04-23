package assignment01day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyForCreditCard {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wellsfargo.com");
        driver.findElement(By.xpath("//a[@id='tabNavSmallBusiness']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='taskbar']/div/ul/li[3]/div/div/a")).click();
        driver.findElement(By.xpath("//a[@id='NID1_12_1_1_2_1_1_2_2_1_3_2_1']")).click();

    }
}
