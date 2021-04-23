package assignment01day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wellsfargo.com");
        driver.findElement(By.xpath("//div[@class='formElementsWrapper formElementsUsername']/input")).sendKeys("anim@gmail.com");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("anim12345");
        driver.findElement(By.xpath("//input[@value='Sign On']")).click();

    }
}
