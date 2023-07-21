package Page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Авторизованная страница Яндекс Диска
 */
public class DiskPage {
    private SelenideElement copyFile = $x("//div[@aria-label='Файл для копирования.docx']");
    private SelenideElement buttonCopy = $x("//button[@aria-label='Копировать']");
    private SelenideElement newPackage = $x("//div[@title='Новая папка']");
    private SelenideElement buttonActionCopy = $x("//*[@class='Button2 Button2_view_action Button2_size_m confirmation-dialog__button confirmation-dialog__button_submit ']");
    private SelenideElement listingItemNewPackage = $x("//div[@class='listing__items']//div[@aria-label='Новая папка']");
    private SelenideElement listingItemFile = $x("//div[@class='listing__items']//div[@aria-label='Новый документ.docx']");
    private SelenideElement buttonDelete =  $x("//button[@aria-label='Удалить']");


    public void logDiskPage(){
        copyFile.click();
        buttonCopy.click();
        newPackage.click();
        buttonActionCopy.click();
        listingItemNewPackage.doubleClick();
        listingItemFile.click();
        buttonDelete.click();
        copyFile.shouldBe(visible);

    }
}
