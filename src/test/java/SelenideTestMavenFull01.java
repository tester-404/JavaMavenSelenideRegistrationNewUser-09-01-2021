import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTestMavenFull01 {

    @BeforeEach
    public void setup(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("http://automationpractice.com");
    }

    @Test
    public void userReg(){
        //specify the email for registration
        element(By.linkText("Sign in")).click();
        element(By.xpath("//input[@id='email_create']")).setValue("Blouse3@dfc.com");
        element(By.id("SubmitCreate")).click();

        //fill out the registration form
        element(By.id("id_gender2")).click();
        element(By.xpath("//input[@id='customer_firstname']")).setValue("Anastasia");
        element(By.id("customer_lastname")).setValue("Selenide");
        element(By.xpath("//input[@id='passwd']")).setValue("passWORD123");
        element(By.id("uniform-days")).click();
        element(By.xpath("//div[1]/select[1]/option[6]")).click();
        element(By.id("uniform-months")).click();
        element(By.xpath("//option[contains(text(),'May')]")).click();
        element(By.id("uniform-years")).click();
        element(By.xpath("//option[contains(text(),'1900')]")).click();
        element(By.xpath("//input[@id='newsletter']")).click();
        element(By.xpath("//input[@id='optin']")).click();
        element(By.xpath("//input[@id='company']")).setValue("Google Ltd");
        element(By.xpath("//input[@id='address1']")).setValue("Main Street 1A");
        element(By.xpath("//input[@id='address2']")).setValue("Office 757 B");
        element(By.xpath("//input[@id='city']")).setValue("New York");
        element(By.id("id_state")).click();
        element(By.xpath("//option[contains(text(),'Florida')]")).click();
        element(By.xpath("//input[@id='postcode']")).setValue("12355");
        element(By.id("id_country")).click();
        element(By.xpath("//option[contains(text(),'United States')]")).click();
        element(By.xpath("//input[@id='phone']")).setValue("3330002225");
        element(By.xpath("//input[@id='phone_mobile']")).setValue("+15660002225");
        element(By.xpath("//button[@id='submitAccount']")).click();

    }
}
