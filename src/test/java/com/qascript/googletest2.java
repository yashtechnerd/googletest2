import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class googletest2 {
    public static void main(String[] args) {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashwanth.s\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Find the search input field by name and enter "Selenium test"
        driver.findElement(By.name("q")).sendKeys("Selenium test");

        // Submit the form (press Enter)
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        // Wait for a while (you might want to use explicit waits in practice)
        try {
            Thread.sleep(2000); // Sleep for 2 seconds to see the search results
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Refresh the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }
}
