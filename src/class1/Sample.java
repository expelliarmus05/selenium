package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","G:\\COURSE\\ideaProjects\\selenium\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://fb.com");
    System.out.println(driver.getTitle());
    }
}
