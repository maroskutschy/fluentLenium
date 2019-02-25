import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.domain.FluentWebElement;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookTest extends ChromeConfig{
//
//  // Overrides the default driver
//  @Override
//  public WebDriver getDefaultDriver() {
//    System.setProperty("webdriver.chrome.driver", "C:/chromeDriver/chromedriver.exe"); // Set for ChromeDriver
//    driver = new ChromeDriver();
//    return driver;
//  }

  @FindBy (id = "email")
  private FluentWebElement email;

  @FindBy (id = "pass")
  private FluentWebElement password;

  @FindBy (xpath = "//input[@data-testid='royal_login_button']")
  private FluentWebElement loginButton;

  @Test
  public void login() {
    goTo ("http://www.facebook.com");
    email.write( "jasecuframework@gmail.com" );
    password.write( "Jasecu12" );
    loginButton.submit();
  }



}
