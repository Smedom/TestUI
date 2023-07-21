package Page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
/**
 * Главная страница сайта https://360.yandex.ru/disk/
 */
public class MainPage {
    private SelenideElement loginButton = $("#header-login-button");


    public MainPage(String url){
        Selenide.open(url);
    }

    public void goToLoginPage(){
        loginButton.click();
    }

}
