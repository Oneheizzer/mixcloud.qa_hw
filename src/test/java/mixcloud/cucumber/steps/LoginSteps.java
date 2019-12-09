package mixcloud.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps {
    @Managed  WebDriver driver;


    @Test

    @Given("^User navigates to mixcloud website$")
    public void user_navigates_to_mixcloud_website() {
        driver.get("https://www.mixcloud.com/");
        this.driver.manage().window().maximize();
    }

    @Step
    @When("^User clicks on the login button on homepage$")
    public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(), 'Log in')]")).click();
    }

    @Step
    @When("^User enters a valid username \"([^\"]*)\"$")
    public void user_enters_a_valid_username(String username) {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]//div/form/div[1]//input")).sendKeys(username);


    }
    @Step
    @When("^User enters a valid password \"([^\"]*)\"$")
    public void user_enters_a_valid(String password) {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]//div/form/div[2]//input")).sendKeys(password);

    }
    @Step
    @When("^User clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).submit();

    }
    @Step
    @Then("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable {
        Thread.sleep(5000);
        WebElement Petya=driver.findElement(By.xpath("//span[contains(text(), 'OneQA')]"));
        Assert.assertEquals(true,  Petya.isDisplayed());
    }
    @When("^User clicks on search field$")
    public void user_clicks_on_search_field() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/header/div/div[2]/input")).sendKeys("Martin Garrix");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/header/div/div[2]/input")).click();
    }

    @When("^User enter a valid author$")
    public void user_enter_a_valid_author() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/div[1]/div/div/section/div[1]/div[2]/div[2]/section/div/ul/li[1]/span/b/span[1]/a")).click();
        driver.
    }


    @Then("^User should be at the author page$")
    public void user_should_be_at_the_author_page() throws Throwable {
        Thread.sleep(5000);
        WebElement AuthorName=driver.findElement(By.xpath("//span[contains(text(), 'Martin Garrix')]"));
        Assert.assertEquals(true,  AuthorName.isDisplayed());
    }

    @When("^User clicks on play button$")
    public void user_clicks_on_play_button() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/div/div/div[2]/section/div/div[1]/div/button")).click();
    }
    @When("^User marks a favorite music$")
    public void user_marks_a_favorite_music() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/div/div/div[4]/main/div[1]/div/div/div/section[1]/aside/div/div/button[1]")).click();
    }

    @When("^User checks a favorite playlist$")
    public void user_checks_a_favorite_playlist() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/header/div/div[3]/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/header/div/div[3]/div[1]/span/div/div/ul/li[1]/a")).click();
    }

    @Then("^User should be able to see a favorite music$")
    public void user_should_be_able_to_see_a_favorite_music() throws Throwable {
        WebElement AuthorName=driver.findElement(By.xpath("//span[contains(text(), 'Martin Garrix Show')]"));
        Assert.assertEquals(true,  AuthorName.isDisplayed());
    }

    @When("^User deletes a favorite music from a favorite playlist$")
    public void user_deletes_a_favorite_music_from_a_favorite_playlist() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/div/div/div[4]/main/div[1]/div/div/div/section/span")).click();
    }


}

