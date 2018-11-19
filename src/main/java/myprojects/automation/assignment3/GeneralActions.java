package myprojects.automation.assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {
    private WebDriver driver;
    private WebDriverWait wait;

    public GeneralActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    /**
     * Logs in to Admin Panel.
     * @param login
     * @param password
     */
    public void login(String login, String password) {

        WebDriver driver = this.driver;
        driver.findElement(By.id("email")).sendKeys(login);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.name("submitLogin")).click();
        driver.findElement(By.id("employee_infos")).click();
        driver.findElement(By.id("header_logout")).click();
        //throw new UnsupportedOperationException();
    }

    /**
     * Adds new category in Admin Panel.
     * @param categoryName
     */
    public void createCategory(String categoryName) {


        driver.findElement(By.id("subtab-AdminCatalog")).click();
        driver.findElement(By.xpath("/html/body/nav/ul/li[4]/ul/li[2]/a")).click();
        waitForContentLoad();
        driver.findElement(By.id("page-header-desc-category-new_category")).click();
        waitForContentLoad();
        driver.findElement(By.xpath("//*[@id=\"name_1\"]")).sendKeys("25025Category");
        driver.findElement(By.id("category_form_submit_btn")).click();
        waitForContentLoad();

        throw new UnsupportedOperationException();

    }

    /**
     * Waits until page loader disappears from the page
     */
    public void waitForContentLoad() {

        WebDriverWait wait = new WebDriverWait(driver, 10/*seconds*/);
        wait.until(presenceOfElementLocated(By.id("page-header-desc-category-new_category")));

    }

}
