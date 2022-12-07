package co.com.choucair.certification.tasks;

import co.com.choucair.certification.interactions.Logging;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.userinterfaces.HomePage.MORE_INFO_ORDER;
import static co.com.choucair.certification.userinterfaces.OrderPage.NEW_ORDER_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {
    public static GoTo orders() {
        return instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Logging.thePage(),
                Click.on(MORE_INFO_ORDER),
                Click.on(NEW_ORDER_BUTTON));
    }
}
