import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SSdemo {


    @Test
    public void sslvKuceni() {
        String driverPath = "C:\\Users\\lvaleist\\IdeaProjects\\Lecture19Groupe4\\src\\main\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv/lv");
        driver.findElement(By.id("mtd_300")).click();
        driver.findElement(By.id("f_o_8_min")).sendKeys("4");
        driver.findElement(By.id("f_o_1276_min")).sendKeys("1");
        driver.findElement(By.id("f_o_1276_max")).sendKeys("5");
    }
        @Test
        public void sslvCars() {
            String driverPath = "C:\\Users\\lvaleist\\IdeaProjects\\Lecture19Groupe4\\src\\main\\resources\\";
            System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.ss.lv/lv");
            driver.findElement(By.id("mtd_97")).click();
            Select yearMin = new Select(driver.findElement(By.id("f_o_18_min")));
            yearMin.selectByVisibleText("2007");
        }

            @Test
            public void sslvCarsFind(){
                String driverPath = "C:\\Users\\lvaleist\\IdeaProjects\\Lecture19Groupe4\\src\\main\\resources\\";
                System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
                ChromeDriver driver = new ChromeDriver();
                driver.get("https://www.ss.lv/lv");
                driver.findElement(By.id("mtd_97")).click();
                driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
                driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
                Select yearMin = new Select(driver.findElement(By.id("f_o_18_min")));
                yearMin.selectByVisibleText("2001");
                Select engineMax = new Select(driver.findElement(By.id("f_o_15_max")));
                engineMax.selectByVisibleText("3.0");
                driver.findElement(By.id("f_o_17")).sendKeys("Balta");

               driver.findElement(By.xpath("//input[@class='b s12']")).click();
               //driver.findElement(By.cssSelector("input[class='b s12']")).click();

    //driver.quit();



               // driver.findElement(By.xpath("//img[@class='btn-close']")).click();


            }

}

