import org.junit.jupiter.api.Test;

public class FirstTest extends BaseTest {

    private final static String BASE_URL = "https://360.yandex.ru/disk/";

    @Test
    public void actionsDisk() {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.goToLoginPage();

        LoginPage loginPage = new LoginPage();
        loginPage.goToDiskPage();

        DiskPage diskPage = new DiskPage();
        diskPage.logDiskPage();

        LogOutPage logOutPage = new LogOutPage();
        logOutPage.logOutClick();

    }

}


