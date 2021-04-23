package assignment01day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindATM {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wellsfargo.com");
        driver.findElement(By.xpath("//div[@id='topSearch']/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//input[@name='searchTxt']")).sendKeys("Boston");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
