package co.com.choucair.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static co.com.choucair.certification.utils.Constants.URL;

@DefaultUrl(URL)
public class HomePage extends PageObject {
    public static final Target MORE_INFO_ORDER = Target.the("more information about orders").
            locatedBy("//p[contains(text(),'Open Orders')]//parent::div//following-sibling::a");
}
