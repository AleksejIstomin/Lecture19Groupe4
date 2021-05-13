import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AliexpressTestHomeWork19 {

    @Test
    public void aliExpress () {
        String driverPath = "C:\\Users\\lvaleist\\IdeaProjects\\Lecture19Groupe4\\src\\main\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");

        // var1 - xpath
        driver.findElement(By.xpath("//img[@class='btn-close']")).click();
        driver.findElement(By.xpath("//img[@class='_24EHh']")).click();
        driver.findElement(By.xpath("//input[@class='search-key']")).sendKeys("tattoo");
        driver.findElement(By.xpath("//input[@class='search-button']")).click();

        // var2 - CssSelector
        driver.findElement(By.cssSelector("input[placeholder='min']")).sendKeys("10");
        driver.findElement(By.cssSelector("input[placeholder='max']")).sendKeys("20");
        driver.findElement(By.cssSelector("a[class='ui-button narrow-go']")).click();

        driver.quit();

    }
}

//ended in 23:30 13/05/2021 :)
