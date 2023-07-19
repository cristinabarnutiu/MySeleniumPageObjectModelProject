package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPage extends BasePage{

    public static String INPUTS_URL = BASE_URL+"inputs";
    public InputsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@type=\"number\"]") private WebElement numberInput;

    public void enterNumber(String number){
        numberInput.sendKeys(number);
    }

    public String returnNumberInputValue(){
        return numberInput.getAttribute("value");
    }
}
