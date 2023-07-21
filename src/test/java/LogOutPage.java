import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LogOutPage {

    private SelenideElement buttonIcon = $x("//img[@class = 'user-pic__image']");
    private SelenideElement logOut = $x("//a[@aria-label='Выйти из аккаунта']");

    public void logOutClick(){
        buttonIcon.click();
        logOut.click();
    }

}
