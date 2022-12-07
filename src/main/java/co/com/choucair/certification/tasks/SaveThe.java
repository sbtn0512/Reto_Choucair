package co.com.choucair.certification.tasks;

import co.com.choucair.certification.models.DataOrder;
import co.com.choucair.certification.userinterfaces.InitialPage;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.time.LocalDateTime;
import java.util.List;

import static co.com.choucair.certification.userinterfaces.OrderPage.*;
import static co.com.choucair.certification.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.*;

public class SaveThe implements Task {

    private DataTable dataOrder;

    public SaveThe(DataTable dataOrder) {
        this.dataOrder = dataOrder;
    }

    public static SaveThe newOrder(DataTable dataOrder) {
        return instrumented(SaveThe.class, dataOrder);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LocalDateTime datetime = LocalDateTime.now();
        String requiredDate;
        String orderDate = datetime.getDayOfMonth() + "" + datetime.getMonthValue() + "" + datetime.getYear();
        if(datetime.getDayOfMonth() < 25)
            requiredDate = datetime.getDayOfMonth()+3 + "" + datetime.getMonthValue() + "" + datetime.getYear();
        else
            requiredDate =  "06" + datetime.getMonthValue() + "" + datetime.getYear();
        actor.attemptsTo(
                Click.on(CUSTOMER_FIELD),
                Enter.theValue(dataOrder.cell(1,0)).into(CUSTOMER_TEXT),
                Click.on(CUSTOMER_OPTION),
                Enter.theValue(orderDate).into(ORDER_DATE).thenHit(TAB),
                Enter.theValue(requiredDate).into(REQUIRED_DATE).thenHit(TAB),
                Click.on(EMPLOYEE_FIELD),
                Enter.theValue(dataOrder.cell(1,1)).into(EMPLOYEE_TEXT),
                Click.on(EMPLOYEE_OPTION),
                Click.on(NEW_ORDER_DETAIL),
                Click.on(PRODUCT_FIELD),
                Enter.theValue(dataOrder.cell(1,2)).into(PRODUCT_TEXT),
                Click.on(PRODUCT_OPTION),
                Click.on(SAVE_ORDER_DETAIL),
                Click.on(SHIPPING),
                Enter.theValue(requiredDate).into(SHIPPED_DATE).thenHit(TAB),
                Click.on(SHIP_VIA_FIELD),
                Enter.theValue(dataOrder.cell(1,3)).into(SHIP_VIA_TEXT),
                Click.on(SHIP_VIA_OPTION),
                Enter.theValue(dataOrder.cell(1,4)).into(FREIGHT),
                Enter.theValue(dataOrder.cell(1,5)).into(SHIP_NAME),
                Enter.theValue(dataOrder.cell(1,6)).into(SHIP_ADDRESS),
                Enter.theValue(dataOrder.cell(1,7)).into(SHIP_CITY),
                Enter.theValue(dataOrder.cell(1,8)).into(SHIP_REGION),
                Enter.theValue(dataOrder.cell(1,9)).into(SHIP_COUNTRY),
                Click.on(SAVE_NEW_ORDER),
                Click.on(SHIPPING_STATE_FIELD),
                Click.on(SHIPPING_STATE_OPTION)
        );
        actor.remember(CREATED_ORDER,dataOrder);
    }
}
