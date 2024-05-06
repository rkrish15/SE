import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingSelenium {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        // Create ChromeDriver instance
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open LinkedIn login page
        driver.get("https://www.linkedin.com/login");

        // Find username, password, and login elements
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//button[text()='Sign in']"));

        // Enter credentials and click login
        username.sendKeys("preethi92.mit@gmail.com");
        password.sendKeys("password");
        login.click();

        // Verify login success by comparing current URL with expected URL
        String actualUrl = "https://www.linkedin.com/feed/";
        String expectedUrl = driver.getCurrentUrl();

        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
