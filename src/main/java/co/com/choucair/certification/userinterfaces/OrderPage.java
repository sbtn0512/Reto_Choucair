package co.com.choucair.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    public static final Target NEW_ORDER_BUTTON = Target.the("button to make a new order").
            located(By.className("add-button"));
    public static final Target CUSTOMER_FIELD = Target.the("field to enter the customer").
            located(By.id("select2-chosen-8"));
    public static final Target CUSTOMER_TEXT = Target.the("field to search for the customer").
            located(By.id("s2id_autogen8_search"));
    public static final Target CUSTOMER_OPTION = Target.the("customer selection").
            located(By.id("select2-results-8"));
    public static final Target ORDER_DATE = Target.the("Date of the order").
            located(By.id("Serenity_Demo_Northwind_OrderDialog15_OrderDate"));
    public static final Target REQUIRED_DATE = Target.the("required date").
            located(By.id("Serenity_Demo_Northwind_OrderDialog15_RequiredDate"));
    public static final Target EMPLOYEE_FIELD = Target.the("field to enter the employee").
            located(By.id("select2-chosen-9"));
    public static final Target EMPLOYEE_TEXT = Target.the("field to search for the employee").
            located(By.id("s2id_autogen9_search"));
    public static final Target EMPLOYEE_OPTION = Target.the("employee selection").
            located(By.id("select2-results-9"));
    public static final Target NEW_ORDER_DETAIL = Target.the("new order detail").
            locatedBy("//span[contains(text(),' Nuevo Order Detail')]");
    public static final Target PRODUCT_FIELD = Target.the("field to enter the product").
            located(By.id("select2-chosen-448"));
    public static final Target PRODUCT_TEXT = Target.the("field to search for the product").
            located(By.id("s2id_autogen448_search"));
    public static final Target PRODUCT_OPTION = Target.the("product selection").
            located(By.id("select2-results-448"));
    public static final Target SAVE_ORDER_DETAIL = Target.the("save order detail").
            locatedBy("//div[@id='Serenity_Demo_Northwind_OrderDetailDialog33_Toolbar']//child::span[contains(text(),' Guardar')]");
    public static final Target SHIPPING = Target.the("Shipping").
            locatedBy("//a[contains(text(),'Shipping')]");
    public static final Target SHIPPED_DATE = Target.the("shipped date").
            located(By.id("Serenity_Demo_Northwind_OrderDialog15_ShippedDate"));
    public static final Target SHIP_VIA_FIELD = Target.the("field to enter the product").
            located(By.id("select2-chosen-10"));
    public static final Target SHIP_VIA_TEXT = Target.the("field to search for the product").
            located(By.id("s2id_autogen10_search"));
    public static final Target SHIP_VIA_OPTION = Target.the("product selection").
            located(By.id("select2-results-10"));
    public static final Target FREIGHT = Target.the("Freight").
            located(By.id("Serenity_Demo_Northwind_OrderDialog15_Freight"));
    public static final Target SHIP_NAME = Target.the("Ship name").
            located(By.id("Serenity_Demo_Northwind_OrderDialog15_ShipName"));
    public static final Target SHIP_ADDRESS = Target.the("Ship address").
            located(By.id("Serenity_Demo_Northwind_OrderDialog15_ShipAddress"));
    public static final Target SHIP_CITY = Target.the("Ship city").
            located(By.id("Serenity_Demo_Northwind_OrderDialog15_ShipCity"));
    public static final Target SHIP_REGION = Target.the("Ship region").
            located(By.id("Serenity_Demo_Northwind_OrderDialog15_ShipRegion"));
    public static final Target SHIP_COUNTRY = Target.the("Ship country").
            located(By.id("Serenity_Demo_Northwind_OrderDialog15_ShipCountry"));
    public static final Target SAVE_NEW_ORDER = Target.the("Save new order").
            locatedBy("//div[@id='Serenity_Demo_Northwind_OrderDialog15_Toolbar']//child::span[contains(text(),' Guardar')]");
    public static final Target SHIPPING_STATE_FIELD = Target.the("field to enter the shipping state").
            located(By.id("s2id_Serenity_Demo_Northwind_OrderGrid0_QuickFilter_ShippingState"));
    public static final Target SHIPPING_STATE_OPTION = Target.the("shipping state selection").
            locatedBy("//div[text() = 'Shipped']");
    public static final Target ROW = Target.the("row with the information of the last order").
            locatedBy("//div[@class = 'ui-widget-content slick-row even'][1]");
}
