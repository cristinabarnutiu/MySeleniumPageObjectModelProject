package ro.azimutvision.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ro.azimutvision.pages.CursuriClujPage;

import static ro.azimutvision.pages.CursuriClujPage.CURSURICLUJ_URL;

public class CursuriClujTest extends BaseTest{
    @Test
    public void searchAccreditedCoursesInCluj(){
        driver.get(CURSURICLUJ_URL);
        CursuriClujPage cursuriClujPage = new CursuriClujPage(driver);
        cursuriClujPage.checkAcreditat();
        waitForNumberOfSeconds(3);
        //Assert.assertTrue(cursuriClujPage.checkIfAccreditedIsChecked());
        waitForNumberOfSeconds(3);
        cursuriClujPage.checkCheckbox100();
        Assert.assertTrue(cursuriClujPage.checkIf100IsChecked());
        Assert.assertTrue(cursuriClujPage.getTitleText().contains("Cursuri la Cluj"));
        Assert.assertTrue(cursuriClujPage.checkCurstTestareIsPresent());
        Assert.assertTrue(cursuriClujPage.checkCursFrontEndIsPresent());

    }
}
