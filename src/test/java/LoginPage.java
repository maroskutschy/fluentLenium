import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

@PageUrl( "http://www.facebook.com" )
public class LoginPage extends FluentPage {

  @FindBy(id = "email")
  private FluentWebElement email;

  @FindBy (id = "pass")
  private FluentWebElement password;

  @FindBy (xpath = "//input[@data-testid='royal_login_button']")
  private FluentWebElement loginButton;

  public LoginPage typeEmail(String emailAddress) {
    email.write( emailAddress );
    return this;
  }

  public LoginPage typePassword(String passwordForEmail) {
    password.write( passwordForEmail );
    return this;
  }

  public LoginPage clickOnLogin() {
    loginButton.submit();
    return this;
  }

  public void assertPageTitle (String pageTitle) {
    assertThat(window().title()).contains( pageTitle );
  }



}
