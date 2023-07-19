package ro.azimutvision.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CursuriClujPage extends BasePage{
    public static String CURSURICLUJ_URL = BASE_URL+"cursuri-la-cluj/";

    public CursuriClujPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()=\"Acreditat\"]") private WebElement checkboxAcreditat;
    @FindBy(xpath = "//*[@value=\"100\"]") private WebElement checkbox100;
    @FindBy(id="title") private WebElement titlu;
    @FindBy (linkText = "Curs Software Tester (Manual + Automation) Cluj-Napoca – ACREDITAT") private WebElement cursTestingManualAuto;
    @FindBy(linkText = "Program de Pregătire Front-End Web Developer – Cluj-Napoca – ACREDITAT") private WebElement cursFrontEnd;
    public void checkAcreditat(){
        checkboxAcreditat.click();
    }

    public void checkCheckbox100(){
        checkbox100.click();
    }

    public boolean checkIfAccreditedIsChecked(){
        String checkedValue = checkboxAcreditat.getAttribute("checked");
        System.out.println(checkedValue);
        return (checkedValue=="checked");
    }
    public boolean checkIf100IsChecked(){
        return checkbox100.isSelected();
    }

    public String getTitleText(){
        return titlu.getText();
    }

    public boolean checkCurstTestareIsPresent(){
        return cursTestingManualAuto.isDisplayed();
    }

    public boolean checkCursFrontEndIsPresent(){
        return cursFrontEnd.isDisplayed();
    }
}
