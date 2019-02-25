import org.fluentlenium.adapter.junit.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConfig extends FluentTest {

  @Override
  public WebDriver newWebDriver() {
    System.setProperty( "webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe" );
    return new ChromeDriver();
  }


}
