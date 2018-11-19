package myprojects.automation.assignment3.tests;

import myprojects.automation.assignment3.BaseScript;
import myprojects.automation.assignment3.GeneralActions;
import org.openqa.selenium.WebDriver;

public class CreateCategoryTest extends BaseScript {
    public static void main(String[] args) throws InterruptedException {
        // TODO prepare driver object

        WebDriver driver = BaseScript.getConfiguredDriver("firefox");
        driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        // login
        GeneralActions login = new GeneralActions(driver);
        login.login("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw" );

        // create category
        GeneralActions newCategory = new GeneralActions(driver);
        newCategory.createCategory("Тест17");

        // check that new category appears in Categories table

        // finish script
        driver.quit();
    }
}
