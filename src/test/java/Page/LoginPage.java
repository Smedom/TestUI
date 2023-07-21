package Page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
/**
 *Страница авторизации в Яндекс Диске
 */
public class LoginPage {
    private final static String login = "uuser1user";

    private final static String password = "123User456";

    private SelenideElement emailButton = $x("//div[@class = 'AuthLoginInputToggle-type']");
    private SelenideElement inputLogin = $x("//input[@class='Textinput-Control']");
    private SelenideElement buttonSignupLogin = $x("//*[@id='passp:sign-in']");
    private SelenideElement inputPassword = $x("//*[@id='passp-field-passwd']");
    private SelenideElement buttonSignupPassword = $x("//*[@id='passp:sign-in']");

    public void goToDiskPage(){
        emailButton.click();
        inputLogin.setValue(login);
        buttonSignupLogin.click();
        inputPassword.setValue(password);
        buttonSignupPassword.click();
    }
}
