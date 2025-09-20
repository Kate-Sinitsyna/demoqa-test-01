import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTestWithPageObjects extends TestBase{
    TextBoxPage textBoxPage = new TextBoxPage();


        @Test
        void fillFormTest() {
            textBoxPage.openPage()
                    .deleteAds()
                    .setName("Kitty")
                    .setUserEmail("kitty@gmail.com")
                    .setCurrentAddress("11250 E STATE ROUTE 69 DEWEY AZ 86327-4422 USA")
                    .setPermanentAddress("PO BOX 705 IRELAND IN 47545-0705 USA")
                    .submitForm()
                    .checkNameField("Kitty")
                    .checkEmailField("kitty@gmail.com")
                    .checkCurrentAddressField("11250 E STATE ROUTE 69 DEWEY AZ 86327-4422 USA")
                    .checkPermanentAddressField("PO BOX 705 IRELAND IN 47545-0705 USA");
        }
    }
