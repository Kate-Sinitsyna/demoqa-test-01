package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {
    private SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton =  $("#submit"),
            checkName = $("#output").$("#name"),
            checkEmail = $("#output").$("#email"),
            checkCurrentAddress =  $("#output").$("#currentAddress"),
            checkPermanentAddress = $("#output").$("#permanentAddress");

    public TextBoxPage openPage(){
        open("/text-box");
        executeJavaScript("$('footer').remove();");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }
    public TextBoxPage setName(String value){
        userNameInput.setValue(value);

        return this;
    }
    public TextBoxPage setUserEmail(String value){
        userEmailInput.setValue(value);

        return this;
    }
    public TextBoxPage setCurrentAddress(String value){
        currentAddressInput.setValue(value);

        return this;
    }
    public TextBoxPage setPermanentAddress(String value){
        permanentAddressInput.setValue(value);

        return this;
    }
    public TextBoxPage submitForm(){
        submitButton.click();

        return this;
    }
    public TextBoxPage checkNameField(String value){
        checkName.shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkEmailField(String value){
        checkEmail.shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkCurrentAddressField(String value){
        checkCurrentAddress.shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkPermanentAddressField(String value){
        checkPermanentAddress.shouldHave(text(value));

        return this;
    }
}
