
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.Test;

@Wait
public class FacebookTest extends ChromeConfig{

  @Page
  LoginPage loginPage;

  @Test
  public void loginTest() {
    String emailAddress = "jasecuframework@gmail.com";
    String passwordForEmail = "Jasecu12";
    String pageTitle = "Facebook";

    goTo( loginPage )
        .typeEmail( emailAddress )
        .typePassword( passwordForEmail )
        .clickOnLogin()
        .assertPageTitle( pageTitle );

  }

  //  @FindBy (id = "email")
  //  private FluentWebElement email;
  //
  //  @FindBy (id = "pass")
  //  private FluentWebElement password;
  //
  //  @FindBy (xpath = "//input[@data-testid='royal_login_button']")
  //  private FluentWebElement loginButton;
  //
  //  @Test
  //  public void login() {
  //    goTo ("http://www.facebook.com");
  //    email.write( "jasecuframework@gmail.com" );
  //    password.write( "Jasecu12" );
  //    loginButton.submit();
  //    assertThat(window().title()).contains( "Facebook" );
  //  }


}
