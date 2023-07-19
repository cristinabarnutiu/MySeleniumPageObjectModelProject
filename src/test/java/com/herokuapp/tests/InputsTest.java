package com.herokuapp.tests;

import com.herokuapp.pages.InputsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.InputsPage.INPUTS_URL;

public class InputsTest extends BaseTest{
    @Test
    public void inputNumberAndCheckValue(){
        driver.get(INPUTS_URL);
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.enterNumber("1234567890");
        String actualValue = inputsPage.returnNumberInputValue();
        Assert.assertEquals("1234567890",actualValue);
    }
}
