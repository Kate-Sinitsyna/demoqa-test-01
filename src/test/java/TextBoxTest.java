import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxTest {

        @BeforeAll
        static void setConfig() {
            Configuration.browserSize = "1920x1080";
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.pageLoadStrategy = "eager";
            Configuration.holdBrowserOpen = true;
            //Configuration.pageLoadTimeout = 1000;
        }

        @Test
        void fillFormTest() {

            open("/text-box");
            $("#userName").setValue("Kitty");
            $("#userEmail").setValue("kitty@gmail.com");
            $("#currentAddress").setValue("11250 E STATE ROUTE 69 DEWEY AZ 86327-4422 USA");
            $("#permanentAddress").setValue("PO BOX 705 IRELAND IN 47545-0705 USA");
            $("#submit").click();

            $("#output").$("#name").shouldHave(text("Kitty"));
            $("#output").$("#email").shouldHave(text("kitty@gmail.com"));
            $("#output").$("#currentAddress").shouldHave(text("11250 E STATE ROUTE 69 DEWEY AZ 86327-4422 USA"));
            $("#output").$("#permanentAddress").shouldHave(text("PO BOX 705 IRELAND IN 47545-0705 USA"));

        }

        @Test
         void fillPracticeFormTest() {
            open("/automation-practice-form");
            executeJavaScript("$('footer').remove();");
            executeJavaScript("$('#fixedban').remove();");
            $("#firstName").setValue("Alex");
            $("#userEmail").setValue("alex@gmail.com");
            $("#lastName").setValue("Saegn");
            $("label[for='gender-radio-2']").click();
            $("#userNumber").setValue("7846586867");
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").$(byText("July")).click();
            $(".react-datepicker__year-select").$(byText("1980")).click();
            $(".react-datepicker__day--026").click();
            $("#subjectsInput").setValue("123");
            $("label[for='hobbies-checkbox-1']").click();
            $("#uploadPicture").uploadFromClasspath("example.jpeg");
            $("#currentAddress").setValue("11250 E STATE ROUTE 69 DEWEY AZ 86327-4422 USA");
            $("#state").click();
            $("#react-select-3-input").setValue("NCR").click();
            $("#city").click();
            $("#city").$(byText("Merrut")).click();
            //$(byText("Delhi")).shouldBe(visible).click();
            //$("#react-select-4-input").shouldBe(editable);
            // $("#react-select-4-input").setValue("Delhi");
            $("#submit").click();
        }

    }
